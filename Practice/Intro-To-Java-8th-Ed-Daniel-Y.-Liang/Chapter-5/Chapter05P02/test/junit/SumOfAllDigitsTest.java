package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.SumOfAllDigits;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class SumOfAllDigitsTest
{
	private long n;
	private long expected;
	
	public SumOfAllDigitsTest(long number, long expectedResult)
	{
		this.n = number;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Integer[]> sumDigitsList() 
	{
		return Arrays.asList(new Integer[][] { { -7892, -26 }, { -756, -18 }, { -48, -12 }, { 1, 1 }, { 25, 7 }, 
			{ 234, 9 }, { 999, 27 }, { 2569, 22 }, { 8036, 17 } });
	}
	
	@Test
	public void testSumDigits()
	{
		assertEquals(expected, SumOfAllDigits.sumDigits(n));
	}
}