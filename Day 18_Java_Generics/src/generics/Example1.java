package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 
{

	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Shilpa");
		a.add("Roopa");
		System.out.println(a);
		//a.add(20);
		//String s=a.get(1);
		//System.out.println(s);
		Iterator<String> itr=a.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}


/*User: 1: 101 - Shilpa - Pass@123 -shilpa@gmail.com
User: 2: 102 - Shilpa - Pass@123 -shilpa@gmail.com
User: 3: 103 - Roopa - Pass@143 -roopa@gmail.com
User: 4: 104 - Yashu - Ammu@143 -yashu@gmail.com
User: 5: 105 - Yashu - Ammu@143 -yashu@gmail.com
*/