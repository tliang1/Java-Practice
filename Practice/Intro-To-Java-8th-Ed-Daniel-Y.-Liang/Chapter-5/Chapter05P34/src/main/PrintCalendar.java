package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class PrintCalendar
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int year = 0;
		
		while (year < 1)
		{
			System.out.print("Enter full year (e.g., 2001): ");
			year = input.nextInt();
		}
		
		int month = 0;
		
		while ((month < 1) || (month > 12))
		{
			System.out.print("Enter month in number between 1 and 12: ");
			month = input.nextInt();
		}
		
		printMonth(year, month);
		
		input.close();
	}
	
	/**
	 * Displays the calendar for the specified month in the specified year.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is less than 1 or the second argument is invalid, nothing is displayed.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year		the year
	 * @param month		the month
	 */
	public static void printMonth(int year, int month)
	{
		if ((year > 0) && ((month >= 1) && (month <= 12)))
		{
			printMonthTitle(year, month);
			printMonthBody(year, month);
		}
	}
	
	/**
	 * Displays the month, year, and the names of the days of the week.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is less than 1 or the second argument is invalid, nothing is displayed.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year		the year
	 * @param month		the month
	 */
	public static void printMonthTitle(int year, int month)
	{
		if ((year > 0) && ((month >= 1) && (month <= 12)))
		{
			System.out.println(" " + getMonthName(month) + " " + year);
			System.out.println("———————————————————————————————");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		}
	}
	
	/**
	 * Returns the name for the specified month.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is invalid, no month name is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param month		the month
	 * @return			the name of the month
	 */
	public static String getMonthName(int month)
	{
		String monthName = "";
		
		switch (month) 
		{
		case 1: 
			monthName = "January"; 
			break;
		case 2: 
			monthName = "February"; 
			break;
		case 3: 
			monthName = "March"; 
			break;
		case 4: 
			monthName = "April"; 
			break;
		case 5: 
			monthName = "May"; 
			break;
		case 6: 
			monthName = "June"; 
			break;
		case 7: 
			monthName = "July"; 
			break;
		case 8: 
			monthName = "August"; 
			break;
		case 9: 
			monthName = "September"; 
			break;
		case 10: 
			monthName = "October"; 
			break;
		case 11: 
			monthName = "November"; 
			break;
		case 12: 
			monthName = "December";
			break;
		}
		
		return monthName;
	}
	
	/**
	 * Displays the days of the specified month in the specified year.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is less than 1 or the second argument is invalid, no days are displayed.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year		the year
	 * @param month		the month
	 */
	public static void printMonthBody(int year, int month)
	{
		if ((year > 0) && ((month >= 1) && (month <= 12)))
		{
			// Get start day of the week for the first day in the month
			int startDay = getStartDay(year, month);
			
			// Get number of days in the month
			int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
			
			int spacingCondition = (startDay % 7 == 0) ? 7 : (startDay % 7);
			
			// Pad space before the first day of the month
			for (int spacing = 1; spacing < spacingCondition; spacing++)
			{
				System.out.printf("%4s", "");
			}
			
			for (int day = 1; day <= numberOfDaysInMonth; day++) 
			{
				System.out.printf("%4d", day);
				
				if (((day + startDay - 1) % 7 == 0) || (day == numberOfDaysInMonth))
				{
					System.out.println();
				}
			}
		}
	}
	
	/**
	 * Returns the day of the week of the first day of the specified month in the specified year using Zeller's
	 * congruence.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is less than 1 or the second argument is invalid, the day of the week will
	 * 		default to -1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year		the year
	 * @param month		the month
	 * @return			the day of the week
	 */
	public static int getStartDay(int year, int month)
	{
		if ((year > 0) && ((month >= 1) && (month <= 12)))
		{
			if (month < 3)
			{
				--year;
				
				if (month == 1)
				{
					month = 13;
				}
				else if (month == 2)
				{
					month = 14;
				}
			}
			
			int dayOfTheMonth = 1;
			int century = year / 100;
			int yearOfTheCentury = year % 100;
			
			return (dayOfTheMonth + (int)(26 * (month + 1) / 10) + yearOfTheCentury +
					(int)(yearOfTheCentury / 4) + (int)(century / 4) + (5 * century)) % 7;
		}
		else
		{
			return -1;
		}
	}
	
	/**
	 * Returns the total number of days since January 1, 1 to the specified month and year.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is less than 1 or the second argument is invalid, the total number of days will
	 * 		default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year		the year
	 * @param month		the month
	 * @return			the total number of days
	 */
	public static int getTotalNumberOfDays(int year, int month)
	{
		int total = 0;
		
		if ((year > 0) && ((month >= 1) && (month <= 12)))
		{
			// Get the total days from 1/1/1 to 1/1/year
			for (int i = 1; i < year; i++)
			{
				if (isLeapYear(i))
				{
					total = total + 366;
				}
				else
				{
					total = total + 365;
				}
			}
			
			// Add days from Jan to the month prior to the calendar month
			for (int i = 1; i < month; i++)
			{
				total = total + getNumberOfDaysInMonth(year, i);
			}
		}
		
		return total;
	}
	
	/**
	 * Returns the number of days of the specified month in the specified year.
	 * <ul>
	 * 	<li>
	 * 		If the first argument is less than 1 or the second argument is invalid, the number of days will
	 * 		default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year		the year
	 * @param month		the month
	 * @return			the number of days in the month
	 */
	public static int getNumberOfDaysInMonth(int year, int month)
	{
		if ((year > 0) && ((month >= 1) && (month <= 12)))
		{
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
		else
		{
			return 0;
		}
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
}