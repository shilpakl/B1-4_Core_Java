package lambda;

import java.util.ArrayList;

public class Example3 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> obj=new ArrayList<>();
		obj.add(12);
		obj.add(13);
		obj.add(14);
		System.out.println(obj);
		obj.forEach((n)->
		{
			System.out.println(n);
		});
	}

}