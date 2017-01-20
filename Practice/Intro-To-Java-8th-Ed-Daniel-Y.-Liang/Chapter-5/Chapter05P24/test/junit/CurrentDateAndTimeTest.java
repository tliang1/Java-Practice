package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CurrentDateAndTime;

/**
 * @author Tony Liang
 *
 */
public class CurrentDateAndTimeTest
{
	@Test
	public void testIsLeapYear()
	{
		int[] years = { -5, 0, 1, 1970, 1974, 1990, 1998, 2014, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000,
				2004, 2008, 2012, 2016 };
		boolean[] leapYearOrNot = { false, false, false, false, false, false, false, false, true, true, true, true,
				true, true, true, true, true, true, true, true };
		
		for (int year = 0; year < leapYearOrNot.length; year++)
		{
			assertEquals(leapYearOrNot[year], CurrentDateAndTime.isLeapYear(years[year]));
		}
	}
	
	@Test
	public void testGetNumberOfDaysInMonth()
	{
		int[] years = { -1, 0, 15, 1993, 2010, 1985, 1992, 2002, 2016 };
		int[] months = { -5, 2, -10, 13, 0, 9, 5, 2, 2 };
		int[] numberOfDaysForMonths = { 0, 0, 0, 0, 0, 30, 31, 28, 29 };
		
		for (int index = 0; index < numberOfDaysForMonths.length; index++)
		{
			assertEquals(numberOfDaysForMonths[index],
					CurrentDateAndTime.getNumberOfDaysInMonth(years[index], months[index]));
		}
	}
}