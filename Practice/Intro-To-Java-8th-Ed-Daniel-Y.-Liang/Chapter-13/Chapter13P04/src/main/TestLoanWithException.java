package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TestLoanWithException
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter yearly interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		input.close();
		
		LoanWithException loan = new LoanWithException(annualInterestRate, numberOfYears, loanAmount);
		
		System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", 
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	}
}