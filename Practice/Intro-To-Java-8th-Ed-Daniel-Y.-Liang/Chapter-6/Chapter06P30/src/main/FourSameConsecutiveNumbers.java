package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class FourSameConsecutiveNumbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the input size: ");
		int inputSize = input.nextInt();
		
		while (inputSize < 1)
		{
			System.out.print("Enter the input size (Must be nonzero positive): ");
			inputSize = input.nextInt();
		}
		
		int[] values = new int[inputSize];
		
		System.out.print("Enter " + inputSize + " integers: ");
		
		for (int count = 0; count < inputSize; count++)
		{
			values[count] = input.nextInt();
		}
		
		System.out.print("The series of integers ");
		
		if (!isConsecutiveFour(values))
		{
			System.out.print("don't ");
		}
		
		System.out.println("contain four consecutive numbers with the same value.");
		
		input.close();
	}
	
	/**
	 * Returns if four consecutive integers with the same value is in the integer array argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer array's size is less than 4, it will default to false.
	 * 	</li>
	 * </ul>
	 * 
	 * @param values	array of integers
	 * @return			true if four consecutive integers with the same value is in the integer array argument.
	 * 					Otherwise, false.
	 */
	public static boolean isConsecutiveFour(int[] values)
	{
		if (values.length < 4)
		{
			return false;
		}
		
		int currentConsecutiveNumber = values[0];
		int countConsecutiveNumber = 1;
		
		for (int index = 1; index < values.length; index++)
		{
			if (values[index] == currentConsecutiveNumber)
			{
				countConsecutiveNumber++;
				
				if (countConsecutiveNumber == 4)
				{
					return true;
				}
			}
			else
			{
				currentConsecutiveNumber = values[index];
				countConsecutiveNumber = 1;
			}
		}
		
		return false;
	}
}