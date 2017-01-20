package main;

/**
 * @author Tony Liang
 *
 */
public class MersennePrimes
{
	public static void main(String[] args)
	{
		System.out.printf("%2s\t   %10s", "p", "2&p - 1");
		System.out.println();
		
		final int MAX_NUMBER = 31;
		int number = 2;
		
		while (number <= MAX_NUMBER)
		{
			if (isMersennePrime(number))
			{
				System.out.printf("%2d\t%10d\n", number, mersennePrime(number));
			}
			
			number++;
		}
		
		System.out.println();
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
	 * Returns the Mersenne prime number using the integer argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 2, the Mersenne prime number will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	a number
	 * @return			the Mersenne prime number
	 */
	public static int mersennePrime(int number)
	{
		if (number < 2)
		{
			return 0;
		}
		
		return (int)(Math.pow(2, number) - 1);
	}
	
	/**
	 * Returns if the integer argument generates a Mersenne prime number.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 2, the number will be considered not able to generate a Mersenne
	 * 		prime number.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	a number
	 * @return			true if the number generates a Mersenne prime number. Otherwise, false.
	 */
	public static boolean isMersennePrime(int number)
	{
		if (number < 2)
		{
			return false;
		}
		
		return isPrime(mersennePrime(number));
	}
}