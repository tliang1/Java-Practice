package main;

import java.util.Scanner;

public class NumberOfDaysInAMonth
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		int days = 28;
		
		if (month == 2)
		{
			// Check if the year is a leap year
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
			
			if (isLeapYear)
			{
				days = 29;
			}
		}
		else if (((month < 7) && (month % 2 == 0)) || ((month > 7) && (month % 2 == 1)))
		{
			days = 30;
		}
		else
		{
			days = 31;
		}
		
		String monthText = "";
		
		switch (month)
		{
		case 1:
			monthText = "January";
			break;
		case 2:
			monthText = "February";
			break;
		case 3:
			monthText = "March";
			break;
		case 4:
			monthText = "April";
			break;
		case 5:
			monthText = "May";
			break;
		case 6:
			monthText = "June";
			break;
		case 7:
			monthText = "July";
			break;
		case 8:
			monthText = "August";
			break;
		case 9:
			monthText = "September";
			break;
		case 10:
			monthText = "October";
			break;
		case 11:
			monthText = "November";
			break;
		case 12:
			monthText = "December";
			break;
		}
		
		System.out.println(monthText + " " + year + " has " + days + " days");
		
		input.close();
	}

}