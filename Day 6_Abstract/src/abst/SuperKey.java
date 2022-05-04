package abst;

class A
	{
		String str="shilpa";
		
	}
	class B extends A
	{
		String str="chotu";
		void print()
		{
			System.out.println("Hi,I am"+" "+str);
			System.out.println("Hi,I am"+" "+super.str);//To print parent class string we have to use super keyword
		}
	}


public class SuperKey 
{

	public static void main(String[] args)
	{
		B b=new B();
		b.print();
	}

}
