package interface1;

class Main implements Example1 {
	public void display()
	{
		System.out.println("Hey Guys,Whats going on?");
	}
	/*public void print()
	{
		System.out.println("Everything is going well and good");
	}*/
	
	public static void main(String args[])
	{
		Main m=new Main();
		m.display();
		//m.print();
	}
}
//when ever we are accessing the properties of one interface from another interface we have use "extends"key word with new interface