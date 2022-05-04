package pack3;

public class Sbi
{
	public int balance;//if we used private we cannot access outside of the class
	 public Sbi(int bal)
	{
		balance=bal;
	}

	 public void display()
	{
		System.out.println(balance);
	}
	
}
