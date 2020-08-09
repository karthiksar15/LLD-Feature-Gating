import java.util.HashMap;
import java.util.Map;

public class Config {
	
	public static Map<String,String> conditionExpressions;
	
	public void setConditionExpressions(Map<String, String> conditionExpressions) {
		this.conditionExpressions = conditionExpressions;
	}

	public static Map<String, String> getConditionExpressions() {
		return conditionExpressions;
	}
	

}
