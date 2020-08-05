import java.util.HashMap;
import java.util.Map;

public class Config {
	Map<String,String> conditionExpressions;
	
	public void setConditionExpressions(Map<String, String> conditionExpressions) {
		this.conditionExpressions = conditionExpressions;
	}

	public Map<String, String> getConditionExpressions() {
		return conditionExpressions;
	}
	

}
