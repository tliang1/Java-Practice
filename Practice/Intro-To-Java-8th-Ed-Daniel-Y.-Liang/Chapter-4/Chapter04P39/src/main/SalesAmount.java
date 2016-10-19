package main;

public class SalesAmount
{

	public static void main(String[] args)
	{
		final double BASE_SALARY = 5000.0;
		final double SALARY_GOAL = 30000.0;
		final double SALE_AMOUNT_MAX_RANGE_1 = 5000.0;
		final double SALE_AMOUNT_MAX_RANGE_2 = 10000.0;
		final double COMMISSION_PERCENTAGE_RATE_1 = 8.0;
		final double COMMISSION_PERCENTAGE_RATE_2 = 10.0;
		final double COMMISSION_PERCENTAGE_RATE_3 = 12.0;
		
		double commissionSought = SALARY_GOAL - BASE_SALARY;
		
		double commission = 0.0;
		double salesAmount = 0.01;
		
		do 
	    {
	    	// Compute commission
	    	if (salesAmount > SALE_AMOUNT_MAX_RANGE_2)
	    	{
	    		commission = (SALE_AMOUNT_MAX_RANGE_1 * (COMMISSION_PERCENTAGE_RATE_1 / 100.0)) + 
	    				(SALE_AMOUNT_MAX_RANGE_1 * (COMMISSION_PERCENTAGE_RATE_2 / 100.0)) + 
	    				((salesAmount - SALE_AMOUNT_MAX_RANGE_2) * (COMMISSION_PERCENTAGE_RATE_3 / 100.0));
	    	}
	    	else if (salesAmount > SALE_AMOUNT_MAX_RANGE_1)
	    	{
	    		commission = (SALE_AMOUNT_MAX_RANGE_1 * (COMMISSION_PERCENTAGE_RATE_1 / 100.0)) + 
	    				((salesAmount - SALE_AMOUNT_MAX_RANGE_1) * (COMMISSION_PERCENTAGE_RATE_2 / 100.0));
	    	}
	    	else
	    	{
	    		commission = salesAmount * (COMMISSION_PERCENTAGE_RATE_1 / 100.0);
	    	}
	    	
	    	salesAmount += 0.01;
	    } while (commission < commissionSought);
		
		System.out.println("To earn $" + SALARY_GOAL + " a year, the minimum amount of sales you have to generate" + 
				" is $" + ((int)(salesAmount * 100) / 100.0));
	}

}