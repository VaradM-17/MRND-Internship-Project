import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;

public class ViewOneUser implements ActionListener
{
	static JFrame f = new JFrame("Database Records");

	private static JPanel jpRec = new JPanel();

	private static JLabel lbNo;
	private static JLabel lbName;
	private static JLabel lbPass;

	private static JTextField txtNo;
	private static JTextField txtName;
	private static JTextField txtPass;
	private static JTextField txtRec;

	private static JButton btnFirst;
	private static JButton btnBack;
	private static JButton btnNext;
	private static JButton btnLast;

	private static int recCount = 0;
	private static	int total = DisplyAllRecords.row;

	static void populateArray ()
	{
		f.setSize (350, 200);
		f.setResizable(false);
		f.setLocationRelativeTo(null);

		jpRec.setLayout (null);

		lbNo = new JLabel ("User ID :");
		lbNo.setForeground (Color.black);
		lbNo.setBounds (15, 20, 80, 25);

        lbName = new JLabel ("User Name:");
		lbName.setForeground (Color.black);
        lbName.setBounds (15, 55, 80, 25);

		lbPass = new JLabel ("Password :");
		lbPass.setForeground (Color.black);
		lbPass.setBounds (15, 90, 100, 25);

		txtNo = new JTextField ();
		txtNo.setFont(new Font("Arial",Font.BOLD,20));
		txtNo.setHorizontalAlignment (JTextField.CENTER);
		txtNo.setBounds (125, 20, 200, 25);
		txtNo.setEnabled(false);

		txtName = new JTextField ();
		txtName.setFont(new Font("Arial",Font.BOLD,20));
		txtName.setHorizontalAlignment (JTextField.CENTER);
		txtName.setEnabled (false);
		txtName.setBounds (125, 55, 200, 25);

		txtPass = new JTextField ();
		txtPass.setFont(new Font("Arial",Font.BOLD,20));
		txtPass.setHorizontalAlignment (JTextField.CENTER);
		txtPass.setEnabled (false);
		txtPass.setBounds (125, 90, 200, 25);

		btnFirst = new JButton ("<<");
		btnFirst.setBounds (15, 125, 50, 25);
		btnFirst.addActionListener (new ViewOneUser());

		btnBack = new JButton ("<");
		btnBack.setBounds (65, 125, 50, 25);
		btnBack.addActionListener (new ViewOneUser());

		btnNext = new JButton (">");
		btnNext.setBounds (225, 125, 50, 25);
		btnNext.addActionListener (new ViewOneUser());

		btnLast = new JButton (">>");
		btnLast.setBounds (275, 125, 50, 25);
		btnLast.addActionListener (new ViewOneUser());

		txtRec = new JTextField ();
		txtRec.setEnabled (false);
		txtRec.setHorizontalAlignment (JTextField.CENTER);
		txtRec.setBounds (130, 125, 70, 25);

		jpRec.add (lbNo);
		jpRec.add (txtNo);
		jpRec.add (lbName);
		jpRec.add (txtName);
		jpRec.add (lbPass);
		jpRec.add (txtPass);
		jpRec.add (btnFirst);
		jpRec.add (btnBack);
		jpRec.add (btnNext);
		jpRec.add (btnLast);
		jpRec.add (txtRec);

		f.getContentPane().add (jpRec);

		showRec (0);

		f.setVisible (true);
	}

	public void actionPerformed (ActionEvent ae)
	{
		Object obj = ae.getSource();

		if (obj == btnFirst)
		{
			recCount = 0;
			showRec (recCount);
		}
		else if (obj == btnBack)
		{
			recCount = recCount - 1;
			if (recCount < 0)
			{
				recCount = 0;
				showRec (recCount);
				JOptionPane.showMessageDialog (f, "You are on First Record.","UserSystem - 1st Record", JOptionPane.PLAIN_MESSAGE);
			}
			else
			{
				showRec (recCount);
			}
		}
		else if (obj == btnNext)
		{
			recCount = recCount + 1;
			if (recCount == total)
			{
				recCount = total - 1;
				showRec (recCount);
				JOptionPane.showMessageDialog (f, "You are on Last Record.","UserSystem - End of Records", JOptionPane.PLAIN_MESSAGE);
			}
			else
			{
				showRec (recCount);
			}
		}
		else if (obj == btnLast)
		{
			recCount = total - 1;
			showRec (recCount);
		}
	}

	public static void showRec (int intRec)
	{
		txtNo.setText (DisplyAllRecords.rows[intRec][0]);
		txtName.setText (DisplyAllRecords.rows[intRec][1]);
		txtPass.setText (DisplyAllRecords.rows[intRec][2]);

		if (total == 0)
			txtRec.setText (intRec + "/" + total); //Showing Record No. and Total Records.
		else
			txtRec.setText ((intRec + 1) + "/" + total); //Showing Record No. and Total Records.
	}
}








