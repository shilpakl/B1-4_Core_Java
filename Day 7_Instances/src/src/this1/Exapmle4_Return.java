package this1;

public class Exapmle4_Return
{
	String str;
	Exapmle4_Return()
	{
		str="Shilpa";
	}
	Exapmle4_Return get() //method to return the current class instances
	{		
		return this;
	}
	void display()
	{
		System.out.println(str);
	}
	public static void main(String[] args) 
	{
		Exapmle4_Return e=new Exapmle4_Return ();
		e.get().display();
	}

}
