import java.util.Arrays;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

class Infix {

	public boolean evaluate(String exps, Map<String, Object> user) {
		/** remove if any spaces from the expression **/
		exps = exps.replaceAll("\\s+", "");
		exps = exps.replaceAll("\"+", "");
		exps = exps.replace("(", " ( ");
		exps = exps.replace(")", " ) ");
		/** we assume that the expression is in valid format **/

		for (int i = 0; i < Operators.relationOperators.length; i++) {
			exps = exps.replaceAll(Operators.relationOperators[i], " " + Operators.relationOperators[i] + " ");
		}
		for (String logicalKey : Operators.logicalMap.keySet()) {
			exps = exps.replaceAll(logicalKey, " " + logicalKey + " ");
		}
		System.out.println(exps);

		StringTokenizer tok = new StringTokenizer(exps);
		Stack<String> stack = new Stack();
		Stack<String> logicalStack = new Stack();
		Stack<String> backUpStack = new Stack();
		
		int flag = 0;
		while (tok.hasMoreTokens()) {

			String element = tok.nextToken().toString();
			if (element.equals(UserConstants.AGE)) {
				stack.push(user.get(UserConstants.AGE).toString());
				flag = Operators.integer_flag;
			} else if (element.equals(UserConstants.GENDER)) {
				stack.push(user.get(UserConstants.GENDER) + "");
				flag = Operators.string_flag;
			} else if (element.equals(UserConstants.PAST_AMNT_SPENT)) {
				stack.push(user.get(UserConstants.PAST_AMNT_SPENT).toString());
				flag = Operators.double_flag;
			} else if (Operators.logicalMap.containsKey(element.toUpperCase())) {

				if (logicalStack.size() == 3) {
					String op2 = logicalStack.pop();
					String logOperator = logicalStack.pop();
					String op1 = logicalStack.pop();
					logicalStack.push(Boolean.toString(new Operators().evaluate(logOperator, op1, op2,Operators.boolean_flag)));
					logicalStack.push(element);
				} else {
					logicalStack.push(element.toUpperCase());
				}
			} else if (element.equalsIgnoreCase("(")) {
				if (logicalStack.size() > 0) {
					backUpStack.addAll(logicalStack);
					logicalStack.clear();
				}
			} else if (element.equalsIgnoreCase(")")) {
				if (logicalStack.size() == 3) {
					String op2 = logicalStack.pop();
					String logOperator = logicalStack.pop();
					String op1 = logicalStack.pop();
					logicalStack.push(Boolean.toString(new Operators().evaluate(logOperator,op1, op2,Operators.boolean_flag)));
					if (backUpStack.size() == 2) {
						 op2 = logicalStack.pop();
						 logOperator = logicalStack.pop();
						 op1 = logicalStack.pop();
						logicalStack.push(Boolean.toString(new Operators().evaluate(logOperator, op1, op2,Operators.boolean_flag)));
					}
				}
			} else {

				stack.push(element);
			}
			if (stack.size() == 3) {
				String op2 = stack.pop();
				String op = stack.pop();
				String op1 = stack.pop();
				boolean chk = new Operators().evaluate(op, op1.trim(), op2.trim(), flag);
				logicalStack.push(Boolean.toString(chk));
				if (backUpStack.size() == 2) {
					 op2 = logicalStack.pop();
					 op = backUpStack.pop();
					 op1 = backUpStack.pop();
					logicalStack.push(Boolean.toString(new Operators().evaluate(op, op1, op2,Operators.boolean_flag)));
				}
			}
		}
		boolean retnType = Boolean.parseBoolean(logicalStack.pop());
		// System.out.println("logicalStack--->" + );
		return retnType;

	}
}
