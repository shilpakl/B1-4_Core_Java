package lambda;

interface D
{
	int mul(int x,int y);
}

public class Example6
{

	public static void main(String[] args)
	{
		//Lambda Expression without return 
		D obj=(x,y)->(x*y);
		System.out.println(obj.mul(25, 35));

	}

}
