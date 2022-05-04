package oops;

public class Car1 
{
	String str;
	Car1(String s)
	{
		str=s;
	}
	void print()
	{
		System.out.println("This is"+" "+str);
	}
	public static void main(String[] args)
	{
		Car1 a=new Car1("Audi");
		Car1 b=new Car1("Maruthi");
		Car1 c=new Car1("BMW");
		a.print();
		b.print();
		c.print();
	}

}
