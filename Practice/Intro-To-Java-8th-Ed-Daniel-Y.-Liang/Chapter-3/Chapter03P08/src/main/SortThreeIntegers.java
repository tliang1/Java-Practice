package main;

import javax.swing.JOptionPane;

public class SortThreeIntegers
{

	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog(null, 
				"Enter the first integer: ",
				"Sort Three Numbers",
				JOptionPane.QUESTION_MESSAGE);
		int num1 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, 
				"Enter the second integer: ",
				"Sort Three Numbers",
				JOptionPane.QUESTION_MESSAGE);
		int num2 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, 
				"Enter the third integer: ",
				"Sort Three Numbers",
				JOptionPane.QUESTION_MESSAGE);
		int num3 = Integer.parseInt(input);
		
		if (num1 > num2)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num1 > num3)
		{
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if (num2 > num3)
		{
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		JOptionPane.showMessageDialog(null, 
				"Num 1: " + num1 + " Num 2: " + num2 + " Num 3: " + num3, 
				"Sort Three Numbers", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}