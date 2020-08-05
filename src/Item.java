import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Item {


	Config config=new Config();
	
	public void Validate(User user)
	{
		
			Map<String,String> condMp=config.getConditionExpressions();
			for(String exp:condMp.keySet())
			{
			Util.isAllowed(condMp.get(exp),getValidationUserMp(user));
			}
		
	}
	
	public Map<String,Object> getValidationUserMp(User user)
	{
			Map<String, Object> userMp=new HashMap<String, Object>();
			
			userMp.put(UserConstants.NAME,user.getName());
		
		
			userMp.put(UserConstants.AGE,user.getAge());
			
	
			userMp.put(UserConstants.PINCODE,user.getAddress().getPincode());
		
			userMp.put(UserConstants.GENDER,user.getGender());
			
			return userMp;
		

	}
	
}
