package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.PalindromeInteger;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class PalindromeIntegerTest
{
	private int n;
	private boolean expected;
	
	public PalindromeIntegerTest(int number, boolean expectedResult)
	{
		this.n = number;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> palindromeIntegersList() 
	{
		return Arrays.asList(new Object[][] { { -58325, false }, { -4884, true }, { 1234, false }, { 121, true }, 
			{ 1, true }, { 40504, true }, { 21872, false }, { 0, true } });
	}

	@Test
	public void testIsPalindrome()
	{
		assertEquals(expected, PalindromeInteger.isPalindrome(n));
	}
}