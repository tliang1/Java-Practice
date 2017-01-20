package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SmallestElementIndex
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_DOUBLE_VALUES = 10;
		double[] numbers = new double[NUMBER_OF_DOUBLE_VALUES];
		
		System.out.print("Enter ten numbers: ");
		
		for (int count = 0; count < NUMBER_OF_DOUBLE_VALUES; count++)
		{
			numbers[count] = input.nextDouble();
		}
		
		System.out.println("The index of the minimum number is: " + indexOfSmallestElement(numbers));
		
		input.close();
	}
	
	/**
	 * Returns the smallest index of the minimum element in the double array argument.
	 * <ul>
	 * 	<li>
	 * 		If the double array's size is 0, the index will default to -1.
	 * 	</li>
	 * 	<li>
	 * 		If the double array's size is 1, the index will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param array		array of double values
	 * @return			the index of the minimum element
	 */
	public static int indexOfSmallestElement(double[] array)
	{
		if (array.length == 0)
		{
			return -1;
		}
		else if (array.length == 1)
		{
			return 0;
		}
		else
		{
			double minimumValue = array[0];
			int minimumIndex = 0;
			
			for (int index = 0; index < array.length; index++)
			{
				if (array[index] < minimumValue)
				{
					minimumValue = array[index];
					minimumIndex = index;
				}
			}
			
			return minimumIndex;
		}
	}
}