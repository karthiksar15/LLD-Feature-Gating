
public class Lesser implements RelationalOperator{

	private boolean result;
	public Lesser(Integer obj1,Integer obj2)
	{
		this.result= obj1 < obj2;
	}
	public Lesser(Double obj1,Double obj2)
	{
		this.result= obj1 < obj2;
	}

	@Override
	public boolean isResult() {
		// TODO Auto-generated method stub
		return result;
	}

}
