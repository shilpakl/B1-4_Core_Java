package framework;

public abstract class BankAcc {
	private static int accNo;
	private static String accNm;
	private static float accBal;
	
	/**
	 * @param accNo
	 * @param accNm
	 * @param accBal
	 */
	public BankAcc(int accNo, String accNm, float accBal) {
		
		BankAcc.accNo = accNo;
		BankAcc.accNm = accNm;
		BankAcc.accBal = accBal;
	}
	public  abstract void withdraw(float accBal);
	public abstract void deposite(float accBal);
	public static int getAccNo() {
		return accNo;
	}
	
	public static String getAccNm() {
		return accNm;
	}
	public static void setAccNm(String accNm) {
		BankAcc.accNm = accNm;
	}
	public static float getAccBal1() {
		return accBal;
	}
	public static float getAccBal() {
		return accBal;
	}
	@Override
	public String toString() {
		return "BankAcc[accNo="+accNo+", accNm="+accNm+",accBal="+accBal+"]";
	}
	
	
}
