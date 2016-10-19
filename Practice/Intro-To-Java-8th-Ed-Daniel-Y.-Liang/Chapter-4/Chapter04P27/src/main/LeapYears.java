package main;

public class LeapYears
{

	public static void main(String[] args)
	{
		final int LEAP_YEARS_PER_LINES = 10;
		final int LEAP_YEAR_START = 2001;
		final int LEAP_YEAR_END = 2100;
		
		System.out.println("Leap years between " + LEAP_YEAR_START + " and " + LEAP_YEAR_END + ".");
		
		for (int year = LEAP_YEAR_START, count = 0; year <= LEAP_YEAR_END; year++)
		{
			// Check if the year is a leap year
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
			
			if (isLeapYear)
			{
				++count;
				
				if (count % LEAP_YEARS_PER_LINES == 0)
				{
					System.out.println(year);
				}
				else
				{
					System.out.print(year + " ");
				}
			}
			
			if ((year == LEAP_YEAR_END) && (!isLeapYear) && (count % LEAP_YEARS_PER_LINES != 0))
			{
				System.out.println();
			}
		}
	}

}