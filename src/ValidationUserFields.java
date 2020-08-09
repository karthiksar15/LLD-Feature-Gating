import java.util.HashMap;
import java.util.Map;

public class ValidationUserFields {
	
	
	
	Map <String,Object> userMp;
	User user=new User();
	

	
	public Map<String,Object> getNameValidation()
	{
		userMp=new HashMap<String, Object>();
		userMp.put(UserConstants.NAME,user.getName());
		return userMp;
	}
	public Map<String,Object> getAgeValidation()
	{
		userMp=new HashMap<String, Object>();
		userMp.put(UserConstants.AGE,user.getAge());
		return userMp;
	}
	public Map<String,Object> getPincodeValidation()
	{
		userMp=new HashMap<String, Object>();
		userMp.put(UserConstants.PINCODE,user.getAddress().getPincode());
		return userMp;
	}
	public Map<String,Object> getGenderValidation()
	{
		userMp=new HashMap<String, Object>();
		userMp.put(UserConstants.GENDER,user.getGender());
		return userMp;
	}

}
