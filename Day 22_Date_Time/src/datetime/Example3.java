package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example3
{

	public static void main(String[] args) 
	{
		
		LocalDateTime datetime=LocalDateTime.now();//To Display Current Date and Time
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		String var=datetime.format(df);
		System.out.println(var);

	}

}
