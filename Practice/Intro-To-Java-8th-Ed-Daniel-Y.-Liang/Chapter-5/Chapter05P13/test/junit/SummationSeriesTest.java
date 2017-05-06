package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.SummationSeries;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class SummationSeriesTest
{
	private int i;
	private double expected;
	
	public SummationSeriesTest(int number, double expectedResult)
	{
		this.i = number;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> summationList() 
	{
		return Arrays.asList(new Object[][] { { 0, 0.0 }, { -5, 0.0 }, { 1, 0.5 }, { 19, 16.4023 } });
	}
	
	@Test
	public void testComputeSummationSeries()
	{
		assertEquals(expected, SummationSeries.computeSummationSeries(i), 0.0001);
	}
}