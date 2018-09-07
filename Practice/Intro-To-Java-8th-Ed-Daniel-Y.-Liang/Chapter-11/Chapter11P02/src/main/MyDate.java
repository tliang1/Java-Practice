package main;

import java.util.GregorianCalendar;

/**
 * @author Tony Liang
 *
 */
public class MyDate
{
	private int year, month, day;
	private GregorianCalendar gregorianCalendar = new GregorianCalendar();
	
	/**
	 * Creates a new default MyDate that uses the current time.
	 */
	public MyDate()
	{
		this(System.currentTimeMillis());
	}
	
	/**
	 * Creates a new MyDate given the elapsed time in milliseconds.
	 * 
	 * @param elapsedTime	elapsed time in milliseconds
	 */
	public MyDate(long elapsedTime)
	{
		setDate(elapsedTime);
	}
	
	/**
	 * Creates a new MyDate given the year, month, and day.
	 * <ul>
	 * 	<li>
	 * 		If the year is less than 1970, it will default to 1970.
	 * 	</li>
	 * 	<li>
	 * 		If the month is invalid, it will default to 1.
	 * 	</li>
	 * 	<li>
	 * 		If the day is invalid, it will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year		year
	 * @param month		month
	 * @param day		day
	 */
	public MyDate(int year, int month, int day)
	{
		this.year = (year > 1970) ? year : 1970;
		this.month = ((month > 0) && (month <= 12)) ? month : 1;
		this.day = ((day > 0) && (day <= getNumberOfDaysInMonth(this.year, this.month))) ? day : 1;
	}
	
	/**
	 * Returns if the integer argument is a leap year.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 1, it will default to be not a leap year.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year	the year
	 * @return		true if the year is a leap year. Otherwise, false.
	 */
	public static boolean isLeapYear(int year)
	{
		if (year < 1)
		{
			return false;
		}
		
		return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	}
	
	/**
	 * Returns the number of days in the specified month of the specified year.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is negative or the second argument is not a valid month (1 - 12), the number of
	 * 		days will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year		the year
	 * @param month		the month
	 * @return			the number of days in the specified month of the specified year
	 */
	public static int getNumberOfDaysInMonth(int year, int month)
	{
		if ((year < 1) || (month < 1) || (month > 12))
		{
			return 0;
		}
		
		if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || 
				(month == 12))
		{
			return 31;
		}
		else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
		{
			return 30;
		}
		else
		{
			return isLeapYear(year) ? 29 : 28;
		}
	}
	
	public int getYear()
	{
		return year;
	}

	public int getMonth()
	{
		return month;
	}

	public int getDay()
	{
		return day;
	}
	
	/**
	 * Sets a new date given the elapsed time in milliseconds.
	 * 
	 * @param elapsedTime	elapsed time in milliseconds
	 */
	public void setDate(long elapsedTime)
	{
		gregorianCalendar.setTimeInMillis(elapsedTime);
		
		this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
		this.month = gregorianCalendar.get(GregorianCalendar.MONTH) + 1;
		this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	/**
	 * Returns the time of this date in hh:mm:ss.
	 * 
	 * @return	the time of this date in hh:mm:ss
	 */
	public String displayTime()
	{
		return gregorianCalendar.get(GregorianCalendar.HOUR_OF_DAY) + ":" + gregorianCalendar.get(GregorianCalendar.MINUTE) + ":" + 
					gregorianCalendar.get(GregorianCalendar.SECOND);
	}
}