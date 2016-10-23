package main;

/**
 * @author Tony Liang
 *
 */
public class PalindromePrimes
{
	
	public static void main(String[] args)
	{
		printPalindromePrimes(100, 10);
	}

	/**
	 * Returns if the number is prime.
	 * <p>
	 * If the integer argument is less than 2, the number will be considered not prime.
	 * 
	 * @param number	a number
	 * @return			true if number is prime. Otherwise, false.
	 */
	public static boolean isPrime(int number)
	{
		if (number < 2)
		{
			return false;
		}
		
		for (int divisor = 2; divisor <= number / 2; divisor++) 
		{
			if (number % divisor == 0) 
			{
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Returns the reverse of an integer.
	 * 
	 * @param number	an integer
	 * @return			reverse of the integer
	 */
	public static int reverse(int number)
	{
		if (number == 0)
		{
			return 0;
		}
		
		String reverseNumberString = "";
		
		if (number < 0)
		{
			reverseNumberString = "-";
		}
		
		while (number != 0)
		{
			reverseNumberString += (int)(Math.abs((number % 10)));
			number /= 10;
		}
		
		return Integer.parseInt(reverseNumberString);
	}
	
	/**
	 * Returns if an integer is a palindrome integer.
	 * 
	 * @param number	an integer
	 * @return			true if integer is palindrome. Otherwise, false.
	 */
	public static boolean isPalindrome(int number)
	{
		return number == reverse(number);
	}
	
	/**
	 * Prints up to the number of palindrome prime numbers specified by the first argument while limiting the 
	 * numbers per line by the second argument.
	 * <p>
	 * If the first argument is less than 1, no palindrome prime numbers are displayed.
	 * <p>
	 * If the second argument is less than 1, it will default to 1.
	 * 
	 * @param numberOfPalindromePrimes		total number of palindrome prime numbers to display
	 * @param maxPalindromePrimesPerLine	max palindrome prime numbers to display per line
	 */
	public static void printPalindromePrimes(int numberOfPalindromePrimes, int maxPalindromePrimesPerLine)
	{
		if (maxPalindromePrimesPerLine < 1)
		{
			maxPalindromePrimesPerLine = 1;
		}
		
		int count = 1;
		int number = 2;
		
		while (count <= numberOfPalindromePrimes)
		{
			if (isPrime(number))
			{
				if (isPalindrome(number))
				{
					System.out.printf("%5d ", number);
					
					if ((count % maxPalindromePrimesPerLine == 0) || (count == numberOfPalindromePrimes))
					{
						System.out.println();
					}
					
					count++;
				}
			}
			
			number++;
		}
	}
}