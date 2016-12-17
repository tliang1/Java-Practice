package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_DOUBLE_VALUES = 7;
		double[] numbers = new double[NUMBER_OF_DOUBLE_VALUES];
		
		System.out.print("Enter seven numbers: ");
		
		for(int count = 0; count < numbers.length; count++)
		{
			numbers[count] = input.nextDouble();
		}
		
		bubbleSort(numbers);
		
		System.out.print("The seven sorted numbers are: ");
		
		for(int count = 0; count < numbers.length; count++)
		{
			System.out.print(numbers[count] + " ");
		}
		
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Sorts the double array argument using bubble sort.
	 * 
	 * @param list	array of double values
	 */
	public static void bubbleSort(double[] list)
	{
		boolean sorted = false;
		
		while (!sorted)
		{
			sorted = true;
			
			for (int index = 0; index < (list.length - 1); index++)
			{
				if (list[index] > list[index + 1])
				{
					sorted = false;
					
					double temp = list[index];
					list[index] = list[index + 1];
					list[index + 1] = temp;
				}
			}
		}
	}
}