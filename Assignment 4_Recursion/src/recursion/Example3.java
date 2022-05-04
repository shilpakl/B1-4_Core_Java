package recursion;

import java.util.Scanner;

public class Example3 
{
	public static int p(int m, int n)
    {
        if (m == 1 || n == 1)
            return 1;
        return p(m - 1, n) + p(m, n - 1);
    }
	
    public static void main(String args[])
    {
    	Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m=s.nextInt();
		int a=p(n,m);
		System.out.print(a);
		s.close();

    }
}
