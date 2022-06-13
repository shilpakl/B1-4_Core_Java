package application;

import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) 
	{
		// TODO Auto-generated method stub
		System.out.println("Account No"+CurrentAcc.getAccNo()+"\n"+"Account Name: "+CurrentAcc.getAccNm()+"\n"+"Account Balance: "+CurrentAcc.getAccBal1()+"\n"+"Salary: "+CurrentAcc.getAccBal1());
	}

	@Override
	public void deposite(float accBal)
{
		// TODO Auto-generated method stub
		System.out.println();
		
	}
	@Override
	public String toString() 
	{
		return "MMCurrentAcc[toString()="+super.toString()+",getMINIBAL()-"+getAccBal()+"]";
	}

}
