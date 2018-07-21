package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class CommonPrefix
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String firstString = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String secondString = input.nextLine();
		
		input.close();
		
		System.out.println("The common prefix of \"" + firstString + "\" and \"" + secondString + "\" is \"" + 
								prefix(firstString, secondString) + "\".");
	}
	
	/**
	 * Returns the common prefix of the two given strings.
	 * 
	 * @param s1	the first string
	 * @param s2	the second string
	 * @return		the common prefix of the two given strings
	 */
	public static String prefix(String s1, String s2)
	{
		int smallestSize = (s1.length() > s2.length()) ? s2.length() : s1.length();
		
		StringBuilder commonPrefix = new StringBuilder();
		
		for (int index = 0; index < smallestSize; index++)
		{
			char currentCharacter = s1.charAt(index);
			
			if (currentCharacter == s2.charAt(index))
			{
				commonPrefix.append(currentCharacter);
			}
			else
			{
				break;
			}
		}
		
		return commonPrefix.toString();
	}
}