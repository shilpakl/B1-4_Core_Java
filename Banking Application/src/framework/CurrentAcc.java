package framework;

public abstract class CurrentAcc extends BankAcc
{
	private static float creditLimit;
	
	/**
	 * 
	 */
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit)
	{
		//this.creditLimit = creditLimit2;
		super(accNo,accNm,accBal);
		CurrentAcc.creditLimit=creditLimit;
		// TODO Auto-generated constructor stub
	}

	public static float getCreditLimit() 
	{
		return creditLimit;
	}
	@Override
	public String toString() 
	{
		return "CurrentAcc[getcreditLimit()="+getCreditLimit()+"AccBal"+getAccBal()+",toString()="+super.toString()+"]";
	}

	

}
