package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudDB_Select 
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
			String sql="select * from Employee1";
			Statement st =c.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
			int count=0;
			while(rs.next())
			{
				int id=rs.getInt(1);
				String Name=rs.getString(2);
				String Pass=rs.getString(3);
				String eamil=rs.getString(4);
				String res="User: %d: %s - %s - %s -%s";
				System.out.println(String.format(res,++count,id, Name, Pass, eamil));
			}
			c.close();
			
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();  
		}
		
	}
	

}
		




