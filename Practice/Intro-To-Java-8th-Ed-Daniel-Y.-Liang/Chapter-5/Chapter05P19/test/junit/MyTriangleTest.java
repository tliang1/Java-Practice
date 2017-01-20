package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MyTriangle;

/**
 * @author Tony Liang
 *
 */
public class MyTriangleTest
{
	double[][] listsOfSides =
		{
			{ -5.0, 6.0, -3.0 },
			{ 0.0, 0.0, 0.0 },
			{ 1.0, 2.5, 1.0 },
			{ 5.0, 15.0, 10.0 },
			{ 6.0, 8.0, 14.0 },
			{ 30.1, 0.8, 31.0 },
			{ 2.0, 4.0, 5.0 }, 
			{ 2.5, 2.0, 1.0 },
			{ 5.0, 4.0, 3.0 },
			{ 5.6, 10.1, 5.2 }
		};
	
	@Test
	public void testIsValid()
	{
		boolean[] validSidesOrNot = { false, false, false, false, false, false, true, true, true, true };
		
		for (int sides = 0; sides < validSidesOrNot.length; sides++)
		{
			assertEquals(validSidesOrNot[sides],
					MyTriangle.isValid(listsOfSides[sides][0], listsOfSides[sides][1], listsOfSides[sides][2]));
		}
	}
	
	@Test
	public void testArea()
	{
		double[] areas = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3.79, 0.94, 6.0, 9.65 };
		
		for (int sides = 0; sides < areas.length; sides++)
		{
			assertEquals(areas[sides],
					MyTriangle.area(listsOfSides[sides][0], listsOfSides[sides][1], listsOfSides[sides][2]), 0.05);
		}
	}
}