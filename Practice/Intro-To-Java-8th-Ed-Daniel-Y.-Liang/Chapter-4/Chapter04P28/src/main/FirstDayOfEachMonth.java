package main;

import java.util.Scanner;

public class FirstDayOfEachMonth
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
			System.out.print("Enter the first day of " + year + " (0-6) (0 = Sunday, 1 = Monday, ..., 6 = Saturday): ");
			day = input.nextInt();
		}
		
		for (int month = 1; month <= 12; month++)
		{
			switch (month)
			{
			case 1:
				System.out.print("January");
				break;
			case 2:
				System.out.print("February");
				break;
			case 3:
				System.out.print("March");
				break;
			case 4:
				System.out.print("April");
				break;
			case 5:
				System.out.print("May");
				break;
			case 6:
				System.out.print("June");
				break;
			case 7:
				System.out.print("July");
				break;
			case 8:
				System.out.print("August");
				break;
			case 9:
				System.out.print("September");
				break;
			case 10:
				System.out.print("October");
				break;
			case 11:
				System.out.print("November");
				break;
			case 12:
				System.out.print("December");
				break;
			}
			
			System.out.print(" 1, " + year + " is ");
			
			switch (day % 7)
			{
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			}
			
			if (month == 2)
			{
				// Check if the year is a leap year
				boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
				
				if (isLeapYear)
				{
					day += 29;
				}
			}
			else if (((month < 7) && (month % 2 == 0)) || ((month > 7) && (month % 2 == 1)))
			{
				day += 30;
			}
			else
			{
				day += 31;
			}
		}
		
		input.close();
	}

}