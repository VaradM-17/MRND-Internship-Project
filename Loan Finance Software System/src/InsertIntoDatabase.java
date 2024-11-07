import java.io.*;
import java.sql.*;

public class InsertIntoDatabase
{
	
	
	public static void insert (String CustomerId , String CustName ,String Mobno , String EmailId,String Address,String ComBusinessName,String AnnualIncome,String PanCard,String Service,String PastLoan)
	{
		
	 try
	  {
		DAO db = new DAO();
		Connection conn = db.getConnection();

	    String insertQuery = "insert into customer values(?,?,?,?,?,?,?,?,?,?)";

	    PreparedStatement preparedStatement;
	    
        int CustId=Integer.parseInt(CustomerId);
        
        //int mobno=Integer.parseInt(Mobno);
        //int anninc=Integer.parseInt(AnnualIncome);
        
	    
	    preparedStatement = conn.prepareStatement(insertQuery);
	    preparedStatement.setInt(1,CustId);
	    preparedStatement.setString(2,CustName);
	    preparedStatement.setString(3,Mobno);
	    preparedStatement.setString(4,EmailId);
	    preparedStatement.setString(5,Address);
	    preparedStatement.setString(6,ComBusinessName);
	    preparedStatement.setString(7,AnnualIncome);
	    preparedStatement.setString(8,PanCard);
	    preparedStatement.setString(9,Service);
	    preparedStatement.setString(10,PastLoan);
	



	    preparedStatement.executeUpdate();

	    System.out.println("Data  Successfully Inserted !!!");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  }
}





