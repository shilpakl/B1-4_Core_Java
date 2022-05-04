package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Example4 
{

	public static void main(String[] args) 
	{
		//To calculate the days between 
		LocalDate date1=LocalDate.now(); //27th 
		LocalDate date2=date1.plusDays(4); //+4
		System.out.println(date2);  //1st may. because April month has only 30 days
		long  df= ChronoUnit.DAYS.between(date1,date2);
		System.out.println(df); 
		
	}

}
