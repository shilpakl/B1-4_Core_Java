package junit;

public class Junit 
{
	public static void main(String args[])
	{
		Junit j=new Junit();
		j.isAgeValid(30);
	}
	
	public boolean isAgeValid(int age)
	{
		assert(age<150):"Age entered is: "+age;
		if(age>0) {
			return true;
		}
		else {
			return false;
		}
	}
}
