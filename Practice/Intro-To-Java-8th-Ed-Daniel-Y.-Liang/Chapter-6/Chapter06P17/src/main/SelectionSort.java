package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SelectionSort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_DOUBLE_VALUES = 10;
		double[] numbers = new double[NUMBER_OF_DOUBLE_VALUES];
		
		System.out.print("Enter ten numbers: ");
		
		for(int count = 0; count < numbers.length; count++)
		{
			numbers[count] = input.nextDouble();
		}
		
		selectionSort(numbers);
		
		System.out.print("The ten sorted numbers are: ");
		
		for(int count = 0; count < numbers.length; count++)
		{
			System.out.print(numbers[count] + " ");
		}
		
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Sorts the double array argument using selection sort.
	 * 
	 * @param list	array of double values
	 */
	public static void selectionSort(double[] list) 
	{
		for (int i = list.length - 1; i >= 1; i--)
		{
			double currentMax = list[i];
			int currentMaxIndex = i;
			
			for (int j = i - 1; j >= 0; j--)
			{
				if (currentMax < list[j])
				{
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i)
			{
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}