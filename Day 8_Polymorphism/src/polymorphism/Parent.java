package polymorphism;

public class Parent 
{
	void method()
	{
		System.out.println("Parent");
	}
}
class child extends Parent
	{

		void method1()
		{
			System.out.println("child");
		}
	}
class Parent1
		{
			
		
	
	public void main(String[] args) 
	{
		Parent p=new Parent();
		p.method();
		child c=new child();
		c.method1();
		
	}

	
	}
	



