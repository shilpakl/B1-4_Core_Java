package introduction;

import java.util.Scanner;

public class Example2
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		//String str=s.next(); //if we are using next,it will take one world of that input.if we used nextLine() it will take complete sentence of the input.
		
		//int x=s.nextInt(); //for numbers we can use integer , character, float and double.
		
		char c=s.next().charAt(0); //for character we cannot use nextchar() method.
		System.out.println(c);
	
		s.close();
    }
}
