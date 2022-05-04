package abst;

public class Example2
{

	int a=100;
	void display()
	{
		a=50;
		System.out.println("a");
	}
	public static void main(String[] args) 
	{
		
		Example2 e=new Example2();
		e.display();
	}
}
