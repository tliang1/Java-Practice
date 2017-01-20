package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.PalindromePrimes;

/**
 * @author Tony Liang
 *
 */
public class PalindromePrimesTest
{
	int[] numbers = { -50, 129, -5, 0, 1, 17, 2, 787, 34543 };
	
	@Test
	public void testIsPrime()
	{
		boolean[] primeOrNot = { false, false, false, false, false, true, true, true, true };
		
		for (int number = 0; number < numbers.length; number++)
		{
			assertEquals(primeOrNot[number], PalindromePrimes.isPrime(numbers[number]));
		}
	}
	
	@Test
	public void testReverse()
	{
		int[] reverseNumbers = { -5, 921, -5, 0, 1, 71, 2, 787, 34543 };
		
		for (int number = 0; number < numbers.length; number++)
		{
			assertEquals(reverseNumbers[number], PalindromePrimes.reverse(numbers[number]));
		}
	}
	
	@Test
	public void testIsPalindrome()
	{
		boolean[] palindromeOrNot = { false, false, true, true, true, false, true, true, true };
		
		for (int number = 0; number < numbers.length; number++)
		{
			assertEquals(palindromeOrNot[number], PalindromePrimes.isPalindrome(numbers[number]));
		}
	}
}