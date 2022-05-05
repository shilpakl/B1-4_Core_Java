package operator;
import java.util.Scanner;

public class Unary_Operator 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter the number to increment and decrement operation:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("The pre increment value of "+a+" is:"+(++a)+"\n The post increment value of  "+a+" is :"+(a++));
		System.out.println("The pre decrement value of "+a+" is "+(--a)+"\n The post decrement value of "+a+" is "+(a--));
		s.close();

	}

}
