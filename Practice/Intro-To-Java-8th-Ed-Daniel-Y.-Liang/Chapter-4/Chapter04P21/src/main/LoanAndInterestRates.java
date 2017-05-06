package main;

import java.util.Scanner;

public class LoanAndInterestRates
{

	public static void main(String[] args)
	{
		final double MINIMUM_ANNUAL_INTEREST_RATE = 5.0;
		final double MAXIMUM_ANNUAL_INTEREST_RATE = 8.0;
		final double ANNUAL_INTEREST_RATE_INCREMENT = 1.0 / 8;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		while (loanAmount < 0.0)
		{
			System.out.print("Loan Amount (Must be positive): ");
			loanAmount = input.nextDouble();
		}
		
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		while (numberOfYears < 0)
		{
			System.out.print("Number of Years (Must be positive): ");
			numberOfYears = input.nextInt();
		}
		
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
		
		for (double annualInterestRate = MINIMUM_ANNUAL_INTEREST_RATE; 
				annualInterestRate <= MAXIMUM_ANNUAL_INTEREST_RATE; 
				annualInterestRate += ANNUAL_INTEREST_RATE_INCREMENT)
		{
			// Obtain monthly interest rate
			double monthlyInterestRate = annualInterestRate / 1200;
			
			// Calculate payment
			double monthlyPayment = loanAmount * monthlyInterestRate / 
					(1.0 - 1.0 / Math.pow(1.0 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			
			System.out.printf(annualInterestRate + "%%\t\t%-6.2f\t\t%-8.2f\n", (int)(monthlyPayment * 100) / 100.0, 
					(int)(totalPayment * 100) / 100.0);
		}
		
		input.close();
	}

}