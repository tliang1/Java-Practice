package main;

import java.util.Scanner;

public class CompoundValue
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double amount = -1.0;
		
		while (amount < 0.0)
		{
			System.out.print("Enter an amount (Must be positive): ");
			amount = input.nextDouble();
		}
		
		double annualInterestRate = -1.0;
		
		while (annualInterestRate < 0.0)
		{
			System.out.print("Enter the annual interest rate (e.g., 5 for 5%) (Must be positive): ");
			annualInterestRate = input.nextDouble();
		}
		
		int months = 0;
		
		while (months < 1)
		{
			System.out.print("Enter the number of months (Must be at least 1 month): ");
			months = input.nextInt();
		}
		
		double totalAmount = 0.0;
		final double MONTHLY_INTEREST_RATE = annualInterestRate / 1200;
		
		for (int month = 1; month <= months; month++)
		{
			totalAmount = (amount + totalAmount) * (1 + MONTHLY_INTEREST_RATE);
		}
		
		System.out.print("After " + months);
		
		if (months > 1)
		{
			System.out.print(" months");
		}
		else
		{
			System.out.print(" month");
		}
		
		System.out.printf(", the amount in the savings account is $%-6.2f\n", totalAmount);
		
		input.close();
	}

}