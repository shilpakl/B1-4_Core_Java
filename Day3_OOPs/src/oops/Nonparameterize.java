package oops;

public class Nonparameterize 
{
	 String str;
	 int a;
	 Nonparameterize()
	{
		str="Welcome";
		a=123;
	}
	void display()
	{
		System.out.println(str+" "+a);
	}

	public static void main(String[] args)
	{
		Nonparameterize  n=new Nonparameterize();
		n.display();
				

	}
}
