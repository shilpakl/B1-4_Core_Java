package framework;

public abstract class SavingAcc extends BankAcc
{
	private static boolean isSalary;
	@SuppressWarnings("unused")
	private static final float MINBAL=0.0f;	
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalary) 
	{
		super(accNo,accNm,accBal);
		//this.isSalary = isSalary;
		SavingAcc.isSalary=isSalary;
	}

	public static boolean getisSalary() 
	{
		return isSalary;
	}
	public static float getMinbal() 
	{
		return MINBAL;
	}

	public static String getcreditLimit() 
	{
		// TODO Auto-generated method stub
		return null;
	}		
}
