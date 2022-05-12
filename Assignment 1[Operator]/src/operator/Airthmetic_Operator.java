package operator;
import java.util.Scanner;

public class Airthmetic_Operator 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Addition :"+(a+b)+"\nSubraction :"+(a-b)+"\nMultiplication:"+(a*b)+"\nDivision:"+(a/b)+"\nmodulo:"+(a%b));


	}

}
