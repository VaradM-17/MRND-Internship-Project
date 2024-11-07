import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoanServices
{
	static JFrame f5;
	JLabel slider;
	ImageIcon i1, i2, i3;
	
	public static void main(String[] args) 
	{
		new LoanServices();
	}
	

	LoanServices()
	{
		f5 = new JFrame();
		f5.setSize(900,800);
		f5.setLocationRelativeTo(null);
		f5.setResizable(false);
		f5.setLayout(null);
		

		
		i1 = new ImageIcon("C:\\Users\\Amita Mule\\OneDrive\\Documents\\Loan Finance Software System\\Images\\123.jpg");
		i2 = new ImageIcon("C:\\Users\\Amita Mule\\OneDrive\\Documents\\Loan Finance Software System\\Images\\bg.jpg");
		i3 = new ImageIcon("C:\\Users\\Amita Mule\\OneDrive\\Documents\\Loan Finance Software System\\Images\\456.jpg");

		
		slider = new JLabel(i1);
		slider.setBounds(0, 0, 800, 530);
		
		f5.add(slider);
		f5.setVisible(true);

		

		try
		{
			while(true)
			{
				Thread.sleep(1000);//1000
				slider.setIcon(i1);
				
				Thread.sleep(1000);				
				slider.setIcon(i2);

				Thread.sleep(1000);
				slider.setIcon(i1);
				
							
			}
		} 
		
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		
	}

}
