package lambda;

interface A
{
	void show();
}
/*class xyz implements A
{
	public void show();
	{
		System.out.println("Welcome to Lambda Expression");
	}
}
*/
public class Example1 
{

	public static void main(String[] args)
	{
		A obj=()->
		{
			System.out.println("Welcome to Lambda Expression");
		};
		obj.show();
	}

}
