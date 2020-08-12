
public class Greater implements RelationalOperator {

	private boolean result;
	
	public Greater(Integer obj1,Integer obj2)
	{
		
		this.result=obj1 > obj2;
		
	}
	public Greater(Double obj1,Double obj2)
	{
		
		this.result=obj1 > obj2;
		
	}

	@Override
	public boolean isResult() {
		// TODO Auto-generated method stub
		return result;
	}
	
	


	


}
