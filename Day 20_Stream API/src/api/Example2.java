package api;

import java.util.Arrays;
import java.util.List;

public class Example2
{

	public static void main(String[] args) 
	{
		List<Integer>values=Arrays.asList(12,23,43,25,70,26,21);
		values.stream().filter(i->i<30).forEach(i->System.out.println(i));
		values.stream().distinct().forEach(i->System.out.println("Unique values are" +i));
		values.stream().limit(5).forEach(i->System.out.println(i));
		values.stream().sorted().forEach(i->System.out.println(i));
	}

}
