package string;

import java.util.Scanner;

public class Example6 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println(str1.length());
		System.out.println(str1.charAt(1));
		System.out.println(str1.toLowerCase());
		s.close();

	}

}
