package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.CelsiusAndFahrenheit;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class CelsiusAndFahrenheitTest
{
	private double celsius;
	private double expected;
	
	public CelsiusAndFahrenheitTest(double celsiusInDegrees, double expectedResult)
	{
		this.celsius = celsiusInDegrees;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> fahrenheitValuesList() 
	{
		return Arrays.asList(new Object[][] { { -57.0, -70.6 }, { -24.0, -11.2 }, { 40.0, 104.0 }, { 35.0, 95.0 }, 
			{ 10.0, 50.0 }, { 43.0, 109.4 } });
	}
	
	@Test
	public void testCelsiusToFahrenheit()
	{
		assertEquals(expected, CelsiusAndFahrenheit.celsiusToFahrenheit(celsius), 0.1);
	}

	@Test
	public void testFahrenheitToCelsius()
	{
		assertEquals(celsius, CelsiusAndFahrenheit.fahrenheitToCelsius(expected), 0.1);
	}
}