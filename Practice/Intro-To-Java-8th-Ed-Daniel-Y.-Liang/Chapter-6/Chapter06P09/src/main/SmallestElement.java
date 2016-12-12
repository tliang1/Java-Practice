package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SmallestElement
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_DOUBLE_VALUES = 10;
		double[] numbers = new double[NUMBER_OF_DOUBLE_VALUES];
		
		System.out.print("Enter ten numbers: ");
		
		for(int count = 0; count < NUMBER_OF_DOUBLE_VALUES; count++)
		{
			numbers[count] = input.nextDouble();
		}
		
		System.out.println("The minimum number is: " + min(numbers));
		
		input.close();
	}
	
	/**
	 * Returns the minimum element in the double array argument.
	 * <p>
	 * If the double array's size is 0, the minimum element will default to 0.0. If the double array's size is 1,
	 * the minimum element will default to the only element in the array.
	 * 
	 * @param array		array of double values
	 * @return			the minimum element
	 */
	public static double min(double[] array)
	{
		if (array.length == 0)
		{
			return 0.0;
		}
		else if (array.length == 1)
		{
			return array[0];
		}
		else
		{
			double minimumValue = array[0];
			
			for (double number : array)
			{
				if (number < minimumValue)
				{
					minimumValue = number;
				}
			}
			
			return minimumValue;
		}
	}
}