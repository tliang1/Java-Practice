package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SortThreeNumbers
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		System.out.print("The three numbers in increasing order are ");
		displaySortedNumbers(number1, number2, number3);
		System.out.println();
		
		input.close();
	}

	/**
	 * Sorts three numbers in increasing order and displays them.
	 * 
	 * @param num1		the first number
	 * @param num2		the second number
	 * @param num3		the third number
	 */
	public static void displaySortedNumbers(double num1, double num2, double num3)
	{
		if (num1 > num2)
		{
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num1 > num3)
		{
			double temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if (num2 > num3)
		{
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.print(num1 + " " + num2 + " " + num3);
	}
}