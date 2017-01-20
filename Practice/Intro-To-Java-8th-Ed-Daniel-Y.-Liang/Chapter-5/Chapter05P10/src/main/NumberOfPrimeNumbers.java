package main;

/**
 * @author Tony Liang
 *
 */
public class NumberOfPrimeNumbers
{
	public static void main(String[] args)
	{
		final int MAX_NUMBER = 10000;
		
		System.out.println("The number of prime numbers less than " + MAX_NUMBER + " is " + 
				totalPrimeNumbers(MAX_NUMBER));
	}

	/**
	 * Returns the number of prime numbers less than the integer argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 3, the number of prime numbers will default to be 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param maxNumber		max range
	 * @return				the number of prime numbers
	 */
	public static int totalPrimeNumbers(int maxNumber)
	{
		if (maxNumber < 3)
		{
			return 0;
		}
		
		int totalPrimes = 0;
		int number = 2;
		
		while (number < maxNumber) 
		{
			if (isPrime(number))
			{
				totalPrimes++;
			}
			
			number++;
		}
		
		return totalPrimes;
	}
	
	/**
	 * Returns if the integer argument is prime.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 2, the integer is not prime.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	an integer to test for primeness
	 * @return			true if the number is prime. Otherwise, false.
	 */
	public static boolean isPrime(int number)
	{
		if (number < 2)
		{
			return false;
		}
		
		for (int divisor = 2; divisor <= (number / 2); divisor++)
		{
			if (number % divisor == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}