package this1;

public class Example1 
{
	String str;//local variable inside the class(str)
	Example1(String str)//instance variable passed in argument that is "str"
	{
		this.str=str;//if the local variable and constructor varibale or instance variable is same then to return the value we have to use this keyword.
	}

	public static void main(String[] args)
	{
		Example1 e=new Example1("C2TC Program");
		System.out.println(e.str);
	}

}
