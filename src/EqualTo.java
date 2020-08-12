
public class EqualTo implements RelationalOperator {

private boolean result;
	
	public EqualTo(Integer obj1,Integer obj2)
	{
		
		this.result=obj1 != obj2;
		
	}
	public EqualTo(Double obj1,Double obj2)
	{
		
		this.result=obj1 != obj2;
		
	}
	public EqualTo(String obj1,String obj2)
	{
		
		this.result=obj1.equalsIgnoreCase(obj2);
		
	}
	@Override
	public boolean isResult() {
		// TODO Auto-generated method stub
		return result;
	}
}
