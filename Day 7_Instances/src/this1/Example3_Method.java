package this1;

public class Example3_Method 
{
	void print(Example3_Method e)
	{
		System.out.println("JFS Developer");
		
	}
	void display()
	{
		print(this);//we used this keyword in method by passing as argument 
	}
	public static void main(String[] args) 
	{
		Example3_Method  e=new Example3_Method ();
		e.display();
		
	}

	

}
