import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		Infix inf=new Infix();
		User user=new User();
		UserPaymentHistory history=new UserPaymentHistory();
		history.setAmntPayed(5000.0);
		user.setAge(20);
		user.setGender("Male");
		user.setPaymentHistory(history);
		
		Map<String,Object> userMp=new HashMap();
		userMp.put("age", user.getAge());
		userMp.put("gender", user.getGender());
		userMp.put(UserConstants.PAST_AMNT_SPENT, user.getPaymentHistory().getAmntPayed());
		
		
		String exps="age > 25 AND gender==\"Male\" AND pastorderamount>10000";
		System.out.println(inf.evaluate(exps,userMp));
		
		   Class thisClass = ValidationUserFields.class;
           Method[] methods = thisClass.getDeclaredMethods();
           for(Method m:methods)
           {
        	   System.out.println(m.invoke(null, null));
           }
	}

}




//System.out.println("before---"+exps);
//for(int i=0;i<Operators.relationOperators.length;i++)
//{
//	exps = exps.replaceAll(Operators.relationOperators[i], " "+Operators.relationOperators[i]+" ");
//}
//for(String logicalKey:Operators.logicalMap.keySet())
//{
//	exps = exps.replaceAll(logicalKey, " "+logicalKey+" ");
//}
//System.out.println("after---"+exps);
//StringTokenizer tok=new StringTokenizer(exps,"AND OR");
//
//
//
//    List<String> list  = new ArrayList<String>();
//    Field[] fields = Class.forName("UserConstants").getDeclaredFields();
//    for (Field field : fields) {
//        if (field.getType().equals(String.class) && Modifier.isStatic(field.getModifiers())) {
//		    System.out.println("static---"+field.getName());
//		    System.out.println("static values---"+field.get(field.getName()));
//		}
//    }
//   
//
//
//while(tok.hasMoreTokens())
//{
//	System.out.println(tok.nextToken());
//}