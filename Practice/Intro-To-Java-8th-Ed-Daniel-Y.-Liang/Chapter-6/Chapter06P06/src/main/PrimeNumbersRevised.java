package main;

/**
 * @author Tony Liang
 *
 */
public class PrimeNumbersRevised
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int[] primes = findAllPrimes(NUMBER_OF_PRIMES);
		
		for (int index = 0; index < primes.length; index++)
		{
			if ((((index > 0) && ((index + 1) % NUMBER_OF_PRIMES_PER_LINE) == 0)) || (index == (primes.length - 1)))
			{
				System.out.println(primes[index]);
			}
			else
			{
				System.out.print(primes[index] + " ");
			}
		}
	}
	
	/**
	 * Returns the first specified number of prime numbers given the integer argument.
	 * <p>
	 * If the integer argument is negative, an empty integer array is returned.
	 * 
	 * @param numberOfPrimes	number of prime numbers to find
	 * @return					the integer array of the first numberOfPrimes prime numbers
	 */
	public static int[] findAllPrimes(int numberOfPrimes)
	{
		if (numberOfPrimes < 0)
		{
			return new int[0];
		}
		
		int[] primes = new int[numberOfPrimes];
		int count = 0;
		int number = 2;
		
		while (count < numberOfPrimes) 
		{
			boolean isPrime = true;
			
			for (int index = 0; (index < count) && (primes[index] <= Math.sqrt(number)); index++) 
			{
				if (number % primes[index] == 0) 
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) 
			{
				primes[count] = number;
				count++;
			}
			
			number++;
		}
		
		return primes;
	}
}