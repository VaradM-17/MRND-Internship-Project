import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class  UpdateEnquiry implements ActionListener
{

	JFrame f2;
	JButton b8,b9,b10;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,imageLabel;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	JComboBox jcb;
	JRadioButton rb1,rb2,rb3,rb4;
	JTextArea ta;
	
	
	
	UpdateEnquiry()
	{
		
		f2 = new JFrame("Enquiry Form");
        f2.setSize(830,880);
        // f2.setDefaultCloseOperation(0);
        f2.setLayout(null); 
        f2.setLocationRelativeTo(null);
        f2.setResizable(false);
        f2.getContentPane().setBackground(new Color(166, 196, 247));
        
        
        
        l10 = new JLabel("Update Enquiry ");
        l10.setFont(new Font("Arial", Font.BOLD |Font.ITALIC, 50));
        l10.setOpaque(true);
        l10.setHorizontalAlignment( SwingConstants.CENTER );
        l10.setBackground(new Color(60, 60, 60));
        l10.setForeground(new Color(255,96,96));// l10.setForeground(new Color(254,174,86));
        //l10.setLayout(new FlowLayout(FlowLayout.CENTER));

        l10.setBounds(12, 15, 800, 120);
        
        f2.add(l10);
        
        
        
        l1 = new JLabel("Customer ID");
        l1.setFont(new Font("Arial", Font.PLAIN, 22));
        l1.setBounds(320, 170, 150, 35);
        
        f2.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(500, 170, 260, 35);
        tf1.setFont(new Font("Arial", Font.PLAIN, 22));
        
        f2.add(tf1);
        
        
        
        l2 = new JLabel("Update Customer Name");
        l2.setFont(new Font("Arial", Font.PLAIN, 22));
        l2.setBounds(240, 220, 250, 35);
        
        f2.add(l2);

        tf2 = new JTextField();
        tf2.setBounds(500, 220, 260, 35);
        tf2.setFont(new Font("Arial", Font.PLAIN, 22));
        
        f2.add(tf2);
        
        
        
        l3 = new JLabel("Update Mobile Number");
        l3.setFont(new Font("Arial", Font.PLAIN, 22));
        l3.setBounds(240, 265, 250, 35);
        
        f2.add(l3);

        tf3 = new JTextField();
        tf3.setBounds(500, 265, 260, 35);
        tf3.setFont(new Font("Arial", Font.PLAIN, 22));
        
        f2.add(tf3);
        
        
        
        l4 = new JLabel("Update Email ID");
        l4.setFont(new Font("Arial", Font.PLAIN, 22));
        l4.setBounds(240, 315, 200, 35);
        
        f2.add(l4);

        
        tf4 = new JTextField();
        tf4.setBounds(420, 315, 190, 35);
        tf4.setFont(new Font("Arial", Font.PLAIN, 22));
        
        f2.add(tf4);
        
        
        String s1[] = {"  Choose  ","@gmail.com","@yahoo.com","@rediffmail.com","@outlook.com","@msn.co.in","  "};
        
        jcb = new JComboBox(s1);
        jcb.setBounds(610,315,150,35);
        jcb.setBackground(new Color(255, 255, 255));
        jcb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jcb.setFont(new Font("Arial", Font.ITALIC, 20));
        
        f2.add(jcb);
        
        
        
        l5 = new JLabel("Update Address");
        l5.setFont(new Font("Arial", Font.PLAIN, 22));
        l5.setBounds(240, 390, 180, 35);
        
        f2.add(l5);
        
        

        ta = new JTextArea();
	 	ta.setBounds(420,370,340,70);
	 	ta.setFont(new Font("Arial",Font.PLAIN,22));
	 	ta.setLineWrap(true); 
        ta.setWrapStyleWord(true);
	 	
	 	f2.add(ta);
        
        
        l5 = new JLabel("Update Service");
        l5.setFont(new Font("Arial", Font.PLAIN, 22));
        l5.setBounds(240, 460, 150, 35);
        
        f2.add(l5);
        
        
        rb1 = new JRadioButton("Self Employee");
		rb1.setBounds(420,460,170,35);
		rb1.setFont(new Font("Arial", Font.ITALIC, 22));
		rb1.setFocusable(false);
		rb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rb1.setBackground(new Color(255, 255, 255));
		
		f2.add(rb1);
		
		
		rb2 = new JRadioButton("Job");
		rb2.setBounds(600, 460, 80, 35);
		rb2.setFont(new Font("Arial", Font.ITALIC, 22));
		rb2.setFocusable(false);
		rb2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rb2.setBackground(new Color(255, 255, 255));
		
		f2.add(rb2);
        
       
		
		l5 = new JLabel("Update Company/Business Name");
        l5.setFont(new Font("Arial", Font.PLAIN, 22));
        l5.setBounds(35,535, 350, 35);
        
        f2.add(l5);
        
        tf5 = new JTextField();
        tf5.setBounds(380, 535, 380, 35);
        tf5.setFont(new Font("Arial", Font.PLAIN, 22));
        
        f2.add(tf5);
        
        
        l6 = new JLabel("Update Annual Income");
        l6.setFont(new Font("Arial", Font.PLAIN, 22));
        l6.setBounds(143,580, 250, 35);
        f2.add(l6);
        
        tf6 = new JTextField();
        tf6.setBounds(380, 580, 200, 35);
        tf6.setFont(new Font("Arial", Font.PLAIN, 22));
        f2.add(tf6);
        
        
        
        l7 = new JLabel("Past Loan");
        l7.setFont(new Font("Arial", Font.PLAIN, 22));
        l7.setBounds(260,630, 150, 35);
        f2.add(l7); 

        rb3 = new JRadioButton(" Yes");
		rb3.setBounds(380,630,95,35);
		rb3.setFont(new Font("Arial", Font.ITALIC, 22));
		rb3.setFocusable(false);
		rb3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rb3.setBackground(new Color(255, 255, 255));
		
		f2.add(rb3);
		
		rb4 = new JRadioButton("  No");
		rb4.setBounds(484, 630, 95, 35);
		rb4.setFont(new Font("Arial", Font.ITALIC, 22));
		rb4.setFocusable(false);
		rb4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rb4.setBackground(new Color(255, 255, 255));
		
		f2.add(rb4);
		
		
		 
        l8 = new JLabel("Pan Card");
        l8.setFont(new Font("Arial", Font.PLAIN, 22));
        l8.setBounds(268,680, 100, 35);
        f2.add(l8); 
        
        
        tf7 = new JTextField();
        tf7.setBounds(380,680, 200, 35);
        tf7.setFont(new Font("Arial", Font.PLAIN, 20));
        f2.add(tf7);
        
        

		b8 = new JButton("Update");
		b8.setBounds(210,750,200,45);
		b8.setFont(new Font("Arial", Font.ITALIC|Font.BOLD, 23));
        b8.setBackground(new Color(60, 60, 60));
        b8.setForeground(new Color(254,174,86));
        b8.setFocusable(false);
        b8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b8.addActionListener(this);
        
		f2.add(b8);
		
		b9 = new JButton("Cancel");
		b9.setBounds(440,750,200,45);
		b9.setFont(new Font("Arial", Font.ITALIC|Font.BOLD, 23));
        b9.setBackground(new Color(60, 60, 60));
        b9.setForeground(new Color(254,174,86));
        b9.setFocusable(false);
        b9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b9.addActionListener(this);
		
		f2.add(b9);
		
        
        
        ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		ButtonGroup pl = new ButtonGroup();
		pl.add(rb3);
		pl.add(rb4);
		
		
		  //   Image Button
		
		
		
        
        
        
        
        
        
        // Validate Customer ID
        
        tf1.addKeyListener(new KeyAdapter()
        {
    		public void keyTyped(KeyEvent ke)
    		{
    			char ch=ke.getKeyChar();
    		
    		if(!(ch>='0'&& ch<='9'||ch==KeyEvent.VK_BACK_SPACE ||ch==KeyEvent.VK_SPACE))  
    		{
    	       f2.getToolkit().beep();
    			ke.consume();
    		}
    		}
    	});
        
        
        // Validate Customer Name
        
        tf2.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent ke) 
            {
                char ch = ke.getKeyChar();

                if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_SPACE))
                {
                    f2.getToolkit().beep();
                    ke.consume();
                }
            }
        });
        
		
        
        // Validate Mobile Number
        
        tf3.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent ke) 
            {
                char ch = ke.getKeyChar();

                if (!(Character.isDigit(ch) || ch == KeyEvent.VK_BACK_SPACE)) 
                {
                    f2.getToolkit().beep();
                    ke.consume();
                    
                }
                
                else 
                	if (tf3.getText().length() >= 10 && ch != KeyEvent.VK_BACK_SPACE) 
                	{
                		f2.getToolkit().beep();
                        ke.consume();
                    }
            }
        });
		
		
        // Validate Email
        
        tf4.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent ke) 
            {
                char ch = ke.getKeyChar();

                if (!((ch >= 'A' && ch <= 'z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_SPACE))
                {
                    f2.getToolkit().beep();
                    ke.consume();
                }
            }
        });
        
        
        // Validate Company / Bussiness Name
        
        tf5.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent ke) 
            {
                char ch = ke.getKeyChar();

                if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_SPACE))
                {
                    f2.getToolkit().beep();
                    ke.consume();
                }
            }
        });
        
        
        // Validate Annual Income
        
        tf6.addKeyListener(new KeyAdapter()
        {
    		public void keyTyped(KeyEvent ke)
    		{
    			char ch=ke.getKeyChar();
    		
    		if(!(ch>='0'&& ch<='9'||ch==KeyEvent.VK_BACK_SPACE ||ch==KeyEvent.VK_SPACE))  
    		{
    	       f2.getToolkit().beep();
    			ke.consume();
    		}
    		}
    	});
        
		
		// Validate Pan Card
        
        tf7.addKeyListener(new KeyAdapter() 
        {
		    public void keyTyped(KeyEvent ke) 
		    {
		        char ch = ke.getKeyChar();
		        if (!(Character.isUpperCase(ch)||ch>='0'&& ch<='9' || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_DELETE))
		        {
		            f2.getToolkit().beep();
		            ke.consume();
		        }
		    }
		});
        
        
        
       //----------------------------------------------------------------------------------------------------------------------
        
        imageLabel = new JLabel();
        imageLabel.setBounds(45, 180, 220, 235);
        f2.add(imageLabel);
        
       
        f2.setVisible(true);
		
	}

	
//	
	
		@Override
		public void actionPerformed(ActionEvent e) 
		{

		  
			Object obj = e.getSource();

		    String s1 = tf1.getText();
		  
		    String s2 = tf2.getText();
		    String s3 = tf3.getText();
		    String s4 = tf4.getText();
		    String s5 = ta.getText();
		    String s6 = tf5.getText();
		    String s7 = tf6.getText();
		    String s8 = tf7.getText();
		    
		    
		    String service="";
			  String pastloan="";
			  
				if(rb1.isSelected())
			    service = rb1.getText();
				
				else
					if(rb2.isSelected())
						service = rb1.getText();
				
				if(rb3.isSelected())
					pastloan=rb3.getText();
				else
					if(rb4.isSelected())
						pastloan=rb4.getText();
		    
		    
		    try
			  {
				DAO db=new DAO();
				Connection conn=db.getConnection();

				String selectquery = "update customer set CustomerName=?,MobileNo=?,EmailId=?,Address=?,CBName=?,AnnualIncome=?," +
						"PanCardNo=?,Service=?,PastLoan=? where CustomerId=?";

				PreparedStatement pstmt = null;
				pstmt = conn.prepareStatement(selectquery);

				pstmt.setString(1, s2);//custid

				pstmt.setString(2,s3);//custname

				pstmt.setString(3,s4);//mob
				
				pstmt.setString(4,s5);//
				
				pstmt.setString(5,s6);
				
				pstmt.setString(6,s7);
				
				pstmt.setString(7,s8);
				
				pstmt.setString(8, service);
				
				pstmt.setString(9, pastloan);
				
				pstmt.setString(10,s1);
				
				
				

				int count = pstmt.executeUpdate();

				if(count==0)
		   		   System.out.println("No Recored Found with ID = " +  s1);
				else
					JOptionPane.showMessageDialog(f2, "Data Successfully Updated !!!");
			 }
			 catch(Exception e1)
			 {
				 System.out.println(e);
			 }
		  }
		    
		    
		  }
	

	

	












