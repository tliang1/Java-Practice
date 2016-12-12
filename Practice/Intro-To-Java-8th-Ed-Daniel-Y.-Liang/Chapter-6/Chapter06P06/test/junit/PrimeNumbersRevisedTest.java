package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.PrimeNumbersRevised;

/**
 * @author Tony Liang
 *
 */
public class PrimeNumbersRevisedTest
{
	int[] numberOfPrimes = { -4, 0, 1, 7, 10, 50};
	int[][] listOfPrimes = new int[][] { { }, { }, { 2 }, { 2, 3, 5, 7, 11, 13, 17 }, 
		{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 }, 
		{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 
			107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223,
			227, 229 } };
	
	@Test
	public void testFindAllPrimes()
	{
		for (int index = 0; index < numberOfPrimes.length; index++)
		{
			assertArrayEquals(listOfPrimes[index], PrimeNumbersRevised.findAllPrimes(numberOfPrimes[index]));
		}
	}
}