package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ISBNRevised
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String firstNineDigitsOfISBN = "";
		
		while (!firstNineDigitsOfISBN.matches("\\d{9}"))
		{
			System.out.print("Enter the first nine digits of ISBN (Must be positive): ");
			firstNineDigitsOfISBN = input.next();
		}
		
		input.close();
		
		System.out.print("The ISBN for " + firstNineDigitsOfISBN + " is " + getISBN(firstNineDigitsOfISBN));
	}
	
	/**
	 * Returns the ISBN given the first nine digits of the ISBN as a string.
	 * <ul>
	 * 	<li>
	 * 		If the given string is not a nine digits integer, the string is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param firstNineDigitsOfTheISBN	the first nine digits of the ISBN
	 * @return							the ISBN
	 */
	public static String getISBN(String firstNineDigitsOfTheISBN)
	{
		if (firstNineDigitsOfTheISBN.matches("\\d{9}"))
		{
			StringBuilder iSBN = new StringBuilder(firstNineDigitsOfTheISBN);
			
			int checkSum = 0;
			
			for (int index = 0; index < firstNineDigitsOfTheISBN.length(); index++)
			{
				checkSum += Character.getNumericValue(firstNineDigitsOfTheISBN.charAt(index)) * (index + 1);
			}
			
			checkSum %= 11;
			
			if (checkSum == 10)
			{
				iSBN.append("X");
			}
			else
			{
				iSBN.append(checkSum);
			}
			
			return iSBN.toString();
		}
		
		return firstNineDigitsOfTheISBN;
	}
}