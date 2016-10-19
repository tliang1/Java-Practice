package main;

import java.util.Scanner;

public class SalesAmountRevised
{

	public static void main(String[] args)
	{
		final double SALE_AMOUNT_MAX_RANGE_1 = 5000.0;
		final double SALE_AMOUNT_MAX_RANGE_2 = 10000.0;
		final double COMMISSION_PERCENTAGE_RATE_1 = 8.0;
		final double COMMISSION_PERCENTAGE_RATE_2 = 10.0;
		final double COMMISSION_PERCENTAGE_RATE_3 = 12.0;
		
		double commission = 0.0;
		double salesAmount = 0.01;
		
	    Scanner input = new Scanner(System.in);
	    double commissionSought = -1.0;
	    
	    while (commissionSought < 0.0)
	    {
	    	System.out.print("Enter the desired commission (Must be positive): ");
		    commissionSought = input.nextDouble();
	    }
	    
	    for (salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) 
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
	    }
	    
	    System.out.println("The sales amount of $" + ((int)(salesAmount * 100) / 100.0) + 
	    		" is needed to make a commission of $" + commissionSought);
	    
	    input.close();
	}

}