package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class CreditCardNumberValidationRevised
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String creditCardNumber = "";
		
		while (!creditCardNumber.matches("(4\\d{12,15})|(5\\d{12,15})|(6\\d{12,15})|(37\\d{11,14})"))
		{
			System.out.print("Enter a credit card number (Must be positive): ");
			creditCardNumber = input.next();
		}
		
		input.close();
		
		System.out.print(creditCardNumber + " is ");
		
		if (!isValid(creditCardNumber))
		{
			System.out.print("not ");
		}
		
		System.out.println("a valid credit card number.");
	}

	/**
	 * Returns if the given string is a valid credit card number.
	 * 
	 * @param cardNumber	credit card number
	 * @return				true if the given string is a valid credit card number. Otherwise, false.
	 */
	public static boolean isValid(String cardNumber)
	{
		if (cardNumber.matches("(4\\d{12,15})|(5\\d{12,15})|(6\\d{12,15})|(37\\d{11,14})"))
		{
			int sum = sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber);
			
			if (sum % 10 == 0)
			{
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Returns the sum of all doubled digits in the even places of the given string from right to left.
	 * <ul>
	 * 	<li>
	 * 		If the string is not a number or the number is less than 10, the sum will default to 0.
	 * 	</li>
	 * </ul>
	 * <br>
	 * Example: 123456789 
	 * <p>
	 * 8*2 = 16 = 1+6 = 7
	 * <br>
	 * 6*2 = 12 = 1+2 = 3
	 * <br>
	 * 4*2 = 8
	 * <br>
	 * 2*2 = 4
	 * <p>
	 * 7 + 3 + 8 + 4 = 22.
	 * 
	 * @param cardNumber	credit card number
	 * @return				the sum of all doubled digits in the even places of the given string from right to left
	 */
	public static int sumOfDoubleEvenPlace(String cardNumber)
	{
		int sum = 0;
		
		if (cardNumber.matches("\\d+"))
		{
			long number = Long.parseLong(cardNumber);
			
			if (number < 10)
			{
				return 0;
			}
			
			while (number != 0)
			{
				int evenPlaceDigit = (int)((number % 100) / 10);
				sum += getDigit(evenPlaceDigit * 2);
				number /= 100;
			}
		}
		
		return sum;
	}
	
	/**
	 * Returns the sum of all digits of the given integer.
	 * <ul>
	 * 	<li>
	 * 		If the integer is negative or greater than 18, the sum will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	a positive integer
	 * @return			the sum of all digits of the given integer
	 */
	public static int getDigit(int number)
	{
		if ((number >= 0) && (number <= 18))
		{
			if (number > 9)
			{
				return (number / 10) + (number % 10);
			}
			else
			{
				return number;
			}
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Returns the sum of all digits in the odd places of the given string from right to left.
	 * <ul>
	 * 	<li>
	 * 		If the string is not a number or the number is less than 1, the sum will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param cardNumber	credit card number
	 * @return				the sum of all digits in the odd places of the given string from right to left
	 */
	public static int sumOfOddPlace(String cardNumber)
	{
		int sum = 0;
		
		if (cardNumber.matches("\\d+"))
		{
			long number = Long.parseLong(cardNumber);
			
			if (number < 1)
			{
				return 0;
			}
			
			while (number != 0)
			{
				sum += number % 10;
				number /= 100;
			}
		}
		
		return sum;
	}
}