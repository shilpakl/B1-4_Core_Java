package junittesting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class JunitTesting4 
{
	@BeforeAll
	static void display()
	{
		System.out.println("Vishwa");
	}
	
	@Test
	void display1()
	{
		System.out.println("shilpa");
	}

}
