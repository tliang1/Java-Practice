package main;

import java.util.Scanner;

public class CDValue
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the initial deposit amount: ");
		double depositAmount = input.nextDouble();
		
		while (depositAmount < 0.0)
		{
			System.out.print("Enter the initial deposit amount (Must be positive): ");
			depositAmount = input.nextDouble();
		}
		
		System.out.print("Enter the annual percentage yield: ");
		double annualPercentageYield = input.nextDouble();
		
		while (annualPercentageYield < 0.0)
		{
			System.out.print("Enter the annual percentage yield (Must be positive): ");
			annualPercentageYield = input.nextDouble();
		}
		
		System.out.print("Enter the maturity period (number of months): ");
		int maturityPeriod = input.nextInt();
		
		while (maturityPeriod < 0)
		{
			System.out.print("Enter the maturity period (number of months) (Must be positive): ");
			maturityPeriod = input.nextInt();
		}
		
		final double MONTHLY_YIELD = annualPercentageYield / 1200;
		
		System.out.println("\nMonth\tCD Value");
		
		double cDValue = depositAmount;
		
		for (int month = 1; month <= maturityPeriod; month++)
		{
			System.out.print(month + "\t");
			
			cDValue = cDValue + (cDValue * MONTHLY_YIELD);
			
			System.out.printf("%8.2f\n", (int)(cDValue * 100) / 100.0);
		}
		
		input.close();
	}

}