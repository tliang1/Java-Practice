package main;

/**
 * @author Tony Liang
 *
 */
public class TwinPrimes
{
	public static void main(String[] args)
	{
		printTwinPrimes(1000);
	}

	/**
	 * Returns if the integer argument is prime.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 2, the number will be considered not prime.
	 * 	</li>
	 * </ul>
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
	 * Prints twin primes up to, not including, the integer argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 3, no twin prime numbers are displayed.
	 * 	</li>
	 * </ul>
	 * 
	 * @param maxNumber		max number
	 */
	public static void printTwinPrimes(int maxNumber)
	{
		int twinPrimeLeft = 2;
		
		for (int number = 3; number < maxNumber; number++)
		{
			if (isPrime(number))
			{
				if ((number - twinPrimeLeft) == 2)
				{
					System.out.println("(" + twinPrimeLeft + ", " + number + ")");
				}
				
				twinPrimeLeft = number;
			}
		}
	}
}