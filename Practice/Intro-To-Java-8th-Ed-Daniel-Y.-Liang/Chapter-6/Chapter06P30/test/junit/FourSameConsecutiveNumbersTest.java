package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.FourSameConsecutiveNumbers;

/**
 * @author Tony Liang
 *
 */
public class FourSameConsecutiveNumbersTest
{
	int[][] listsOfValues =
		{
			{ },
			{ 1 },
			{ 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9, 10 },
			{ 4, 4, 4, 4 },
			{ 3, 2, 2, 2, 5, 4, 1, 6 },
			{ 7, 7, 7, 7, 9, 8, 1, 6 },
			{ 5, 1, 9, 9, 9, 9, 7, 1 }, 
			{ 8, 2, 1, 3, 3, 3, 6, 3, 3, 3, 3, 3, 9 }
		};
	boolean[] consecutiveOrNot = { false, false, false, false, false, true, false, true, true, true };
	
	@Test
	public void testIsConsecutiveFour()
	{
		for (int list = 0; list < listsOfValues.length; list++)
		{
			assertEquals(consecutiveOrNot[list], FourSameConsecutiveNumbers.isConsecutiveFour(listsOfValues[list]));
		}
	}
}