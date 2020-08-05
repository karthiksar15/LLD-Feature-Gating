import java.util.Map;
import java.util.Stack;

public class Util {
	
	public static boolean isAllowed(String expression,Map<String,Object> user)
	{
		Infix inf=new Infix();
		boolean check=inf.evaluate(expression, user);
		return check;
	}

}
