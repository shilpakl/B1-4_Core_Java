package polymorphism;

public class OverLoading1 
{
	void assign(int a,int b)
	{
		System.out.println(" Area of Square: "+(a*a));
	}
	void assign(float a,float b)
	{
		System.out.println(" Area of Rectangle: "+(float)(a*b));
	}
	public static void main(String[] args) 
	{
		
		OverLoading1 o=new OverLoading1();
		o.assign(5,10);
		o.assign(10f,20f);
	}

}
