package main;

/**
 * @author Tony Liang
 *
 */
public class SalesAmountRevised
{
	
	public static void main(String[] args)
	{
		final double MINIMUM_SALES_AMOUNT = 10000.0;
		final double MAXIMUM_SALES_AMOUNT = 100000.0;
		final double CHANGE_IN_SALES_AMOUNT = 5000.0;
		
		System.out.println("Sales Amount\tCommission");
		
		for (double salesAmount = MINIMUM_SALES_AMOUNT; salesAmount <= MAXIMUM_SALES_AMOUNT; 
				salesAmount += CHANGE_IN_SALES_AMOUNT)
		{
			System.out.printf("%-6.0f\t\t%-7.1f\n", salesAmount, computeCommission(salesAmount));
		}
		
		System.out.println();
	}

	/**
	 * Returns the commission of the specified sales amount.
	 * 
	 * @param salesAmount	the sales amount
	 * @return				the commission
	 */
	public static double computeCommission(double salesAmount)
	{
		double saleAmountMaxRange1 = 5000.0;
		double saleAmountMaxRange2 = 10000.0;
		double commissionPercentageRate1 = 8.0;
		double commissionPercentageRate2 = 10.0;
		double commissionPercentageRate3 = 12.0;
		
		if (salesAmount > saleAmountMaxRange2)
    	{
    		return (saleAmountMaxRange1 * (commissionPercentageRate1 / 100.0)) + 
    				(saleAmountMaxRange1 * (commissionPercentageRate2 / 100.0)) + 
    				((salesAmount - saleAmountMaxRange2) * (commissionPercentageRate3 / 100.0));
    	}
    	else if (salesAmount > saleAmountMaxRange1)
    	{
    		return (saleAmountMaxRange1 * (commissionPercentageRate1 / 100.0)) + 
    				((salesAmount - saleAmountMaxRange1) * (commissionPercentageRate2 / 100.0));
    	}
    	else
    	{
    		return salesAmount * (commissionPercentageRate1 / 100.0);
    	}
	}
}