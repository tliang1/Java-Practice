package main;

import java.util.Scanner;

public class LoanAmortizationSchedule
{

	public static void main(String[] args)
	{
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
		
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		
		while (annualInterestRate < 0.0)
		{
			System.out.print("Annual Interest Rate (Must be positive): ");
			annualInterestRate = input.nextDouble();
		}
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / 
				(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("\nMonthly Payment: " + ((int)(monthlyPayment * 100) / 100.0) + "\nTotal Payment: " + 
				((int)(totalPayment * 100) / 100.0));
		
		double interest = 0.0, principal = 0.0, balance = loanAmount;
		
		System.out.println("\nPayment#\tInterest\tPrincipal\tBalance\n");
		
		for (int month = 1; month <= numberOfYears * 12; month++) 
		{
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.printf(month + "\t\t%-5.2f\t\t%-6.2f\t\t%-7.2f\n", interest, principal, balance);
		}
		
		input.close();
	}

}