package main;

/**
 * @author Tony Liang
 *
 */
public class Emirps
{
	public static void main(String[] args)
	{
		printEmirps(100, 10);
	}

	/**
	 * Returns if the integer argument is prime.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 2, the number will be considered not prime.
	 *	</li>
	 * </ul>
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
	 * Returns if the integer argument is a palindrome integer.
	 * 
	 * @param number	an integer
	 * @return			true if the number is a palindrome integer. Otherwise, false.
	 */
	public static boolean isPalindrome(int number)
	{
		return number == reverse(number);
	}
	
	/**
	 * Prints up to the number of emirp numbers specified by the first argument while limiting the emirp numbers
	 * per line by the second argument.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is less than 1, no emirp numbers are displayed.
	 * 	</li>
	 * 	<li>
	 * 		If the second argument is less than 1, it will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param numberOfEmirps	total number of emirp numbers to display
	 * @param maxEmirpsPerLine	max emirp numbers to display per line
	 */
	public static void printEmirps(int numberOfEmirps, int maxEmirpsPerLine)
	{
		if (maxEmirpsPerLine < 1)
		{
			maxEmirpsPerLine = 1;
		}
		
		int count = 1;
		int number = 2;
		
		while (count <= numberOfEmirps)
		{
			if (isPrime(number))
			{
				if (!isPalindrome(number))
				{
					if (isPrime(reverse(number)))
					{
						System.out.printf("%4d ", number);
						
						if ((count % maxEmirpsPerLine == 0) || (count == numberOfEmirps))
						{
							System.out.println();
						}
						
						count++;
					}
				}
			}
			
			number++;
		}
	}
}