package main;

import java.util.Scanner;

public class FutureInvestmentValue 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate(e.g., 3 for 3%): ");
		double annualInterestRate = input.nextDouble() / 100;
		
		System.out.print("Enter number of years: ");
		int years = input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 12;
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
		
		System.out.println("Accumulated value is " + futureInvestmentValue);
		
		input.close();
	}

}