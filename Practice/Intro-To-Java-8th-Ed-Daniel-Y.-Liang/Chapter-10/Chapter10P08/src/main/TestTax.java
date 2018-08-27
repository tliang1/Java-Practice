package main;

/**
 * @author Tony Liang
 *
 */
public class TestTax
{
	public static void main(String[] args)
	{
		final double STARTING_TAXABLE_INCOME = 50000.0;
		final double ENDING_TAXABLE_INCOME = 60000.0;
		final double CHANGE_IN_TAXABLE_INCOME = 1000.0;
		
		int[][] brackets = new int[][]
				{
					{ 27050, 65550, 136750, 297350, 297350 },
					{ 45200, 109250, 166500, 297350, 297350 },
					{ 22600, 54625, 83250, 148675, 148675 },
					{ 36250, 93650, 151650, 297350, 297350 }
				};
		double[] rates = new double[]{ 0.15, 0.275, 0.305, 0.355, 0.391, 0.391 };
		
		Tax tax2001 = new Tax(Tax.SINGLE_FILER, brackets, rates, STARTING_TAXABLE_INCOME);
		
		displayTaxTable(STARTING_TAXABLE_INCOME, ENDING_TAXABLE_INCOME, CHANGE_IN_TAXABLE_INCOME, tax2001);
		
		Tax tax2009 = new Tax();
		
		displayTaxTable(STARTING_TAXABLE_INCOME, ENDING_TAXABLE_INCOME, CHANGE_IN_TAXABLE_INCOME, tax2009);
	}
	
	/**
	 * Displays a tax table for taxable income from the given starting taxable income to the given ending taxable income with intervals of the 
	 * given taxable income for all four statuses given the Tax.
	 * 
	 * @param startingTaxableIncome		starting taxable income
	 * @param endingTaxableIncome		ending taxable income
	 * @param changeInTaxableIncome		change in taxable income
	 * @param tax						Tax
	 */
	public static void displayTaxTable(double startingTaxableIncome, double endingTaxableIncome, double changeInTaxableIncome, Tax tax)
	{
		System.out.println("Taxable\t\tSingle\t\tMarried\t\tMarried\t\tHead of");
		System.out.println("Income\t\t\t\tJoint\t\tSeparate\ta House\n");
		
		for (double taxableIncome = startingTaxableIncome; taxableIncome <= endingTaxableIncome; taxableIncome += changeInTaxableIncome)
		{
			tax.setTaxableIncome(taxableIncome);
			
			double[] taxes = new double[4];
			
			for (int status = 0; status < 4; status++)
			{
				tax.setFilingStatus(status);
				taxes[status] = tax.getTax();
			}
			
			System.out.printf("%-5.0f\t\t%-5.0f\t\t%-4.0f\t\t%-5.0f\t\t%-4.0f\n", taxableIncome, taxes[0], taxes[1], taxes[2], taxes[3]);
		}
		
		System.out.println();
	}
}