package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.RegularPolygonArea;

/**
 * @author Tony Liang
 *
 */
public class RegularPolygonAreaTest
{
	Collection<Object[]> validPolygons = Arrays.asList(new Object[][] { { 5, 2.0, 6.881909 }, { 3, 4.5, 8.768507 },
		{ 19, 8.312, 1966.641264 } });
	Collection<Object[]> invalidPolygons = Arrays.asList(new Object[][] { { 2, 0.0, 0.0 }, { -9, -4.1, 0.0 }, 
		{ -5, 2.5, 0.0 }, { 10, -3.7, 0.0 } });
	
	@Test
	public void testArea()
	{
		for (Object[] polygon : validPolygons)
		{
			assertEquals((double)(polygon[2]), RegularPolygonArea.area((int)(polygon[0]), (double)(polygon[1])), 
					0.000001);
		}
		
		for (Object[] polygon : invalidPolygons)
		{
			assertEquals((double)(polygon[2]), RegularPolygonArea.area((int)(polygon[0]), (double)(polygon[1])), 
					0.000001);
		}
	}

}