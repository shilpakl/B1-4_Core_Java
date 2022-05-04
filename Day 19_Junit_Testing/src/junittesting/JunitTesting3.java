package junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JunitTesting3
{
	@Test
	void print()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	
	@Disabled
	@Test
	void print1()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}

}
