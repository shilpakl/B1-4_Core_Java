package junittesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

 public class JunitTesting5 
{

	@Test
	void accept()
	{
		System.setProperty("1", "Shilpa");
		Assumptions.assumeFalse("Shilpa".equals(System.getProperty("2")));
		
	}
}
