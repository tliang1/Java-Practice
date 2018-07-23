package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TranslatePhoneNumberLettersToDigits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String phoneNumber = input.next();
		
		printPhoneNumberDigits(phoneNumber);
		
		input.close();
	}
	
	/**
	 * Returns the phone digit given the uppercase letter.
	 * <ul>
	 * 	<li>
	 * 		If the character is not between A to Z inclusive, the phone digit will default to -1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param uppercaseLetter	an uppercase letter
	 * @return					the phone digit
	 */
	public static int getNumber(char uppercaseLetter)
	{
		if ((uppercaseLetter >= 'A') && (uppercaseLetter <= 'C'))
		{
			return 2;
		}
		else if ((uppercaseLetter >= 'D') && (uppercaseLetter <= 'F'))
		{
			return 3;
		}
		else if ((uppercaseLetter >= 'G') && (uppercaseLetter <= 'I'))
		{
			return 4;
		}
		else if ((uppercaseLetter >= 'J') && (uppercaseLetter <= 'L'))
		{
			return 5;
		}
		else if ((uppercaseLetter >= 'M') && (uppercaseLetter <= 'O'))
		{
			return 6;
		}
		else if ((uppercaseLetter >= 'P') && (uppercaseLetter <= 'S'))
		{
			return 7;
		}
		else if ((uppercaseLetter >= 'T') && (uppercaseLetter <= 'V'))
		{
			return 8;
		}
		else if ((uppercaseLetter >= 'W') && (uppercaseLetter <= 'Z'))
		{
			return 9;
		}
		else
		{
			return -1;
		}
	}
	
	/**
	 * Converts each letter in the specified phone number into their corresponding digit and prints the phone number. 
	 * 
	 * @param phoneNumber	a phone number
	 */
	public static void printPhoneNumberDigits(String phoneNumber)
	{
		for (int index = 0; index < phoneNumber.length(); index++)
		{
			char currentNumber = phoneNumber.charAt(index);
			
			if (Character.isLetter(currentNumber))
			{
				System.out.print(getNumber(Character.toUpperCase(currentNumber)));
			}
			else
			{
				System.out.print(currentNumber);
			}
		}
		
		System.out.println();
	}
}