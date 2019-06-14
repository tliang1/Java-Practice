package main;

import java.util.*;

/**
 * @author Tony Liang
 *
 */
public class DisplayCalendar
{
	public static void main(String[] args)
	{
		if (args.length > 2)
		{
			System.out.println("Usage: java DisplayCalendar month year");
			System.exit(0);
		}
		else
		{
			Calendar calendar = new GregorianCalendar();
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			int month = calendar.get(Calendar.MONTH) + 1, year = calendar.get(Calendar.YEAR);
			
			if (args.length > 0)
			{
				month = Integer.parseInt(args[0]);
				
				if ((month < 1) || (month > 12))
				{
					System.out.println("Invalid month. Month must be between 1 and 12.");
					System.exit(0);
				}
				
				calendar.set(Calendar.MONTH, month - 1);
				
				if (args.length == 2)
				{
					year = Integer.parseInt(args[1]);
					calendar.set(Calendar.YEAR, year);
				}
			}
			
			printCalendar(calendar);
		}
	}
	
	/**
	 * Displays the calendar month given the calendar.
	 * 
	 * @param calendar	the calendar
	 */
	public static void printCalendar(Calendar calendar)
	{
		String monthTitle = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " " + calendar.get(Calendar.YEAR);
		String monthTitleLine = "—————————————————————————————";
		int spacingBeforeMonthTitle = (monthTitleLine.length() - monthTitle.length()) / 2;
		
		while (spacingBeforeMonthTitle > 0)
		{
			System.out.print(" ");
			spacingBeforeMonthTitle--;
		}
		
		System.out.println(monthTitle);
		System.out.println(monthTitleLine);
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		
		// Get start day of the week for the first day in the month
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
							
		// Get number of days in the month
		int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
							
		int spacingCondition = (startDay % 7 == 0) ? 7 : (startDay % 7);
				
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