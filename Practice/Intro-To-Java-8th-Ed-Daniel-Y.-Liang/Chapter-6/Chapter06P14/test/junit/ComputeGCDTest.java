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
	int[][] numbers = { { }, { 7 }, { -64, 46, 92, -12, -2 }, 
			{ 208, 156, 52, 104, 130, 312, 117, 234, 182, 351, 338, 26, 286 } };
	int[] gcds = { 0, 7, 2, 13 };
	
	@Test
	public void testGCD()
	{
		for (int index = 0; index < numbers.length; index++)
		{
			assertEquals(gcds[index], ComputeGCD.gcd(numbers[index]));
		}
	}
}