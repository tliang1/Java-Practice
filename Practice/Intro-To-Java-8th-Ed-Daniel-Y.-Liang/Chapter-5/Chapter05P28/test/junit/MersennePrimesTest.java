package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MersennePrimes;

/**
 * @author Tony Liang
 *
 */
public class MersennePrimesTest
{
	int[] numbers = { 1, 6, 2, 13 };
	
	@Test
	public void testMersennePrime()
	{
		int[] mersennePrimeNumbers = { 0, 63, 3, 8191 };
		
		for (int number = 0; number < numbers.length; number++)
		{
			assertEquals(mersennePrimeNumbers[number], MersennePrimes.mersennePrime(numbers[number]));
		}
	}
	
	@Test
	public void testIsMersennePrime()
	{
		boolean[] mersennePrimeOrNot = { false, false, true, true };
		
		for (int number = 0; number < numbers.length; number++)
		{
			assertEquals(mersennePrimeOrNot[number], MersennePrimes.isMersennePrime(numbers[number]));
		}
	}
}