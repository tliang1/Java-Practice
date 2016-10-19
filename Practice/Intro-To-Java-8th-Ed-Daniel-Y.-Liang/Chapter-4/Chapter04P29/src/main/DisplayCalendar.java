package main;

import java.util.Scanner;

public class DisplayCalendar
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int year = -1;
		
		while (year < 0)
		{
			System.out.print("Enter the year (Must be positive): ");
			year = input.nextInt();
		}
		
		int day = -1;
		
		while ((day < 0) || (day > 6))
		{
			System.out.print("Enter the first day of " + year + 
					" (0-6) (0 = Sunday, 1 = Monday, ..., 6 = Saturday): ");
			day = input.nextInt();
		}
		
		for (int month = 1; month <= 12; month++)
		{
			switch (month)
			{
			case 1:
				System.out.printf("%25s", "January");
				break;
			case 2:
				System.out.printf("%26s", "February");
				break;
			case 3:
				System.out.printf("%23s", "March");
				break;
			case 4:
				System.out.printf("%23s", "April");
				break;
			case 5:
				System.out.printf("%21s", "May");
				break;
			case 6:
				System.out.printf("%22s", "June");
				break;
			case 7:
				System.out.printf("%22s", "July");
				break;
			case 8:
				System.out.printf("%24s", "August");
				break;
			case 9:
				System.out.printf("%27s", "September");
				break;
			case 10:
				System.out.printf("%25s", "October");
				break;
			case 11:
				System.out.printf("%26s", "November");
				break;
			case 12:
				System.out.printf("%26s", "December");
				break;
			}
			
			System.out.println(" " + year);
			System.out.println("___________________________________________________");
			System.out.println("Sun\tMon\tTues\tWed\tThu\tFri\tSat");
			
			int daysOfCurrentMonth = 28;
			
			if (month == 2)
			{
				// Check if the year is a leap year
				boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
				
				if (isLeapYear)
				{
					daysOfCurrentMonth = 29;
				}
			}
			else if (((month < 7) && (month % 2 == 0)) || ((month > 7) && (month % 2 == 1)))
			{
				daysOfCurrentMonth = 30;
			}
			else
			{
				daysOfCurrentMonth = 31;
			}
			
			int count = (day % 7);
			
			for (int spacing = 0; spacing < count; spacing++)
			{
				System.out.print("\t");
			}
			
			for (int monthDay = 1; monthDay <= daysOfCurrentMonth; monthDay++)
			{
				if ((count % 7 == 0) && (monthDay > 1))
				{
					System.out.printf("\n%2d\t", monthDay);
				}
				else
				{
					System.out.printf("%2d\t", monthDay);
				}
				
				count++;
			}
			
			System.out.println("\n");
			
			day += daysOfCurrentMonth;
		}
		
		input.close();
	}

}