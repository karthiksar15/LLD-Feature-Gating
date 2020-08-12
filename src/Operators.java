import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Operators implements OperatorBase {

	public static String[] relationOperators = { ">", "<", "==", "<=", ">=", "!=" };

	public static int integer_flag = 1;
	public static int string_flag = 2;
	public static int double_flag = 3;
	public static int boolean_flag = 4;

	// Declaring the static map
	public static Map<String, String> logicalMap;

	// Instantiating the static map
	static {
		logicalMap = new HashMap<>();
		logicalMap.put("AND", "&&");
		logicalMap.put("OR", "||");
		logicalMap.put("NOT", "!");
	}

	public  boolean evaluate(String op, String op1, String op2, int dataTypeFlag) {
		boolean chk = false;
	
		
			switch (op) {
			case ">":
				  if(dataTypeFlag==integer_flag)
				  {
					  Integer opInt1 = Integer.parseInt(op1);
					  Integer opInt2 = Integer.parseInt(op2);
				      chk=new Greater(opInt1, opInt1).isResult();
				  }else if(dataTypeFlag == double_flag) {
					  Double opDouble1 = Double.parseDouble(op1);
					  Double opDouble2 = Double.parseDouble(op2);
					  chk=new Greater(opDouble1, opDouble2).isResult();
				  }
				break;
			case "<":
				 if(dataTypeFlag==integer_flag)
				  {
					  Integer opInt1 = Integer.parseInt(op1);
					  Integer opInt2 = Integer.parseInt(op2);
				      chk=new Lesser(opInt1, opInt1).isResult();
				  }else if(dataTypeFlag == double_flag) {
					  Double opDouble1 = Double.parseDouble(op1);
					  Double opDouble2 = Double.parseDouble(op2);
					  chk=new Lesser(opDouble1, opDouble2).isResult();
				  }
				break;
			case "==":
				if(dataTypeFlag==integer_flag)
				  {
					  Integer opInt1 = Integer.parseInt(op1);
					  Integer opInt2 = Integer.parseInt(op2);
				      chk=new EqualTo(opInt1, opInt1).isResult();
				  }else if(dataTypeFlag == double_flag) {
					  Double opDouble1 = Double.parseDouble(op1);
					  Double opDouble2 = Double.parseDouble(op2);
					  chk=new EqualTo(opDouble1, opDouble2).isResult();
				  }
				  else if(dataTypeFlag == string_flag) {
					  chk=new EqualTo(op1, op2).isResult();
				  }
				break;
			case "AND":
				if(dataTypeFlag==boolean_flag)
				  {
					  Boolean opObj1 = Boolean.parseBoolean(op1);
					  Boolean opObj2 = Boolean.parseBoolean(op2);
				      chk=new And(opObj1, opObj2).isResult();
				  }
				break;
				
			case "OR":
				if(dataTypeFlag==boolean_flag)
				  {
					  Boolean opObj1 = Boolean.parseBoolean(op1);
					  Boolean opObj2 = Boolean.parseBoolean(op2);
				      chk=new OR(opObj1, opObj2).isResult();
				  }
				break;
			}

	return chk;
}

//	public static boolean evaluateLogical(String op, boolean op1, boolean op2) {
//		boolean chk = false;
//		switch (op) {
//		case "AND":
//			chk = op1 && op2;
//			break;
//		case "OR":
//			chk = op1 || op2;
//			break;
//		}
//
//		return chk;
//	}

}
