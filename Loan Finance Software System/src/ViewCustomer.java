import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class ViewCustomer
{
	static JFrame f = new JFrame("Database Records");
	static DefaultTableModel dtmCustomer;
	static JTable tbCustomer;
	static JScrollPane jspTable;

	static void populateArray (String rows[][])
	{
		JPanel jpShow = new JPanel ();

		int row = 0;
		int total = 0;

		f.setSize (1665, 700);
		f.setLocationRelativeTo(null);

		tbCustomer = makeTable (rows);
		jspTable = new JScrollPane (tbCustomer);
		jspTable.setBounds (70, 70, 1500, 500);

		jpShow.add (jspTable);
		jpShow.setLayout (null);

		f.getContentPane().add (jpShow);
        f.setAlwaysOnTop(true);
        f.setResizable(false);
		f.setVisible(true);
	}

	private static JTable makeTable (String rowData[][])
	{
		String cols[] = { "CustomerId" ,  "CustName" , "Mobno" , " EmailId"," Address", "ComBusinessName",
				" AnnualIncome"," PanCard", "Service"," PastLoan"};

		dtmCustomer  = new DefaultTableModel (rowData,cols);

		tbCustomer = new JTable (dtmCustomer)
		{
			public boolean isCellEditable (int iRow, int iCol)
			{
				return false;	//Disable All Columns of Table.
			}
		};
		
		(tbCustomer.getColumnModel().getColumn(0)).setPreferredWidth (200);

		(tbCustomer.getColumnModel().getColumn(1)).setPreferredWidth (230);
		(tbCustomer.getColumnModel().getColumn(2)).setPreferredWidth (230);
		(tbCustomer.getColumnModel().getColumn(3)).setPreferredWidth (230);
		(tbCustomer.getColumnModel().getColumn(4)).setPreferredWidth (230);
		(tbCustomer.getColumnModel().getColumn(5)).setPreferredWidth (230);
		(tbCustomer.getColumnModel().getColumn(6)).setPreferredWidth (230);
		(tbCustomer.getColumnModel().getColumn(7)).setPreferredWidth (230);
		(tbCustomer.getColumnModel().getColumn(8)).setPreferredWidth (230);
		(tbCustomer.getColumnModel().getColumn(9)).setPreferredWidth (120);
	
		
		
		tbCustomer.setRowHeight (45);
		
		tbCustomer.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
		Font tableFont = new Font ("Arial", Font.PLAIN ,20);
		tbCustomer.setFont(tableFont);
		
		return tbCustomer;
	}

}