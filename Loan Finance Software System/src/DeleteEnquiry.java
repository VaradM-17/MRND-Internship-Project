import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class DeleteEnquiry implements ActionListener
{
	JFrame f3;
	JLabel l11,l12;
	JButton b11,b;
	JTextField tf1;
	

	DeleteEnquiry()
	{
		f3 = new JFrame("Delete Enquiry");
        f3.setSize(580,500);
        f3.setLayout(null); 
        f3.setLocationRelativeTo(null);
        f3.setResizable(false);
        f3.getContentPane().setBackground(new Color(255, 160, 160));
        
        
        
        l11 = new JLabel("Delete Enquiry");
        l11.setFont(new Font("Arial", Font.BOLD |Font.ITALIC, 50));
        l11.setOpaque(true);
        l11.setHorizontalAlignment( SwingConstants.CENTER );
        l11.setBackground(new Color(60, 60, 60));
        l11.setForeground(new Color(255,50,50));
        l11.setBounds(12, 30, 550, 120);
        
        f3.add(l11);
        
        
        
        l12 = new JLabel("Enter CustomerId :");
        l12.setFont(new Font("Arial", Font.BOLD, 25));
        l12.setOpaque(true);
        l12.setHorizontalAlignment( SwingConstants.CENTER );
        l12.setBackground(new Color(247, 247, 247));
        //l12.setForeground(new Color(254,174,86));
        l12.setBounds(45, 220, 250, 55);
        
        f3.add(l12);
        
        tf1 = new JTextField();
        tf1.setBounds(310, 220, 225, 55);
        tf1.setFont(new Font("Arial", Font.BOLD, 28));
        
        f3.add(tf1);
        
        
        
        
        b11 = new JButton("Delete");
		b11.setBounds(100,355,185,45);
		b11.setFont(new Font("Arial", Font.ITALIC|Font.BOLD, 23));
        b11.setBackground(new Color(60, 60, 60));
        b11.setForeground(new Color(255,250,250));
        b11.setFocusable(false);
        b11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b11.addActionListener(this);
		
		f3.add(b11);
		
		b = new JButton("Cancel");
		b.setBounds(310,355,185,45);
		b.setFont(new Font("Arial", Font.ITALIC|Font.BOLD, 23));
        b.setBackground(new Color(60, 60, 60));
        b.setForeground(new Color(254,250,250));
        b.setFocusable(false);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b.addActionListener(this);
		
		f3.add(b);
		
		
		f3.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s1 = tf1.getText();
		int s = Integer.parseInt(s1);
		
		Object obj = e.getSource();
		
		
		
		if(obj == b11) 
		{
			try
			  {
				
				DAO db=new DAO();
				
				Connection conn = db.getConnection();
			    String deleteQuery = "delete from customer where CustomerId = ?";
				PreparedStatement preparedStatement;
				
				preparedStatement = conn.prepareStatement(deleteQuery);//it connect to db to delete
				preparedStatement.setString(1, s+"");
					
				int count = preparedStatement.executeUpdate();
				
				if(count == 0)		
		   		   System.out.println("No Recored Found with ID= !!!"+s);
				else
				   System.out.println("Total "+count + " Records Deleted !!!");
			 }
			
			 catch(Exception e1)
			 {
				 System.out.println(e1);
			 }
		}
		
	}}











