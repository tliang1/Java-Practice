package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.LargestElementIndex;

/**
 * @author Tony Liang
 *
 */
public class LargestElementIndexTest
{
	double[][][] listsOfNumbers =
		{
			new double[0][0],
			new double[0][1],
			new double[1][0],
			{
				{ -3 }
			},
			{
				{ 23.5, 35, 2, 10 }, { 4.5, 3, 45, 3.5 }, { 35, 44, 5.5, 9.6 }
			},
			{
				{ 2.2, -7.1 }, { 8.6, 3.1 }, { 6.8, -7.4 }, { 6.3, 1.3 }, { 5, -10 }
			}
		};
	int[][] locations =
		{
			{ -1, -1 },
			{ -1, -1 },
			{ -1, -1 },
			{ 0, 0 },
			{ 1, 2 },
			{ 1, 0 }
		};
	
	@Test
	public void testLocateLargest()
	{
		for (int numbers = 0; numbers < listsOfNumbers.length; numbers++)
		{
			assertArrayEquals(locations[numbers], LargestElementIndex.locateLargest(listsOfNumbers[numbers]));
		}
	}
}