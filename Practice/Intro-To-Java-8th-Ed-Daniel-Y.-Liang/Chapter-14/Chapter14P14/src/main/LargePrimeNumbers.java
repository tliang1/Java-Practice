package main;

import java.math.BigInteger;

/**
 * @author Tony Liang
 *
 */
public class LargePrimeNumbers
{
	public static void main(String[] args)
	{
		BigInteger possiblePrime = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.TWO);
		
		final int NUMBER_OF_PRIMES = 5;
		
		for (int count = 0; count < NUMBER_OF_PRIMES;)
		{
			if (possiblePrime.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) != 0)
			{
				if (isPrime(possiblePrime))
				{
					System.out.println(possiblePrime);
					count++;
				}
			}
			
			possiblePrime = possiblePrime.add(BigInteger.TWO);
		}
	}
	
	/**
	 * Returns the integer square root of the given number.
	 * <ul>
	 * 	<li>
	 * 		This method uses the Babylonian method to find the integer square root.
	 * 	</li>
	 * </ul>
	 * 
	 * @param number	a number 
	 * @return			the integer square root of the given number
	 */
	public static BigInteger integerSqrt(BigInteger number)
	{
		BigInteger x = number.divide(BigInteger.TWO);
		
		while (true)
		{
			BigInteger y = x.add(number.divide(x)).divide(BigInteger.TWO);
			
			if (y.compareTo(x) >= 0)
			{
				return x;
			}
			
			x = y;
		}
	}
	
	/**
	 * Returns if the given number is prime.
	 * 
	 * @param number	a number
	 * @return			true if the given number is prime. Otherwise, false.
	 */
	public static boolean isPrime(BigInteger number)
	{
		if ((number.compareTo(BigInteger.TWO) < 0) || ((number.compareTo(BigInteger.TWO) > 0) && 
				(number.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0)))
		{
			return false;
		}
		
		BigInteger sqrtNumber = integerSqrt(number);
		
		for (BigInteger divisor = BigInteger.TWO.add(BigInteger.ONE); divisor.compareTo(sqrtNumber) <= 0; 
				divisor = divisor.add(BigInteger.TWO))
		{
			if (number.mod(divisor).compareTo(BigInteger.ZERO) == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}