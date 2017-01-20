package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.NumberOfPrimeNumbers;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class NumberOfPrimeNumbersTest
{
	private int max;
	private int expected;
	
	public NumberOfPrimeNumbersTest(int maxNumber, int expectedResult)
	{
		this.max = maxNumber;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Integer[]> primeNumbersTotalList() 
	{
		return Arrays.asList(new Integer[][] { { 2, 0 }, { 230, 50 }, { 10000, 1229 }, { 18, 7 }, { 100, 25 } });
	}
	
	@Test
	public void testTotalPrimeNumbers()
	{
		assertEquals(expected, NumberOfPrimeNumbers.totalPrimeNumbers(max));
	}
}