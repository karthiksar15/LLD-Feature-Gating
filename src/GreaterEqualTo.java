
public class GreaterEqualTo implements RelationalOperator{



private boolean result;
	
	public GreaterEqualTo(Integer obj1,Integer obj2)
	{
		
		this.result=obj1 > obj2;
		
	}
	public GreaterEqualTo(Double obj1,Double obj2)
	{
		
		this.result=obj1 > obj2;
		
	}

	@Override
	public boolean isResult() {
		// TODO Auto-generated method stub
		return result;
	}
	

}
