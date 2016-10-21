package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.FeetAndMeters;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class FeetAndMetersTest
{
	private double feet;
	private double expected;
	
	public FeetAndMetersTest(double feet, double expectedResult)
	{
		this.feet = feet;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> meterValuesList() 
	{
		return Arrays.asList(new Object[][] { { 3.0, 0.915 }, { 8.0, 2.44 }, { 16.0, 4.88 }, { 26.0, 7.93 } });
	}
	
	@Test
	public void testFootToMeter()
	{
		assertEquals(expected, FeetAndMeters.footToMeter(feet), 
				0.1);
	}

	@Test
	public void testMeterToFoot()
	{
		assertEquals(feet, FeetAndMeters.meterToFoot(expected), 
				0.1);
	}

}