package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class DigitOccurrences
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.next();
		
		int[] counts = count(string);
		
		for (int number = 0; number < counts.length; number++)
		{
			System.out.println("The number of occurrences of " + number + " in the string is " + counts[number] + ".");
		}
		
		input.close();
	}
	
	/**
	 * Returns the array of integers that holds the number of occurrences of each digit in the specified string.
	 * 
	 * @param s	the string
	 * @return	the array of integers that holds the number of occurrences of each digit in the specified string
	 */
	public static int[] count(String s)
	{
		int[] counts = new int[10];
		
		for (int number = 0; number < counts.length; number++)
		{
			for (int index = 0; index < s.length(); index++)
			{
				char currentCharacter = s.charAt(index);
				
				if (Character.isDigit(currentCharacter))
				{
					if ((currentCharacter - '0') == number)
					{
						counts[number]++;
					}
				}
			}
		}
		
		return counts;
	}
}