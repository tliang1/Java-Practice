package main;

import java.util.Scanner;

public class MinutesToYearsAndDays 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int years = (int)(minutes / 60.0 / 24.0 / 365.0);
		int days = (int)(minutes / 60.0 / 24.0 % 365.0);
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		
		input.close();
	}

}