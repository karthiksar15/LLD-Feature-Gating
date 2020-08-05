import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Operators {

	public static String[] relationOperators = { ">", "<", "==", "<=", ">=", "!=" };

	public static int integer_flag = 1;
	public static int string_flag = 2;
	public static int double_flag = 3;

	// Declaring the static map
	public static Map<String, String> logicalMap;

	// Instantiating the static map
	static {
		logicalMap = new HashMap<>();
		logicalMap.put("AND", "&&");
		logicalMap.put("OR", "||");
		logicalMap.put("NOT", "!");
	}

	public static boolean evaluate(String op, String op1, String op2, int dataTypeFlag) {
		boolean chk = false;
		if (dataTypeFlag == integer_flag) {
			Integer opInt1 = Integer.parseInt(op1);
			Integer opInt2 = Integer.parseInt(op2);
			switch (op) {
			case ">":
				chk = (opInt1 > opInt2);
				break;
			case "<":
				chk = (opInt1 < opInt2);
				break;
			case "==":
				chk = (opInt1 == opInt2);
				break;
			}
		}else if (dataTypeFlag == double_flag) {
			Double opDouble1 = Double.parseDouble(op1);
			Double opDouble2 = Double.parseDouble(op2);
			switch (op) {
			case ">":
				chk = (opDouble1 > opDouble2);
				break;
			case "<":
				chk = (opDouble1 < opDouble2);
				break;
			case "==":
				chk = (opDouble1 == opDouble2);
				break;
			}
		}else if(dataTypeFlag == string_flag)
		{
			chk=(op1.equalsIgnoreCase(op2));
		}

		return chk;
	}

	public static boolean evaluateLogical(String op, boolean op1, boolean op2) {
		boolean chk = false;
		switch (op) {
		case "AND":
			chk = op1 && op2;
			break;
		case "OR":
			chk = op1 || op2;
			break;
		}

		return chk;
	}

}
