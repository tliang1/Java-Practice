package main;

import javax.swing.JOptionPane;

public class NextMonthInterestGUI 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog(null, 
				"Enter balance: ",
				"Calculate Interest",
				JOptionPane.QUESTION_MESSAGE);
		double balance = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog(null, 
				"Enter interest rate (e.g., 3 for 3%): ", 
				"Calculate Interest",
				JOptionPane.QUESTION_MESSAGE);
		double annualInterestRate = Double.parseDouble(input);
		
		double interest = balance * (annualInterestRate / 1200);
		
		JOptionPane.showMessageDialog(null, 
				"The interest is " + interest, 
				"Calculate Interest", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}