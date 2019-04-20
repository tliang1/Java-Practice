package main;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class DisplayArrayElement
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_INTEGERS = 100;
		int[] hundredRandomIntegers = createRandomIntegers(NUMBER_OF_INTEGERS);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the index of the array: ");
		int index = input.nextInt();
		
		try
		{
			System.out.print("The element in index " + index + " is " + hundredRandomIntegers[index]);
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Out of Bounds");
		}
		
		input.close();
	}
	
	/**
	 * Returns the array of random integers given the number of integers in the array.
	 * <ul>
	 * 	<li>
	 * 		If the number of integers is not a nonzero integer, the array will only have one random integer.
	 * 	</li>
	 * </ul>
	 * 
	 * @param numberOfIntegers	number of integers in the array
	 * @return					the array of random integers given the number of integers in the array
	 */
	public static int[] createRandomIntegers(int numberOfIntegers)
	{
		int[] randomIntegers;
		
		if (numberOfIntegers > 0)
		{
			randomIntegers = new int[numberOfIntegers];
		}
		else
		{
			randomIntegers = new int[1];
		}
		
		Random random = new Random();
		
		for (int element = 0; element < randomIntegers.length; element++)
		{
			randomIntegers[element] = random.nextInt();
		}
		
		return randomIntegers;
	}
}