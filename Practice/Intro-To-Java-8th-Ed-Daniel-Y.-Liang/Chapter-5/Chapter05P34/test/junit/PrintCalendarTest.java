package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.PrintCalendar;

/**
 * @author Tony Liang
 *
 */
public class PrintCalendarTest
{
	int[] years = { 0, 20, -2012, 2016, 1800, 2009, 2016 };
	int[] months = { 0, 15, 6, 9, 1, 5, 2 };
	String[] monthNames = { "", "", "June", "September", "January", "May", "February" };
	int[] startDays = { -1, -1, -1, 5, 4, 6, 2 };
	int[] listOfNumberOfDaysInMonth = { 0, 0, 0, 30, 31, 31, 29 };
	
	@Test
	public void testGetMonthName()
	{
		for (int month = 0; month < months.length; month++)
		{
			assertEquals(monthNames[month], PrintCalendar.getMonthName(months[month]));
		}
	}
	
	@Test
	public void testGetStartDay()
	{
		for (int year = 0, month = 0; (year < years.length) && (month < months.length); year++, month++)
		{
			assertEquals(startDays[month], PrintCalendar.getStartDay(years[year], months[month]));
		}
	}
	
	@Test
	public void testGetNumberOfDaysInMonth()
	{
		for (int year = 0, month = 0; (year < years.length) && (month < months.length); year++, month++)
		{
			assertEquals(listOfNumberOfDaysInMonth[month],
					PrintCalendar.getNumberOfDaysInMonth(years[year], months[month]));
		}
	}
}