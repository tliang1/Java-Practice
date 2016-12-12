package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ReverseTenIntegers
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_INTEGERS = 10;
		int[] integers = new int[NUMBER_OF_INTEGERS];
		
		System.out.print("Enter ten integers: ");
		
		for(int count = 0; count < integers.length; count++)
		{
			integers[count] = input.nextInt();
		}
		
		int[] reverseIntegers = reverse(integers);
		
		System.out.print("The ten integers in reverse are ");
		
		for(int count = 0; count < reverseIntegers.length; count++)
		{
			System.out.print(reverseIntegers[count] + " ");
		}
		
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Returns the integers in reverse order given the integer array argument.
	 * <p>
	 * If the integer array's size is less than 2, the integer array is returned as is.
	 * 
	 * @param list	array of integers
	 * @return		the array of integers in reverse order
	 */
	public static int[] reverse(int[] list)
	{
		if (list.length < 2)
		{
			return list;
		}
		
		int[] result = new int[list.length];
		
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
		{
			result[j] = list[i];
		}
		
		return result;
	}
}