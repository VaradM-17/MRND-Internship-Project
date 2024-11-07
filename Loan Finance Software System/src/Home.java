import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class Home implements ActionListener 
{

	JFrame f1;
	JProgressBar jpb1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	
	Home()
	{
		
		f1 = new JFrame("Home");
        f1.setSize(460, 600);
        f1.setLayout(null);
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.getContentPane().setBackground(new Color(166, 196, 247));
        f1.setIconImage(Toolkit.getDefaultToolkit().getImage("D://rupee-indian.png"));
        
        jpb1 = new JProgressBar();
        jpb1.setBounds(12,30,430,90);
        jpb1.setOrientation(0); // 0 = horizontal 1=vertical
        jpb1.setBackground(new Color(52, 52, 52));
        jpb1.setFont(new Font("Arial", Font.BOLD |Font.ITALIC, 40)); 
        jpb1.setForeground(new Color(254,174,86));//254,177,92  
        jpb1.setIndeterminate(true); // By this will start moving
        jpb1.setString("Navkar Finance");
        jpb1.setStringPainted(true);
        
        
        
        b1 = new JButton ("Add Enquiry");
        b1.setFont(new Font("Arial",Font.ITALIC, 22));
        b1.setBackground(new Color(247, 247, 247));
        b1.setBounds(138, 168, 185 ,46 );
        b1.setFocusable(false);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b1.addActionListener(this);
        
        f1.add(b1);
        
        
        b2 = new JButton ("Delete Enquiry");
        b2.setFont(new Font("Arial", Font.ITALIC, 22));
        b2.setBackground(new Color(247, 247, 247));
        b2.setBounds(138, 220, 185 ,43 );
        b2.setFocusable(false);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.addActionListener(this);
        
        f1.add(b2);
        
        
        
        b3 = new JButton ("Update Enquiry");
        b3.setFont(new Font("Arial", Font.ITALIC, 22));
        b3.setBackground(new Color(247, 247, 247));
        b3.setBounds(138, 270, 185 ,43 );
        b3.setFocusable(false);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b3.addActionListener(this);
        
        f1.add(b3);
        
        
        b4 = new JButton ("Display All");
        b4.setFont(new Font("Arial", Font.ITALIC, 22));
        b4.setBackground(new Color(247, 247, 247));
        b4.setBounds(138, 320, 185 ,43 );
        b4.setFocusable(false);
        b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b4.addActionListener(this);
        
        f1.add(b4);
        
        
        b5 = new JButton ("Loan Services");
        b5.setFont(new Font("Arial", Font.ITALIC, 22));
        b5.setBackground(new Color(247, 247, 247));
        b5.setBounds(138, 370, 185 ,43 );
        b5.setFocusable(false);
        b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b5.addActionListener(this);
        
        f1.add(b5);
        
        
        b6 = new JButton ("OK");
        b6.setFont(new Font("Arial",Font.BOLD|Font.ITALIC, 23));
        b6.setBackground(new Color(60, 60, 60));
        b6.setForeground(new Color(254,174,86));
        b6.setBounds(50, 470, 170,40 );
        b6.setFocusable(false);
        b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b6.addActionListener(this);
        
        f1.add(b6);
        
        
        b7 = new JButton ("Cancel");
        b7.setFont(new Font("Arial",Font.BOLD|Font.ITALIC, 23));
        b7.setBackground(new Color(60, 60, 60));
        b7.setForeground(new Color(254,174,86));
        b7.setBounds(235, 470, 170,40 );
        b7.setFocusable(false);
        b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b7.addActionListener(this);
        
        f1.add(b7);
        
        
        f1.add(jpb1);
        //f1.add(jpb2);
        
        f1.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		f1.dispose();
		
		if (e.getSource() == b1) 
		{
			
			AddEnquiry addenquiry = new AddEnquiry();
			
			
		}
		
		
		else if (e.getSource() == b2) 
		{
			
		 DeleteEnquiry deleteEnquiry = new  DeleteEnquiry();
			
		}
		
		
		else if (e.getSource() == b3) 
		{
			
		UpdateEnquiry updateEnquiry = new UpdateEnquiry();
				
		}
		
		
		else if (e.getSource() == b4) 
		{
			
			DisplyAllRecords displayAll = new DisplyAllRecords();
				
		}
		
		
		
		else if (e.getSource() == b5) 
		{
			
			LoanServices obj =new LoanServices();
			
		}
		
		
		else if (e.getSource() == b6) 
		{
			
			
				
		}
		
		
		else if (e.getSource() == b7) 
		{
			
			f1.dispose();
				
		}
	
		
	}
	
}























