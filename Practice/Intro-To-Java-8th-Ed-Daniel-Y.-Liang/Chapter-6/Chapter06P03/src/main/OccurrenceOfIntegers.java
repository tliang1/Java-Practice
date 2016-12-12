package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class OccurrenceOfIntegers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integers between 1 and 100: ");
		
		final int MAX_INTEGER = 100;
		int[] occurrences = new int[MAX_INTEGER];
		
		int currentInteger = -1;
		
		while (currentInteger != 0)
		{
			currentInteger = input.nextInt();
			
			if (currentInteger > 0)
			{
				occurrences[currentInteger - 1]++;
			}
		}
		
		printOccurrences(occurrences);
		
		input.close();
	}

	/**
	 * Displays the number of occurrences for each index of the integer array argument.
	 * <p>
	 * If the occurrences for a index is 0, the element will not be displayed.
	 * 
	 * @param occurrences	array of occurrences
	 */
	public static void printOccurrences(int[] occurrences)
	{
		for (int integer = 1; integer <= occurrences.length; integer++)
		{
			if (occurrences[integer - 1] > 0)
			{
				System.out.print(integer + " occurs " + occurrences[integer - 1]);
				
				if (occurrences[integer - 1] > 1)
				{
					System.out.println(" times");
				}
				else
				{
					System.out.println(" time");
				}
			}
		}
	}
}