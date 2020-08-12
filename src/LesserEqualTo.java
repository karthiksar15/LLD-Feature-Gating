
public class LesserEqualTo implements RelationalOperator{

	private boolean result;
	public LesserEqualTo(Integer obj1,Integer obj2)
	{
		this.result= obj1 < obj2;
	}
	public LesserEqualTo(Double obj1,Double obj2)
	{
		this.result= obj1 < obj2;
	}

	@Override
	public boolean isResult() {
		// TODO Auto-generated method stub
		return result;
	}
}
