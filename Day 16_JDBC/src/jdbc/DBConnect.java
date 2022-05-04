package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect 
{

	public static void main(String[] args)
	{
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Capgemini1";
		String dbUserName="root";
		String dbPassword="Shilpa@98";
		String query="select *from EnggStud";
		
		try 
		{
			 Class.forName(dbDriver);
		}
		
		catch(ClassNotFoundException e)
		{
			
			  e.printStackTrace();
					 
		}
		
		try
		{
					Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
					Statement st=c.createStatement();
					ResultSet rs=st.executeQuery(query);
					
					while(rs.next())  //To print the  My sequel query
					{
						String Stud_Data=" ";
						
						for(int i=1;i<=2;i++)  //To enter the input
						{
							Stud_Data=Stud_Data+" "+rs.getString(i);
						}
						
						System.out.println(Stud_Data);
					}
		 }
		
		catch(SQLException e)
		{
			System.out.println("An error occurred. Maybe user/password is invalid");
			e.printStackTrace();  
		}
		
	}
	
}



						
					
		

