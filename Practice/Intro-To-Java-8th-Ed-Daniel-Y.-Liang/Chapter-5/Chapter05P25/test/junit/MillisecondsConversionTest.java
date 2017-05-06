package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.MillisecondsConversion;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class MillisecondsConversionTest
{
	private long millis;
	private String expected;
	
	public MillisecondsConversionTest(long milliseconds, String expectedResult)
	{
		this.millis = milliseconds;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> millisConvertStringsList() 
	{
		return Arrays.asList(new Object[][] { { -1234, "0:0:0" }, { 0, "0:0:0" }, { 5500, "0:0:5" },
			{ 100000, "0:1:40" }, { 555550000, "154:19:10" } });
	}
	
	@Test
	public void testConvertMillis()
	{
		assertEquals(expected, MillisecondsConversion.convertMillis(millis));
	}
}