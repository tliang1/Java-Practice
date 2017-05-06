package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.EliminatingDuplicates;

/**
 * @author Tony Liang
 *
 */
public class EliminatingDuplicatesTest
{
	int[][] listsOfIntegers =
		{
			{ },
			{ 1 },
			{ 3, 3, 3 },
			{ 10, 13, 13, 13, 6, 13, 6 },
			{ 1, 2, 3, 2, 1, 6, 3, 4, 5, 2 },
			{ 4, 1, 4, 4, 6, 6, 14, 19, 11, 9, 19, 3, 20, 8, 1, 18, 17 }
		};
	int[][] listsOfDistinctIntegers =
		{
			{ },
			{ 1 },
			{ 3 },
			{ 10, 13, 6 },
			{ 1, 2, 3, 6, 4, 5 },
			{ 4, 1, 6, 14, 19, 11, 9, 3, 20, 8, 18, 17 }
		};
	
	@Test
	public void test()
	{
		for (int index = 0; index < listsOfIntegers.length; index++)
		{
			assertArrayEquals(listsOfDistinctIntegers[index], 
					EliminatingDuplicates.eliminateDuplicates(listsOfIntegers[index]));
		}
	}
}