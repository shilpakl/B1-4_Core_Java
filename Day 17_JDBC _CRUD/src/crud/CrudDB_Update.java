package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDB_Update 
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
			String sql = "update Employee1 set user_name=?,password=? where user_id=?";
			PreparedStatement p=c.prepareStatement(sql);
			p.setString(1, "Suchi p");
			p.setString(2, "Pass@143");
			p.setInt(3, 101);
			
			
			int rows=p.executeUpdate();
			if(rows>0)
			{
				System.out.print("An existing user was updated successfully");
			}
			c.close();
		}
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
}

