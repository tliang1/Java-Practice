package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.PentagonArea;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class PentagonAreaTest
{
	private double s;
	private double expected;
	
	public PentagonAreaTest(double side, double expectedResult)
	{
		this.s = side;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Double[]> pentagonalAreasList() 
	{
		return Arrays.asList(new Double[][] { { 2.0, 6.881909 }, { 0.0, 0.0 }, { 10.0, 172.04774 }, { -9.0, 0.0 } });
	}
	
	@Test
	public void testPentagonArea()
	{
		assertEquals(expected, PentagonArea.pentagonArea(s), 0.000001);
	}

}