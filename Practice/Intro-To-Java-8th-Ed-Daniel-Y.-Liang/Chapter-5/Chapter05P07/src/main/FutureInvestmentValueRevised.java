package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class FutureInvestmentValueRevised
{
	
	public static void main(String[] args)
	{
		int YEARS_TO_INVESTMENT = 30;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		while (investmentAmount < 0.0)
		{
			System.out.print("Enter investment amount (Must be positive): ");
			investmentAmount = input.nextDouble();
		}
		
		System.out.print("Enter annual interest rate(e.g., 3 for 3%): ");
		double annualInterestRate = input.nextDouble() / 100;
		
		while (annualInterestRate < 0.0)
		{
			System.out.print("Enter annual interest rate(e.g., 3 for 3%) (Must be positive): ");
			annualInterestRate = input.nextDouble() / 100;
		}
		
		double monthlyInterestRate = annualInterestRate / 12;
		
		System.out.println("The amount invested: " + investmentAmount);
		System.out.println("Annual interest rate: " + (annualInterestRate * 100) + "%");
		System.out.println("Years\tFuture Value");
		
		for (int year = 1; year <= YEARS_TO_INVESTMENT; year++)
		{
			System.out.printf("%d\t%8.2f\n", year, 
					futureInvestmentValue(investmentAmount, monthlyInterestRate, year));
		}
		
		System.out.println();
		
		input.close();
	}

	/**
	 * Returns the future investment value using the specified invest amount, monthly interest rate, and years.
	 * <p>
	 * If the first argument is negative, the future investment value will be 0.0.
	 * <p>
	 * If the second argument is negative, it will default to 0.0.
	 * <p>
	 * If the third argument is less than 1, it will default to 1.
	 * 
	 * @param investmentAmount		amount of money to invest
	 * @param monthlyInterestRate	monthly interest rate (e.g., 0.03 for 3% rate)
	 * @param years					year of investment (e.g., 4 for the 4th year)
	 * @return						the future investment value
	 */
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
	{
		if (investmentAmount < 0.0)
		{
			return 0.0;
		}
		
		if (monthlyInterestRate < 0.0)
		{
			monthlyInterestRate = 0.0;
		}
		
		if (years < 1)
		{
			years = 1;
		}
		
		return (int)(investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12) * 100) / 100.0;
	}
}