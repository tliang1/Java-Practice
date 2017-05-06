package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.IdenticalArrays;

/**
 * @author Tony Liang
 *
 */
public class IdenticalArraysTest
{
	int[][] list1Lists =
		{
			{ 5, 5, 6, 6, 1 },
			{ 2 },
			{ },
			{ 2, 5, 6, 1, 6 },
			{ 2, 5, 6, 6, 1 }
		};
	int[][] list2Lists =
		{
			{ 2, 5, 6, 1, 6 },
			{ 1, 2 },
			{ },
			{ 2, 5, 6, 1, 6 },
			{ 5, 2, 6, 1, 6 }
		};
	boolean[] equalOrNot = { false, false, true, true, true };
	
	@Test
	public void testEquals()
	{
		for (int list = 0; list < list1Lists.length; list++)
		{
			assertEquals(equalOrNot[list], IdenticalArrays.equal(list1Lists[list], list2Lists[list]));
		}
	}
}