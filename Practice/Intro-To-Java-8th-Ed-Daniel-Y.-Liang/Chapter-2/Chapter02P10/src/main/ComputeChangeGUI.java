package main;

import javax.swing.JOptionPane;

public class ComputeChangeGUI 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog(null, 
				"Enter an amount as an integer, for example 11.56 is 1156: ", 
				"Compute Change", 
				JOptionPane.QUESTION_MESSAGE);
		int amount = Integer.parseInt(input);
		
		int remainingAmount = amount;
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		JOptionPane.showMessageDialog(null, 
				"Your amount " + amount + " consists of " + numberOfOneDollars + " dollars, " + numberOfQuarters + 
						" quarters, " + numberOfDimes + " dimes, " + numberOfNickels + " nickels, and " + 
						numberOfPennies + " pennies", 
				"Compute Change", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}