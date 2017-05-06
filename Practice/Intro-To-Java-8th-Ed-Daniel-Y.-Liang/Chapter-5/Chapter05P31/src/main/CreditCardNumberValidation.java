package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class CreditCardNumberValidation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		long creditCardNumber = -1;
		
		while (creditCardNumber < 0)
		{
			System.out.print("Enter a credit card number (Must be positive): ");
			creditCardNumber = input.nextLong();
		}
		
		System.out.print(creditCardNumber + " is ");
		
		if (!isValid(creditCardNumber))
		{
			System.out.print("not ");
		}
		
		System.out.println("a valid credit card number.");
		
		input.close();
	}

	/**
	 * Returns if the long argument is a valid credit card number.
	 * 
	 * @param number	credit card number
	 * @return			true if the number is valid. Otherwise, false.
	 */
	public static boolean isValid(long number)
	{
		if ((getSize(number) >= 13) && (getSize(number) <= 16))
		{
			if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || 
					prefixMatched(number, 6))
			{
				int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
				
				if (sum % 10 == 0)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Returns the sum of all doubled digits in the even places of the long argument from right to left.
	 * <ul>
	 * 	<li>
	 * 		If the long argument is less than 1, the sum will default to 0.
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
	 * @param number	a number
	 * @return			the sum of all doubled digits in the even places of the number from right to left
	 */
	public static int sumOfDoubleEvenPlace(long number)
	{
		if (number < 1)
		{
			return 0;
		}
		
		int sum = 0;
		
		while (number != 0)
		{
			int evenPlaceDigit = (int)((number % 100) / 10);
			
			sum += getDigit(evenPlaceDigit * 2);
			number /= 100;
		}
		
		return sum;
	}
	
	/**
	 * Returns the sum of all digits of the integer argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is negative or greater than 18, the sum will be default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	a positive integer
	 * @return			the sum of all digits of the number
	 */
	public static int getDigit(int number)
	{
		if ((number < 0) || (number > 18))
		{
			return 0;
		}
		
		if (number > 9)
		{
			return (number / 10) + (number % 10);
		}
		else
		{
			return number;
		}
	}
	
	/**
	 * Returns the sum of all digits in the odd places of the long argument from right to left.
	 * <ul>
	 * 	<li>
	 * 		If the number is less than 1, the sum will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	a number
	 * @return			the sum of all digits in the odd places of the number from right to left
	 */
	public static int sumOfOddPlace(long number)
	{
		if (number < 1)
		{
			return 0;
		}
		
		int sum = 0;
		
		while (number != 0)
		{
			sum += number % 10;
			number /= 100;
		}
		
		return sum;
	}
	
	/**
	 * Returns if the second argument is the prefix of the first argument.
	 * <ul>
	 * 	<li>
	 * 		If the first or second argument are negative, the prefix will be considered not a match with the
	 * 		number's prefix.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	a number
	 * @param d			prefix
	 * @return			true if the prefix matches the prefix of the number. Otherwise, false.
	 */
	public static boolean prefixMatched(long number, int d)
	{
		if ((number < 0) || (d < 0))
		{
			return false;
		}
		
		if (d == getPrefix(number, getSize(d)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns the number of digits of the long argument.
	 * <ul>
	 * 	<li>
	 * 		If the long argument is negative, the number of digits will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param d		a number
	 * @return		the number of digits of the number
	 */
	public static int getSize(long d)
	{
		if (d < 0)
		{
			return 0;
		}
		else if (d == 0)
		{
			return 1;
		}
		
		int size = 0;
		
		while (d != 0)
		{
			d /= 10;
			size++;
		}
		
		return size;
	}
	
	/**
	 * Returns the first k digits of the long argument.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is less than the first k digits or is negative or the second argument is less
	 * 		than 1, the first argument is the prefix.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	a number
	 * @param k			number of digits of the prefix
	 * @return			the first k digits of the number
	 */
	public static long getPrefix(long number, int k)
	{
		if ((number < (int)(Math.pow(10, k))) || (number < 0) || (k < 1))
		{
			return number;
		}
		
		while (number >= (long)(Math.pow(10, k)))
		{
			number /= 10;
		}
		
		return number;
	}
}