package collection;

import java.util.ArrayDeque;

public class Example6 
{

	public static void main(String[] args) 
	{
		ArrayDeque a=new ArrayDeque(); //if we want implement Deque we have to use "ArayDeque".
		a.add(10);
		a.add("Neethu");
		a.addFirst(10.2);  //First it will print 10.2.
		a.addLast(20.2);
		System.out.println(a);
	}

}
