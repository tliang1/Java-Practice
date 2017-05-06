package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ReversingAnArray
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_INTEGERS = 10;
		int[] integers = new int[NUMBER_OF_INTEGERS];
		
		System.out.print("Enter ten integers: ");
		
		for (int count = 0; count < integers.length; count++)
		{
			integers[count] = input.nextInt();
		}
		
		integers = reverse(integers);
		
		for (int count = 0; count < integers.length; count++)
		{
			System.out.print(integers[count] + " ");
		}
		
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Returns the integers in reverse order given the integer array argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer array's size is less than 2, the integer array is returned as is.
	 * 	</li>
	 * </ul>
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
		
		for (int i = 0, j = list.length - 1; i < (list.length / 2); i++, j--)
		{
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
		
		return list;
	}
}