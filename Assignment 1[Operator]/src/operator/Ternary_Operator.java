package operator;
import java.util.Scanner;

public class Ternary_Operator 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the number to checking Even or Odd:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String res=(num%2==0)? "Even":"odd";
		System.out.print("The Given number is :"+res);
		s.close();

	}

}
