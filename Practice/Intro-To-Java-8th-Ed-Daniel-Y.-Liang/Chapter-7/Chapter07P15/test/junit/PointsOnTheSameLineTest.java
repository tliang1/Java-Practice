package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.PointsOnTheSameLine;

/**
 * @author Tony Liang
 *
 */
public class PointsOnTheSameLineTest
{
	double[][][] sets = 
		{
			{ { 0 }, { 1, 2 }, { 3, 4, 5 } },
			{ { 6, 7 } },
			{ { 8, 9 }, { 10, 11 } },
			{ { 1, 2 }, { 1, 2 } },
			{ { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 } },
			{ { 0, 1 }, { 1, 2 }, { 4, 5 }, { 5, 6 } },
			{ { 0, 1 }, { 1, 2 }, { 4, 5 }, { 4.5, 4 } },
			{ { 1, 1 }, { 1, 2 }, { 1, 3 } },
			{ { 5, 1 }, { 6, 1 }, { 7, 1 }, { 8, 1 }, { 9, 1 } },
			{ { 2.3, 6.1 }, { 4.9, 1.8 }, { 0.5, 8.4 }, { -10.6, 13.9 } }
		};
	int[] numberOfCoordinates = { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
	boolean[] sameNumberOfCoordinates = { false, true, true, true, true, true, true, true, true, true };
	boolean[] onTheSameLine = { false, true, true, true, true, true, false, true, true, false };
	
	@Test
	public void testIsSameNumberOfCoordinates()
	{
		for (int set = 0; set < sets.length; set++)
		{
			assertEquals(sameNumberOfCoordinates[set], PointsOnTheSameLine.isSameNumberOfCoordinates(sets[set], 
					numberOfCoordinates[set]));
		}
	}
	
	@Test
	public void testIsOnTheSameLine()
	{
		for (int set = 0; set < sets.length; set++)
		{
			assertEquals(onTheSameLine[set], PointsOnTheSameLine.isOnTheSameLine(sets[set]));
		}
	}
}