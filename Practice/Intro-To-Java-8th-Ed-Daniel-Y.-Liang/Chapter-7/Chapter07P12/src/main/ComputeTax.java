package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ComputeTax
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("(0-single filer, 1-married jointly,\n" + "2-married separately, 3-head of household)\n" +
				"Enter the filing status: ");
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		System.out.println("Tax is " + computeTax(status, income));
		
		input.close();
	}
	
	/**
	 * Returns the personal income tax for 2009 with the specified filing status and taxable income.
	 * <p>
	 * The available options for filing statuses are 0 for single filers, 1 for married filing jointly, 2 for 
	 * married filing separately, and 3 for head of household.
	 * <p>
	 * If the second argument is negative, the tax will be $0.00.
	 * 
	 * @param status			filing status
	 * @param taxableIncome		taxable income
	 * @return					personal income tax
	 */
	public static double computeTax(int status, double taxableIncome)
	{
		double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
		int[][] brackets = {
				{ 8350, 33950, 82250, 171550, 372950 }, // Single filer
				{ 16700, 67900, 137050, 208850, 372950 }, // Married jointly
				{ 8350, 33950, 68525, 104425, 186475 }, // Married separately
				{ 11950, 45500, 117450, 190200, 372950 } // Head of household
		};
		
		if (taxableIncome < 0.0)
		{
			return 0.0;
		}
		
		double tax = 0;
		
		if ((status >= 0) && (status < 4))
		{
			if (taxableIncome <= brackets[status][0])
			{
				tax = taxableIncome * rates[0];
			}
			else if (taxableIncome <= brackets[status][1])
			{
				tax = (brackets[status][0] * rates[0]) + ((taxableIncome - brackets[status][0]) * rates[1]);
			}
			else if (taxableIncome <= brackets[status][2])
			{
				tax = (brackets[status][0] * rates[0]) + ((brackets[status][1] - brackets[status][0]) * rates[1]) +
						((taxableIncome - brackets[status][1]) * rates[2]);
			}
			else if (taxableIncome <= brackets[status][3])
			{
				tax = (brackets[status][0] * rates[0]) + ((brackets[status][1] - brackets[status][0]) * rates[1]) +
						((brackets[status][2] - brackets[status][1]) * rates[2]) +
						((taxableIncome - brackets[status][2]) * rates[3]);
			}
			else if (taxableIncome <= brackets[status][4])
			{
				tax = (brackets[status][0] * rates[0]) + ((brackets[status][1] - brackets[status][0]) * rates[1]) +
						((brackets[status][2] - brackets[status][1]) * rates[2]) +
						((brackets[status][3] - brackets[status][2]) * rates[3]) +
						((taxableIncome - brackets[status][3]) * rates[4]);
			}
			else
			{
				tax = (brackets[status][0] * rates[0]) + ((brackets[status][1] - brackets[status][0]) * rates[1]) +
						((brackets[status][2] - brackets[status][1]) * rates[2]) +
						((brackets[status][3] - brackets[status][2]) * rates[3]) +
						((brackets[status][4] - brackets[status][3]) * rates[4]) +
						((taxableIncome - brackets[0][4]) * rates[5]);
			}
		}
		else
		{
			System.out.println("Error: invalid status");
			System.exit(0);
		}
		
		return (int)(tax * 100) / 100.0;
	}
}