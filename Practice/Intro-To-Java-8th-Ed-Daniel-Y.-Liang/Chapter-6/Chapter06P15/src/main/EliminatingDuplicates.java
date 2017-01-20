package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class EliminatingDuplicates
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int MAX_NUMBER_OF_DISTINCT_INTEGERS = 10;
		int[] integers = new int[MAX_NUMBER_OF_DISTINCT_INTEGERS];
		Arrays.fill(integers, -1);
		
		System.out.print("Enter ten numbers: ");
		
		for (int count = 0; count < integers.length; count++)
		{
			integers[count] = input.nextInt();
		}
		
		integers = eliminateDuplicates(integers);
		
		System.out.print("The distinct numbers are: ");
		
		for (int index = 0; index < integers.length; index++)
		{
			if (integers[index] < 0)
			{
				break;
			}
			
			System.out.print(integers[index] + " ");
		}
		
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Returns an array of distinct integers given the integer array argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer array's size is less than 2, the integer array is returned as is.
	 * 	</li>
	 * </ul>
	 * 
	 * @param numbers	array of integers
	 * @return			the array of distinct integers
	 */
	public static int[] eliminateDuplicates(int[] numbers)
	{
		if (numbers.length < 2)
		{
			return numbers;
		}
		
		for (int index = 0; index < numbers.length; index++)
		{
			for (int index2 = index + 1; index2 < numbers.length; index2++)
			{
				if ((numbers[index] == numbers[index2]) && (numbers[index] != -1))
				{
					numbers[index2] = -1;
				}
			}
		}
		
		int distinctSize = numbers.length;
		
		for (int index = 0; index < numbers.length; index++)
		{
			if (numbers[index] == -1)
			{
				distinctSize--;
			}
		}
		
		int[] distinctNumbers = new int[distinctSize];
		
		for (int index = 0, distinctIndex = 0; index < numbers.length; index++)
		{
			if (numbers[index] != -1)
			{
				distinctNumbers[distinctIndex] = numbers[index];
				distinctIndex++;
			}
		}
		
		return distinctNumbers;
	}
}