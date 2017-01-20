package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ReverseTenIntegers;

/**
 * @author Tony Liang
 *
 */
public class ReverseTenIntegersTest
{
	int[][] listsOfIntegers =
		{
			{ },
			{ 4 },
			{ 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 },
			{ 3, 0, 34, 7, -8, 2, -2, 5, 25 }
		};
	int[][] listsOfReverseIntegers =
		{
			{ },
			{ 4 },
			{ 10, 8, 6, 4, 2, 9, 7, 5, 3, 1 },
			{ 25, 5, -2, 2, -8, 7, 34, 0, 3 }
		};
	
	@Test
	public void testReverse()
	{
		for (int index = 0; index < listsOfIntegers.length; index++)
		{
			assertArrayEquals(listsOfReverseIntegers[index], ReverseTenIntegers.reverse(listsOfIntegers[index]));
		}
	}
}