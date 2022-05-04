package generics;

public class GenericMethod 
{
	public static<E>void print(E[]elements)
	{
		for(E itr: elements)
		{
			System.out.println(itr);
		}
	}

	public static void main(String[] args) 
	{
		Integer[] arr= {11,12,13,14,15};
		Character[] arr1= {'a','e','i','o','u'};
		print(arr);
		print(arr1);

	}
}
