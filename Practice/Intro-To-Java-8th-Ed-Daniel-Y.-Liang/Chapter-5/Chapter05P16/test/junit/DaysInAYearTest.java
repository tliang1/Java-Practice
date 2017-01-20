package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.DaysInAYear;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class DaysInAYearTest
{
	private int year;
	private int expected;
	
	public DaysInAYearTest(int year, int expectedResult)
	{
		this.year = year;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Integer[]> daysInYearList() 
	{
		return Arrays.asList(new Integer[][] { { -251, 365 }, { 2000, 366 }, { 2003, 365 }, { 2008, 366 },
			{ 2016, 366 }, { 2014, 365 } });
	}
	
	@Test
	public void testNumberOfDaysInAYear()
	{
		assertEquals(expected, DaysInAYear.numberOfDaysInAYear(year));
	}
}