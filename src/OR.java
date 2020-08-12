
public class OR implements RelationalOperator {
	
	private boolean result;

	public OR(Boolean op1,Boolean op2)
	{
		this.result=op1 || op2;
	}

	@Override
	public boolean isResult() {
		// TODO Auto-generated method stub
		return result;
	}

}
