package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class StrictlyIdenticalArrays
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list1: ");
		int list1Size = input.nextInt();
		
		if (list1Size < 0)
		{
			list1Size = 0;
		}
		
		int[] list1 = new int[list1Size];
		
		for (int index = 0; index < list1Size; index++)
		{
			list1[index] = input.nextInt();
		}
		
		System.out.print("Enter list2: ");
		int list2Size = input.nextInt();
		
		if (list2Size < 0)
		{
			list2Size = 0;
		}
		
		int[] list2 = new int[list2Size];
		
		for (int index = 0; index < list2Size; index++)
		{
			list2[index] = input.nextInt();
		}
		
		System.out.print("Two lists are ");
		
		if (!equal(list1, list2))
		{
			System.out.print("not ");
		}
		
		System.out.println("strictly identical");
		
		input.close();
	}
	
	/**
	 * Returns if the two integer array arguments are strictly identical.
	 * <ul>
	 * 	<li>
	 * 		If the two integer arrays' sizes are not equal, the integer arrays will default to being not strictly
	 * 		identical.
	 * 	</li>
	 * </ul>
	 * 
	 * @param list1		array of integers
	 * @param list2		array of integers
	 * @return			true if the two lists are strictly identical. Otherwise, false.
	 */
	public static boolean equal(int[] list1, int[] list2)
	{
		if (list1.length != list2.length)
		{
			return false;
		}
		
		for (int index = 0; index < list1.length; index++)
		{
			if (list1[index] != list2[index])
			{
				return false;
			}
		}
		
		return true;
	}
}