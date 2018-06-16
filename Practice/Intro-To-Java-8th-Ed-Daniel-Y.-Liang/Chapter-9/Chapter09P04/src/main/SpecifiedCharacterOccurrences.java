package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SpecifiedCharacterOccurrences
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.next();
		
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		
		System.out.println("The number of occurrences of '" + character + "' in " + string + " is " + count(string, character) + ".");
		
		input.close();
	}
	
	/**
	 * Returns the number of occurrences of the specified character in the specified string.
	 * 
	 * @param str	the string
	 * @param a		the character
	 * @return		the number of occurrences of the specified character in the specified string.
	 */
	public static int count(String str, char a)
	{
		int occurrences = 0;
		
		for (int index = 0; index < str.length(); index++)
		{
			if (str.charAt(index) == a)
			{
				occurrences++;
			}
		}
		
		return occurrences;
	}
}