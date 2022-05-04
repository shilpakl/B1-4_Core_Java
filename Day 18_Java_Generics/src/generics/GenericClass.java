package generics;

public class GenericClass<T>
{
	T val;
	
	public void print()
	{
		System.out.println(val.getClass().getName());
	}
	
	public static void main(String[] args) 
	{
		//For Integer
		GenericClass<Integer>obj=new GenericClass<Integer>();
		obj.val=15;
		obj.print();
		
		//For String
		GenericClass<String>obj1=new GenericClass<String>();
		obj1.val="Shilpa";
		obj1.print();
		
		//For Character
		GenericClass<Character>obj2=new GenericClass<Character>();
		obj2.val='Z';
		obj2.print();



	}

}
