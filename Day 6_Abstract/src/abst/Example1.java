package abst;

abstract class A1//parent class
{
	abstract void print();
}
class A2 extends A1//child class
{
	void print()
	{
		System.out.println(" I am vegetarian");
	}
}
class A3 extends A1//child class
{
	void print()
	{
		System.out.println(" I am not vegtarian");
	}
}

public class Example1 
{

	public static void main(String[] args) 
	{
		A2 a=new A2();
		A3 b=new A3();
		a.print();
		b.print();
	}
}
