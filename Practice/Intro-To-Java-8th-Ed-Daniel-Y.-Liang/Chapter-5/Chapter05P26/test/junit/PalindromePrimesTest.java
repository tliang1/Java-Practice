package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.PalindromePrimes;

/**
 * @author Tony Liang
 *
 */
public class PalindromePrimesTest
{
	
	Collection<Object[]> numbers = Arrays.asList(new Object[][] { { 2, true, 2, true }, { 787, true, 787, true },
		{ 34543, true, 34543, true }, { 1, false, 1, true }, { 0, false, 0, true }, { -5, false, -5, true }, 
		{ -50, false, -5, false }, { 17, true, 71, false }, { 129, false, 921, false } }); 
	
	@Test
	public void testIsPrime()
	{
		for (Object[] number : numbers)
		{
			int num = (int) number[0];
			assertEquals(number[1], PalindromePrimes.isPrime(num));
		}
	}
	
	@Test
	public void testReverse()
	{
		for (Object[] number : numbers)
		{
			int num = (int) number[0];
			assertEquals(number[2], PalindromePrimes.reverse(num));
		}
	}
	
	@Test
	public void testIsPalindrome()
	{
		for (Object[] number : numbers)
		{
			int num = (int) number[0];
			assertEquals(number[3], PalindromePrimes.isPalindrome(num));
		}
	}

}