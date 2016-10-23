package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.ApproximateSqrt;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class ApproximateSqrtTest
{
	private double n;
	private double expected;
	
	public ApproximateSqrtTest(double number, double expectedResult)
	{
		this.n = number;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Double[]> approximatedSquareRootsList() 
	{
		return Arrays.asList(new Double[][] { { -5.26, 0.0 }, { 0.0, 0.0 }, { 1.0, 1.0 }, { 2.0, 1.414213 }, { 45.67, 6.757958 }, 
			{ 123.0, 11.090537 } });
	}
	
	@Test
	public void testSqrt()
	{
		assertEquals(expected, ApproximateSqrt.sqrt(n), 0.0001);
	}

}