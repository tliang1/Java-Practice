package main;

import javax.swing.JOptionPane;

/**
 * @author Tony Liang
 *
 */
public class PrintCalendarMessageDialog
{
	public static void main(String[] args)
	{
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter full year (e.g., 2001): ", "Display Calendar", 
				JOptionPane.QUESTION_MESSAGE));
		
		int month = 0;
		
		while ((month < 1) || (month > 12))
		{
			month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter month in number between 1 and 12: ", "Display Calendar", 
					JOptionPane.QUESTION_MESSAGE));
		}
		
		PrintCalendar.printMonth(year, month);
		
		JOptionPane.showMessageDialog(null, PrintCalendar.getOutput(), "Display Calendar", JOptionPane.INFORMATION_MESSAGE);
	}
}