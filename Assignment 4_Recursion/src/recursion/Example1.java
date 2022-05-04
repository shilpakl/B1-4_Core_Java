package recursion;

import java.util.Scanner;

public class Example1
{
	public static int rec(int n, int k)
    {
        if (n == 1) {
            return 1;
        }
        else {
            return (rec(n - 1, k) + k - 1) % n + 1;
    }
    }
    public static void main(String[] args)
    {
    	Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int k=s.nextInt();
		int a=rec(n,k);
		System.out.print(a);
		s.close();
    }
}
