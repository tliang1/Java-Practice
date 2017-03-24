package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.FourSameConsecutiveNumbersInTwoDimensionalArray;

/**
 * @author Tony Liang
 *
 */
public class FourSameConsecutiveNumbersInTwoDimensionalArrayTest
{
	int[][][] listsOfValues =
		{
			new int[0][0],
			{
				{ 1, 2 },
				{ 2, 3 },
			},
			{
				{ 4, 5, 6 },
				{ 7, 8, 9 },
				{ 1, 2, 3 }
			},
			{
				{ 1, 1, 1, 1 },
				{ 1, 6, 1 },
				{ 1, 1 },
				{ 1 }
			},
			{
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 4, 8, 2 },
				{ 7, 1, 9, 3 }
			},
			{
				{ 1, 2, 3, 4 },
				{ 2, 2, 2, 5 },
				{ 3, 5, 6, 7 },
				{ 6, 4, 4, 4 }
			},
			{
				{ 5, 6 },
				{ 3, 4 },
				{ 1, 2 },
				{ 7, 8 },
				{ 9, 1 }
			},
			{
				{ 1, 2, 3, 4, 5, 6 },
				{ 2, 3, 2, 5, 6, 2 }
			},
			{
				{ 1, 4, 5, 7, 9 },
				{ 5, 4, 2, 3, 6 },
				{ 3, 2, 1, 5, 5 },
				{ 2, 4, 8, 2, 0 },
				{ 9, 4, 3, 2, 3 },
				{ 1, 4, 1, 6, 8 },
				{ 0, 0, 9, 3, 2 }
			},
			{
				{ 3, 2, 1 },
				{ 4, 1, 6 },
				{ 1, 9, 8 },
				{ 6, 1, 4 }
			},
			{
				{ 1, 2, 7, 4 },
				{ 5, 7, 2, 8 }
			},
			{
				{ 0, 1, 0, 3, 1, 6, 1 },
				{ 0, 1, 6, 8, 6, 0, 1 },
				{ 5, 6, 2, 1, 8, 2, 9 },
				{ 6, 5, 6, 1, 1, 9, 1 },
				{ 1, 3, 6, 1, 4, 0, 7 },
				{ 3, 3, 3, 3, 4, 0, 7 }
			},
			{
				{ 0, 1, 0, 3, 1, 6, 1 },
				{ 0, 1, 6, 8, 6, 0, 1 },
				{ 5, 5, 2, 1, 8, 2, 9 },
				{ 6, 5, 6, 1, 1, 9, 1 },
				{ 1, 5, 6, 1, 4, 0, 7 },
				{ 3, 5, 3, 3, 4, 0, 7 }
			},
			{
				{ 0, 1, 0, 3, 1, 6, 1 },
				{ 0, 1, 6, 8, 6, 0, 1 },
				{ 5, 6, 2, 1, 6, 2, 9 },
				{ 6, 5, 6, 6, 1, 9, 1 },
				{ 1, 3, 6, 1, 4, 0, 7 },
				{ 3, 6, 3, 3, 4, 0, 7 }
			},
			{
				{ 0, 1, 0, 3, 1, 6, 1 },
				{ 0, 1, 6, 8, 6, 0, 1 },
				{ 9, 6, 2, 1, 8, 2, 9 },
				{ 6, 9, 6, 1, 1, 9, 1 },
				{ 1, 3, 9, 1, 4, 0, 7 },
				{ 3, 3, 3, 9, 4, 0, 7 }
			},
			{
				{ 1, 2, 3, 4, 5, 6, 7, 8 },
				{ 5, 6, 7, 8, 1, 2, 3, 4 },
				{ 9, 9, 9, 9, 9, 9, 0, 9 },
				{ 4, 3, 2, 1, 9, 8, 7, 6 }
			},
			{
				{ 1, 2, 3, 4 },
				{ 5, 6, 3, 7 },
				{ 8, 9, 3, 2 },
				{ 1, 2, 3, 4 },
				{ 5, 6, 3, 7 }
			},
			{
				{ 1, 2, 3, 4, 5, 6, 7, 8, -6 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 1, 2, 3, 4, 5, 6, -6, 8, 9 },
				{ 1, 2, 3, 4, 5, -6, 7, 8, 9 },
				{ 1, 2, 3, 4, -6, 6, 7, 8, 9 },
				{ 1, 2, 3, -6, 5, 6, 7, 8, 9 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 }
			},
			{
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 1, 2, 3, -4, 5, 6, 7, 8, 9 },
				{ 1, 2, 3, 4, -4, 6, 7, 8, 9 },
				{ 1, 2, 3, 4, 5, -4, 7, 8, 9 },
				{ 1, 2, 3, 4, 5, 6, -4, 8, 9 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, -4 }
			}
		};
	boolean[] consecutiveFourOrNot = { false, false, false, false, false, false, false, false, false, false, false,
			true, true, true, true, true, true, true, true };
	
	@Test
	public void testIsConsecutiveFour()
	{
		for (int list = 0; list < listsOfValues.length; list++)
		{
			assertEquals(consecutiveFourOrNot[list],
					FourSameConsecutiveNumbersInTwoDimensionalArray.isConsecutiveFour(listsOfValues[list]));
		}
	}
}