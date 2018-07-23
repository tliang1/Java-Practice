package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class CountLettersInAString
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.next();
		
		System.out.println("The total number of letters in " + string + " is " + countLetters(string) + ".");
		
		input.close();
	}
	
	/**
	 * Returns the number of letters in the specified string.
	 * 
	 * @param s		a string
	 * @return		the number of letters in the specified string
	 */
	public static int countLetters(String s)
	{
		int count = 0;
		
		for (int index = 0; index < s.length(); index++)
		{
			if (Character.isLetter(s.charAt(index)))
			{
				count++;
			}
		}
		
		return count;
	}
}