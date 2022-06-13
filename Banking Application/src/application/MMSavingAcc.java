package application;

import framework.BankAcc;
import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static float MINIBAL;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary, float MINIBAL) 
	{
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
		MMSavingAcc.MINIBAL=MINIBAL;
	}
	@Override
	public void withdraw(float accBal)
	{
		// TODO Auto-generated method stub
		System.out.println("Account No"+BankAcc.getAccNo()+"\n"+"Account Name: "+BankAcc.getAccNm()+"\n"+"Account Balance: "+BankAcc.getAccBal()+"\n"+"Salary: "+SavingAcc.getAccBal1());
		
	}
	
	public static float getMINIBAL() 
	{
		return MMSavingAcc.MINIBAL;
	}
	@Override
	public void deposite(float accBal) 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString()
	{
		return "MMSavingAcc[toString()="+super.toString()+",getMINIBAL()-"+getMINIBAL()+"]";
	}


	
	
}
