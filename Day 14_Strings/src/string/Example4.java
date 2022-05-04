package string;

import java.util.Scanner;

public class Example4 
{

	public static void main(String[] args) 
	{
		String str="Shilpa";
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str1.equals(str))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("No Matching");
		}
		
		s.close();


	}

}
