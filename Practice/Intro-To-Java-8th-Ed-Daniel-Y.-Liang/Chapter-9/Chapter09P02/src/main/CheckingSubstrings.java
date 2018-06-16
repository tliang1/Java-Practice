package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class CheckingSubstrings
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String firstString = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String secondString = input.nextLine();
		
		if (isSubstringOf(firstString, secondString))
		{
			System.out.println("The first string is a substring of the second.");
		}
		else
		{
			System.out.println("The first string is not a substring of the second.");
		}
		
		input.close();
	}
	
	/**
	 * Returns if the first string is a substring of the second string.
	 * <ul>
	 * 	<li>
	 * 		If the first string's length is larger than the second string's length, it will default to false.
	 * 	</li>
	 * 	<li>
	 * 		If the first string's length is equal to the second string's length, it checks if the strings are equal.
	 * 	</li>
	 * </ul>
	 * 
	 * @param firststring	the first string
	 * @param secondString	the second string
	 * @return				true if the first string is a substring of the second string. Otherwise, false.
	 */
	public static boolean isSubstringOf(String firststring, String secondString)
	{
		int substringLength = firststring.length();
		int stringLength = secondString.length();
		
		if (substringLength > stringLength)
		{
			return false;
		}
		else if (substringLength == stringLength)
		{
			return firststring.equals(secondString);
		}
		else
		{
			for (int index = 0; index <= (stringLength - substringLength); index++)
			{
				if (secondString.charAt(index) == firststring.charAt(0))
				{
					if (firststring.equals(secondString.substring(index, index + substringLength)))
					{
						return true;
					}
				}
			}
			
			return false;
		}
	}
}