package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.ComputeSeries;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class ComputeSeriesTest
{
	private int i;
	private double expected;
	
	public ComputeSeriesTest(int number, double expectedResult)
	{
		this.i = number;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> summationList() 
	{
		return Arrays.asList(new Object[][] { { 0, 4.0 }, { -7, 4.0 }, { 1, 4.0 }, { 20, 3.09162 },
			{ 100, 3.13159 }, { 5, 3.33968 } });
	}
	
	@Test
	public void testComputeSeries()
	{
		assertEquals(expected, ComputeSeries.computeSeries(i), 0.00001);
	}
}