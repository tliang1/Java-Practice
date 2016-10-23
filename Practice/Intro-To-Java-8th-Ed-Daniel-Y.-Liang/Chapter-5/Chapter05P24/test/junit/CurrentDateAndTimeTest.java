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
		int[] validYears = new int[] { 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016 };
		int[] invalidYears = new int[] { -5, 0, 1, 1970, 1974, 1990, 1998, 2014 };
		
		for (int year : validYears)
		{
			assertTrue(CurrentDateAndTime.isLeapYear(year));
		}
		
		for (int year : invalidYears)
		{
			assertFalse(CurrentDateAndTime.isLeapYear(year));
		}
	}
	
	@Test
	public void testGetNumberOfDaysInMonth()
	{
		int[][] validMonthsAndYears = new int[][] { {2016, 2, 29}, { 2002, 2, 28 }, { 1992, 5, 31 }, 
			{ 1985, 9, 30 } };
		int[][] invalidMonthsAndYears = new int[][] { { 0, 2, 0}, { 2010, 0, 0 }, { 1993, 13, 0 }, { -1, -5, 0 }, 
			{ 15, -10, 0 } };
		
		for (int[] monthAndYear : validMonthsAndYears)
		{
			assertEquals(monthAndYear[2], 
					CurrentDateAndTime.getNumberOfDaysInMonth(monthAndYear[0], monthAndYear[1]));
		}
		
		for (int[] monthAndYear : invalidMonthsAndYears)
		{
			assertEquals(monthAndYear[2], 
					CurrentDateAndTime.getNumberOfDaysInMonth(monthAndYear[0], monthAndYear[1]));
		}
	}

}