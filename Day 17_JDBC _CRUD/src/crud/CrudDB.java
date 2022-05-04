package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudDB 
{

	public static void main(String[] args)
	{
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Sample";
		String dbUserName="root";
		String dbPassword="Shilpa@98";
		
		try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql="INSERT INTO Employee1(user_id,user_Name,Password,email)VALUES(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(sql);
			//p.setString(1, "101");
			//p.setString(2, "Shilpa");
			//p.setString(3, "Pass@143");
			//p.setString(4, "S@gmail.com");
			
			//p.setString(1, "102");
			//p.setString(2, "Roopa");
			//p.setString(3, "Pass@143");
			//p.setString(4, "R@gmail.com");
			
			//p.setString(1, "103");
			//p.setString(2, "Chotu");
			//p.setString(3, "Pass@143");
			//p.setString(4, "C@gmail.com");
			
			p.setString(1, "104");
			p.setString(2, "Yashu");
			p.setString(3, "Pass@143");
			p.setString(4, "Y@gmail.com");
			
			int row=p.executeUpdate();
			if(row>0)
			{
				System.out.println("A new user was inserted successfully");
			}
			c.close();
			
			
			
			if(c!=null)
			{
				System.out.println("Connected");
				c.close();
			}
			
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();  
		}
	}

}
