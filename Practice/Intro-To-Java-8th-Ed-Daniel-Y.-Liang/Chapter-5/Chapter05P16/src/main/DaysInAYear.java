package main;

/**
 * @author Tony Liang
 *
 */
public class DaysInAYear
{
	public static void main(String[] args)
	{
		final int STARTING_YEAR = 2000;
		final int ENDING_YEAR = 2010;
		
		System.out.println("Year\tDays");
		
		for (int year = STARTING_YEAR; year <= ENDING_YEAR; year++)
		{
			System.out.printf("%-4d\t%-3d\n", year, numberOfDaysInAYear(year));
		}
		
		System.out.println();
	}

	/**
	 * Returns the number of days in the specified year.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 1, the number of days will default to 365.
	 * 	</li>
	 * </ul>
	 * 
	 * @param year	year
	 * @return		number of days
	 */
	public static int numberOfDaysInAYear(int year)
	{
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		if (year < 1)
		{
			isLeapYear = false;
		}
		
		if (isLeapYear)
		{
			return 366;
		}
		else
		{
			return 365;
		}
	}
}