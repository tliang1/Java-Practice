package main;

/**
 * @author Tony Liang
 *
 */
public class CurrentDateAndTime
{
	
	public static void main(String[] args)
	{
		showCurrentDate();
		showCurrentTime();
	}

	/**
	 * Displays the current time in GMT UTC +0.
	 */
	public static void showCurrentTime()
	{
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
	
	/**
	 * Returns if the year is a leap year.
	 * <p>
	 * If the integer argument is less than 1, it will default to be not a leap year.
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
	 * <p>
	 * If the first argument is negative or the second argument is not a valid month (1 - 12), the number of days 
	 * will default to 0.
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
	
	/**
	 * Displays the current date.
	 */
	public static void showCurrentDate()
	{
		System.out.print("Current date is ");
		long totalDays = (System.currentTimeMillis() / 1000 / 60 / 60 / 24) + 1;
		int year = 1970;
		
		int yearDays = isLeapYear(year) ? 366 : 365;
		
		while (totalDays > yearDays)
		{
			totalDays -= yearDays;
			year++;
			yearDays = isLeapYear(year) ? 366 : 365;
		}
		
		int month = 1;
		int monthDays = getNumberOfDaysInMonth(year, month);
		
		while (totalDays > monthDays)
		{
			totalDays -= getNumberOfDaysInMonth(year, month);
			
			month++;
			
			if (month == 12)
			{
				month = 1;
			}
			
			monthDays = getNumberOfDaysInMonth(year, month);
		}
		
		switch (month)
		{
		case 1:
			System.out.print("January ");
			break;
		case 2:
			System.out.print("February ");
			break;
		case 3:
			System.out.print("March ");
			break;
		case 4:
			System.out.print("April ");
			break;
		case 5:
			System.out.print("May ");
			break;
		case 6:
			System.out.print("June ");
			break;
		case 7:
			System.out.print("July ");
			break;
		case 8:
			System.out.print("August ");
			break;
		case 9:
			System.out.print("September ");
			break;
		case 10:
			System.out.print("October ");
			break;
		case 11:
			System.out.print("November ");
			break;
		case 12:
			System.out.print("December ");
			break;
		}
		
		System.out.println(totalDays +  ", " + year);
	}
}