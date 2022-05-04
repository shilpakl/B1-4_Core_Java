package abst;

public class MethodOveriding
{

	void display()
	{
		System.out.println("Hello");
	}
}

class M2 extends MethodOveriding //child class
{
	void display()
	{
		System.out.println(" I am student");
	}

	public static void main(String[] args)
	{
		
		MethodOveriding m=new MethodOveriding();
		m.display();
	}
}
