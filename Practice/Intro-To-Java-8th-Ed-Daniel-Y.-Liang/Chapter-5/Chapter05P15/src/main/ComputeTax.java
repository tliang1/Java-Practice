package main;

/**
 * @author Tony Liang
 *
 */
public class ComputeTax
{
	
	public static void main(String[] args)
	{
		final double STARTING_TAXABLE_INCOME = 50000.0;
		final double ENDING_TAXABLE_INCOME = 60000.0;
		final double CHANGE_IN_TAXABLE_INCOME = 50.0;
		
		System.out.println("Taxable\t\tSingle\t\tMarried\t\tMarried\t\tHead of");
		System.out.println("Income\t\t\t\tJoint\t\tSeparate\ta House\n");
		
		for (double taxableIncome = STARTING_TAXABLE_INCOME; taxableIncome <= ENDING_TAXABLE_INCOME; 
				taxableIncome += CHANGE_IN_TAXABLE_INCOME)
		{
			System.out.printf("%-5.0f\t\t%-5.0f\t\t%-4.0f\t\t%-5.0f\t\t%-4.0f\n", taxableIncome, 
					computeTax(0, taxableIncome), computeTax(1, taxableIncome), computeTax(2, taxableIncome), 
					computeTax(3, taxableIncome));
		}
		
		System.out.println();
	}

	/**
	 * Returns the personal income tax for 2009 with the specified filing status and taxable income.
	 * <p>
	 * The available options for filing statuses are 0 for single filers, 1 for married filing jointly, 2 for 
	 * married filing separately, and 3 for head of household.
	 * <p>
	 * If the second argument is negative, the tax will be $0.0.
	 * 
	 * @param status			filing status
	 * @param taxableIncome		taxable income
	 * @return					personal income tax
	 */
	public static double computeTax(int status, double taxableIncome)
	{
		if (taxableIncome < 0.0)
		{
			return 0.0;
		}
		
		double tax = 0;
		
		if (status == 0) 
		{
			if (taxableIncome <= 8350)
			{
				tax = taxableIncome * 0.10;
			}
			else if (taxableIncome <= 33950)
			{
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			}
			else if (taxableIncome <= 82250)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
			}
			else if (taxableIncome <= 171550)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
			}
			else if (taxableIncome <= 372950)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
						(taxableIncome - 171550) * 0.33;
			}
			else
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
						(372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
			}
		}
		else if (status == 1)
		{
			if (taxableIncome <= 16700)
			{
				tax = taxableIncome * 0.10;
			}
			else if (taxableIncome <= 67900)
			{
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
			}
			else if (taxableIncome <= 137050)
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
			}
			else if (taxableIncome <= 208850)
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + 
						(taxableIncome - 137050) * 0.28;
			}
			else if (taxableIncome <= 372950)
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
						(taxableIncome - 208850) * 0.33;
			}
			else
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
						(372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
			}
		}
		else if (status == 2)
		{
			if (taxableIncome <= 8350)
			{
				tax = taxableIncome * 0.10;
			}
			else if (taxableIncome <= 33950)
			{
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			}
			else if (taxableIncome <= 68525)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
			}
			else if (taxableIncome <= 104425)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
			}
			else if (taxableIncome <= 186475)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
						(taxableIncome - 171550) * 0.33;
			}
			else
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
						(186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
			}
		}
		else if (status == 3)
		{
			if (taxableIncome <= 11950)
			{
				tax = taxableIncome * 0.10;
			}
			else if (taxableIncome <= 45500)
			{
				tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
			}
			else if (taxableIncome <= 117450)
			{
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
			}
			else if (taxableIncome <= 190200)
			{
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + 
						(taxableIncome - 117450) * 0.28;
			}
			else if (taxableIncome <= 372950)
			{
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + 
						(taxableIncome - 190200) * 0.33;
			}
			else
			{
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + 
						(372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
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