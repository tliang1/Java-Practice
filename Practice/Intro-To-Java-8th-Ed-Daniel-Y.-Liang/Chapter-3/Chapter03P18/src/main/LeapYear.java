package main;

import javax.swing.JOptionPane;

public class LeapYear
{

	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog(null, 
				"Enter a year: ",
				"Leap Year",
				JOptionPane.QUESTION_MESSAGE);
		int year = Integer.parseInt(input);
		
		// Check if the year is a leap year
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		JOptionPane.showMessageDialog(null, 
				year + " is a leap year? " + isLeapYear, 
				"Leap Year", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}