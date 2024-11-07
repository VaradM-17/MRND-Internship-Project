import java.io.*;
import java.sql.*;

public class DataBaseConnection
{
	public static void main(String[] args)throws Exception
	{
	   String username="root";

	   String password="tiger";

	   String DB_URL = "jdbc:mysql://localhost:3307/financedb";

	   try
	   {
		 //STEP 2: Register JDBC driver
		 Class.forName("com.mysql.jdbc.Driver");

		 Connection conn = DriverManager.getConnection(DB_URL,username,password);

	   //STEP 3: Open a connection
	   	System.out.println("Connected to Database Successfully !!!");

	   }
	   
	   
	   catch (Exception e)
  	   {
	     System.out.println("Unable to connect Database");
	   }
   }
}



