package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.StrictlyIdenticalArrays;

/**
 * @author Tony Liang
 *
 */
public class StrictlyIdenticalArraysTest
{
	int[][] list1Lists =
		{
			{ 2, 5, 6, 6, 1 },
			{ 2 },
			{ },
			{ 2, 5, 6, 1, 6 }
		};
	int[][] list2Lists =
		{
			{ 2, 5, 6, 1, 6 },
			{ 1, 2 },
			{ },
			{ 2, 5, 6, 1, 6 }
		};
	boolean[] equalOrNot = { false, false, true, true };
	
	@Test
	public void testEqual()
	{
		for (int list = 0; list < list1Lists.length; list++)
		{
			assertEquals(equalOrNot[list], StrictlyIdenticalArrays.equal(list1Lists[list], list2Lists[list]));
		}
	}
}