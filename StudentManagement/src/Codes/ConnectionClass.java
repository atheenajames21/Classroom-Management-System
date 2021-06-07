package Codes;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;



public class ConnectionClass 
{
	ConnectionClass()
	{
		Connection con;
		Statement stat;
		//String databaseURL="jdbc:mysql://localhost:3306/trial";
		try
		{
			String databaseURL="jdbc:mysql://localhost:3306/trial";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(databaseURL, "root", "");
			stat=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Unable to Connect");
		}
	}
}
