package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.MyTriangle;

/**
 * @author Tony Liang
 *
 */
public class MyTriangleTest
{
	
	@Test
	public void testIsValid()
	{
		Collection<Double[]> validSides = Arrays.asList(new Double[][] { { 2.5, 2.0, 1.0 }, { 2.0, 4.0, 5.0 }, 
			{ 5.0, 4.0, 3.0 }, { 5.6, 10.1, 5.2 } });
		Collection<Double[]> invalidSides = Arrays.asList(new Double[][] { { 1.0, 2.5, 1.0 }, { 6.0, 8.0, 14.0 },
			{ 5.0, 15.0, 10.0 }, { 30.1, 0.8, 31.0 }, { 0.0, 0.0, 0.0 }, { -5.0, 6.0, -3.0 } });
		
		for (Double[] sides : validSides)
		{
			assertTrue(MyTriangle.isValid(sides[0], sides[1], sides[2]));
		}
		
		for (Double[] sides : invalidSides)
		{
			assertFalse(MyTriangle.isValid(sides[0], sides[1], sides[2]));
		}
	}
	
	@Test
	public void testArea()
	{
		Collection<Double[]> validSides = Arrays.asList(new Double[][] { { 2.5, 2.0, 1.0, 0.94 }, 
			{ 2.0, 4.0, 5.0, 3.79 }, { 5.0, 4.0, 3.0, 6.0 }, { 5.6, 10.1, 5.2, 9.65 } });
		Collection<Double[]> invalidSides = Arrays.asList(new Double[][] { { 0.0, 0.0, 0.0, 0.0 }, 
			{ -5.0, 6.0, -3.0, 0.0 } });
		
		for (Double[] sides : validSides)
		{
			assertEquals(sides[3], MyTriangle.area(sides[0], sides[1], sides[2]), 0.05);
		}
		
		for (Double[] sides : invalidSides)
		{
			assertEquals(sides[3], MyTriangle.area(sides[0], sides[1], sides[2]), 0.05);
		}
	}

}