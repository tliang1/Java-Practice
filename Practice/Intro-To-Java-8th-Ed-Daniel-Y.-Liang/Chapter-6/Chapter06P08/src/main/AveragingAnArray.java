package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class AveragingAnArray
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_DOUBLE_VALUES = 10;
		double[] numbers = new double[NUMBER_OF_DOUBLE_VALUES];
		
		System.out.print("Enter ten double values: ");
		
		for (int count = 0; count < NUMBER_OF_DOUBLE_VALUES; count++)
		{
			numbers[count] = input.nextDouble();
		}
		
		System.out.println("The average of the ten double values is: " + average(numbers));
		
		input.close();
	}
	
	/**
	 * Returns the average of the integers in the integer array argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer array's size is 0, the average will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param array		array of integers
	 * @return			the average of the integers
	 */
	public static int average(int[] array)
	{	
		if (array.length == 0)
		{
			return 0;
		}
		
		int sum = 0;
		
		for (int number : array)
		{
			sum += number;
		}
		
		return (sum / array.length);
	}
	
	/**
	 * Returns the average of the double values in the double array argument.
	 * <ul>
	 * 	<li>
	 * 		If the double array's size is 0, the average will default to 0.0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param array		array of double values
	 * @return			the average of the double values
	 */
	public static double average(double[] array)
	{
		if (array.length == 0)
		{
			return 0.0;
		}
		
		double sum = 0.0;
		
		for (double number : array)
		{
			sum += number;
		}
		
		return (sum / array.length);
	}
}