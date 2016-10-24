package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.PrintCalendar;

/**
 * @author Tony Liang
 *
 */
public class PrintCalendarTest
{
	Collection<Object[]> validCalendars = Arrays.asList(new Object[][] { { 2016, 9, "September", 5, 30 }, 
		{ 1800, 1, "January", 4, 31 }, { 2009, 5, "May", 6, 31 }, { 2016, 2, "February", 2, 29 } });
	Collection<Object[]> invalidCalendars = Arrays.asList(new Object[][] { { 0, 0, "", -1, 0 }, 
		{ 20, 15, "", -1, 0 }, { -2012, 6, "June", -1, 0 } });
	
	@Test
	public void testGetMonthName()
	{
		for (Object[] calendar : validCalendars)
		{
			assertEquals(calendar[2], PrintCalendar.getMonthName((int)calendar[1]));
		}
		
		for (Object[] calendar : invalidCalendars)
		{
			assertEquals(calendar[2], PrintCalendar.getMonthName((int)calendar[1]));
		}
	}
	
	@Test
	public void testGetStartDay()
	{
		for (Object[] calendar : validCalendars)
		{
			assertEquals(calendar[3], PrintCalendar.getStartDay((int)calendar[0], (int)calendar[1]));
		}
		
		for (Object[] calendar : invalidCalendars)
		{
			assertEquals(calendar[3], PrintCalendar.getStartDay((int)calendar[0], (int)calendar[1]));
		}
	}
	
	@Test
	public void testGetNumberOfDaysInMonth()
	{
		for (Object[] calendar : validCalendars)
		{
			assertEquals(calendar[4], PrintCalendar.getNumberOfDaysInMonth((int)calendar[0], (int)calendar[1]));
		}
		
		for (Object[] calendar : invalidCalendars)
		{
			assertEquals(calendar[4], PrintCalendar.getNumberOfDaysInMonth((int)calendar[0], (int)calendar[1]));
		}
	}

}