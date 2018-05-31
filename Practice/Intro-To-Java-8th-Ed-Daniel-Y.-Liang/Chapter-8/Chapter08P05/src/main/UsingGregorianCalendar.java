package main;

import java.util.GregorianCalendar;

/**
 * @author Tony Liang
 *
 */
public class UsingGregorianCalendar
{
	public static void main(String[] args)
	{
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		System.out.println("The current year, month, and day are: " + gregorianCalendar.get(GregorianCalendar.YEAR) + " " + 
				gregorianCalendar.get(GregorianCalendar.MONTH) + " " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		gregorianCalendar.setTimeInMillis(1234567898765L);
		
		System.out.println("For the elapsed time of 1234567898765 milliseconds, the year, month, and day are: " + 
				gregorianCalendar.get(GregorianCalendar.YEAR) + " " + gregorianCalendar.get(GregorianCalendar.MONTH) + " " + 
				gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
	}
}