package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.RegularPolygonArea;

/**
 * @author Tony Liang
 *
 */
public class RegularPolygonAreaTest
{
	int[] numberOfSides = { -9, -5, 2, 10, 5, 3, 19 };
	double[] sides = { -4.1, 2.5, 0.0, -3.7, 2.0, 4.5, 8.312 };
	double[] areas = { 0.0, 0.0, 0.0, 0.0, 6.881909, 8.768507, 1966.641264 };
	
	@Test
	public void testArea()
	{
		for (int polygon = 0; polygon < numberOfSides.length; polygon++)
		{
			assertEquals(areas[polygon], RegularPolygonArea.area(numberOfSides[polygon], sides[polygon]), 0.000001);
		}
	}
}