package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.PentagonalNumbers;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class PentagonalNumbersTest
{
	private int n;
	private int expected;
	
	public PentagonalNumbersTest(int number, int expectedResult)
	{
		this.n = number;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Integer[]> pentagonalNumbersList() 
	{
		return Arrays.asList(new Integer[][] { { -5, 40 }, { -3, 15 }, { 1, 1 }, { 2, 5 }, { 3, 12 }, { 4, 22 }, 
			{ 17, 425}, { 50, 3725 }, { 83, 10292 }, { 100, 14950} });
	}

	
	@Test
	public void testGetPentagonalNumber()
	{
		assertEquals(expected, PentagonalNumbers.getPentagonalNumber(n));
	}

}