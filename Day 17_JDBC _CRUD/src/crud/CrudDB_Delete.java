package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDB_Delete
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
			String sql = "delete from Employee1 where user_id=?";
			PreparedStatement p=c.prepareStatement(sql);
			p.setString(1, "104");
			
			int rows=p.executeUpdate();
			if(rows>0)
			{
				System.out.print("A user was deleted successfully");
			}
			c.close();
			
		}
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			

	}
	
}
