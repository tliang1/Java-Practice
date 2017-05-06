package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ComputeGCD;

/**
 * @author Tony Liang
 *
 */
public class ComputeGCDTest
{
	int[][] listsOfNumbers =
		{
			{ },
			{ 0, 0, 0, 0 },
			{ 7 },
			{ -64, 46, 92, -12, -2 },
			{ 20, 10, 0, 5, 0, 15, 30 },
			{ 208, 156, 52, 104, 130, 312, 117, 234, 182, 351, 338, 26, 286 }
		};
	int[] gcds = { 0, 0, 7, 2, 5, 13 };
	
	@Test
	public void testGCD()
	{
		for (int index = 0; index < listsOfNumbers.length; index++)
		{
			assertEquals(gcds[index], ComputeGCD.gcd(listsOfNumbers[index]));
		}
	}
}