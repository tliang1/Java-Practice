package main;

import java.util.Arrays;

/**
 * @author Tony Liang
 *
 */
public class Tax
{
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	
	/**
	 * Creates a new default Tax which uses the 2009 tax rates for a single filer with $400,000 taxable income.
	 */
	public Tax()
	{		
		this(SINGLE_FILER,
				new int[][]
					{
						{ 8350, 33950, 82250, 171550, 372950 }, // Single filer
						{ 16700, 67900, 137050, 208850, 372950 }, // Married jointly
						{ 8350, 33950, 68525, 104425, 186475 }, // Married separately
						{ 11950, 45500, 117450, 190200, 372950 } // Head of household
					},
					new double[]{ 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 }, 400000);
	}
	
	/**
	 * Creates a new Tax given the filing status, the tax brackets for each filing status, the tax rates for each bracket, and the taxable 
	 * income.
	 * <ul>
	 * 	<li>
	 * 		If the filing status is not between 0 and 3 inclusive, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the brackets array does not have exactly 4 rows and 5 columns for each row, the array will be truncated or expanded to the 
	 * 		correct size.
	 *  </li>
	 *  <li>
	 *  	If the rates array's size is not exactly 6, the array will be truncated or expanded to the correct size.
	 *  </li>
	 * 	<li>
	 * 		If the taxable income is negative, it will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param filingStatus		filing status
	 * @param brackets			two-dimensional array of tax brackets for each filing status
	 * @param rates				array of tax percentage rates in decimal for each bracket
	 * @param taxableIncome		taxable income
	 */
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome)
	{
		this.filingStatus = ((filingStatus > 0) && (filingStatus < 4)) ? filingStatus : 0;
		
		boolean isValidBracketsLengths = false;
		
		if (brackets.length == 4)
		{
			isValidBracketsLengths = true;
			
			for (int[] bracket : brackets)
			{
				if (bracket.length != 5)
				{
					isValidBracketsLengths = false;
					break;
				}
			}
			
			if (isValidBracketsLengths)
			{
				this.brackets = brackets;
			}
		}
		
		if (!isValidBracketsLengths)
		{
			int[][] updatedBrackets = new int[4][5];
			
			for (int bracket = 0; bracket < brackets.length; bracket++)
			{
				if (brackets[bracket].length > 0)
				{
					Arrays.fill(updatedBrackets[bracket], brackets[bracket][brackets[bracket].length - 1]);
					System.arraycopy(brackets[bracket], 0, updatedBrackets[bracket], 0, brackets[bracket].length);
				}
			}
			
			this.brackets = updatedBrackets;
		}
		
		if (rates.length == 6)
		{
			this.rates = rates;
		}
		else
		{
			double[] updatedRates = new double[6];
			
			if (rates.length > 0)
			{
				Arrays.fill(updatedRates, rates[rates.length - 1]);
			}
			
			System.arraycopy(rates, 0, updatedRates, 0, rates.length);
			
			this.rates = updatedRates;
		}
		
		this.taxableIncome = (taxableIncome > 0) ? taxableIncome: 0;
	}

	public int getFilingStatus()
	{
		return filingStatus;
	}

	public void setFilingStatus(int filingStatus)
	{
		this.filingStatus = ((filingStatus > 0) && (filingStatus < 4)) ? filingStatus : 0;
	}

	public int[][] getBrackets()
	{
		return brackets;
	}

	public void setBrackets(int[][] brackets)
	{
		boolean isValidBracketsLengths = false;
		
		if (brackets.length == 4)
		{
			isValidBracketsLengths = true;
			
			for (int[] bracket : brackets)
			{
				if (bracket.length != 5)
				{
					isValidBracketsLengths = false;
					break;
				}
			}
			
			if (isValidBracketsLengths)
			{
				this.brackets = brackets;
			}
		}
		
		if (!isValidBracketsLengths)
		{
			int[][] updatedBrackets = new int[4][5];
			
			for (int bracket = 0; bracket < brackets.length; bracket++)
			{
				if (brackets[bracket].length > 0)
				{
					Arrays.fill(updatedBrackets[bracket], brackets[bracket][brackets[bracket].length - 1]);
					System.arraycopy(brackets[bracket], 0, updatedBrackets[bracket], 0, brackets[bracket].length);
				}
			}
			
			this.brackets = updatedBrackets;
		}
	}

	public double[] getRates()
	{
		return rates;
	}

	public void setRates(double[] rates)
	{
		if (rates.length == 6)
		{
			this.rates = rates;
		}
		else
		{
			double[] updatedRates = new double[6];
			
			if (rates.length > 0)
			{
				Arrays.fill(updatedRates, rates[rates.length - 1]);
			}
			
			System.arraycopy(rates, 0, updatedRates, 0, rates.length);
			
			this.rates = updatedRates;
		}
	}

	public double getTaxableIncome()
	{
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome)
	{
		this.taxableIncome = (taxableIncome > 0) ? taxableIncome: 0;
	}
	
	/**
	 * Returns the tax.
	 * 
	 * @return	the tax
	 */
	public double getTax()
	{
		if (taxableIncome < 0.0)
		{
			return 0.0;
		}
		
		double tax = 0;
		
		if ((filingStatus >= 0) && (filingStatus < 4))
		{
			if (taxableIncome <= brackets[filingStatus][0])
			{
				tax = taxableIncome * rates[0];
			}
			else if (taxableIncome <= brackets[filingStatus][1])
			{
				tax = (brackets[filingStatus][0] * rates[0]) + ((taxableIncome - brackets[filingStatus][0]) * rates[1]);
			}
			else if (taxableIncome <= brackets[filingStatus][2])
			{
				tax = (brackets[filingStatus][0] * rates[0]) + ((brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]) +
						((taxableIncome - brackets[filingStatus][1]) * rates[2]);
			}
			else if (taxableIncome <= brackets[filingStatus][3])
			{
				tax = (brackets[filingStatus][0] * rates[0]) + ((brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]) +
						((brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]) +
						((taxableIncome - brackets[filingStatus][2]) * rates[3]);
			}
			else if (taxableIncome <= brackets[filingStatus][4])
			{
				tax = (brackets[filingStatus][0] * rates[0]) + ((brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]) +
						((brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]) +
						((brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3]) +
						((taxableIncome - brackets[filingStatus][3]) * rates[4]);
			}
			else
			{
				tax = (brackets[filingStatus][0] * rates[0]) + ((brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]) +
						((brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]) +
						((brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3]) +
						((brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4]) +
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