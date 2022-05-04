package junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTesting2 
{
	@Test
	void print()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}
	
	@Test
	void print1()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}

}
