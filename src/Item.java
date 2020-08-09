import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Item {


	
	ValidationUserFields validate=new ValidationUserFields();
	
	public void Validate(User user)
	{
		
			Map<String,String> condMp=Config.getConditionExpressions();
			for(String exp:condMp.keySet())
			{
			Util.isAllowed(condMp.get(exp),getValidationUser(user));
			}
		
	}
	
	public Map<String,Object> getValidationUser(User user)
	{
			Map<String, Object> userMp=new HashMap<String, Object>();
			
			userMp.put(UserConstants.NAME,user.getName());
		
		
			userMp.put(UserConstants.AGE,user.getAge());
			
	
			userMp.put(UserConstants.PINCODE,user.getAddress().getPincode());
		
			userMp.put(UserConstants.GENDER,user.getGender());
			
			return userMp;
		

	}
	
}
