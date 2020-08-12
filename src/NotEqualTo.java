
public class NotEqualTo implements RelationalOperator {

private boolean result;
	
	public NotEqualTo(Integer obj1,Integer obj2)
	{
		
		this.result=obj1 != obj2;
		
	}
	public NotEqualTo(Double obj1,Double obj2)
	{
		
		this.result=obj1 != obj2;
		
	}

	@Override
	public boolean isResult() {
		// TODO Auto-generated method stub
		return result;
	}

}
