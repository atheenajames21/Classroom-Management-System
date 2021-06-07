package studentManagementSystem;

import java.sql.*;

public class Connection 
{
	Connection con;
	Statement s;
	public static Connection  getConnection() {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql:///ums","root","");
			s=con.createStatement();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	
	
}
