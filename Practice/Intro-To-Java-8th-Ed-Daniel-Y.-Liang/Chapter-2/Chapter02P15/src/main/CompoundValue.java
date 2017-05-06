package main;

public class CompoundValue 
{

	public static void main(String[] args) 
	{
		final double INITIAL_ACCOUNT_VALUE = 100.0;
		final double ANNUAL_INTEREST_RATE = 0.05;
		final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;
		
		double firstMonthAccountValue = INITIAL_ACCOUNT_VALUE * (1 + MONTHLY_INTEREST_RATE);
		double secondMonthAccountValue = (INITIAL_ACCOUNT_VALUE + firstMonthAccountValue) * 
				(1 + MONTHLY_INTEREST_RATE);
		double thirdMonthAccountValue = (INITIAL_ACCOUNT_VALUE + secondMonthAccountValue) * 
				(1 + MONTHLY_INTEREST_RATE);
		double fourthMonthAccountValue = (INITIAL_ACCOUNT_VALUE + thirdMonthAccountValue) * 
				(1 + MONTHLY_INTEREST_RATE);
		double fifthMonthAccountValue = (INITIAL_ACCOUNT_VALUE + fourthMonthAccountValue) * 
				(1 + MONTHLY_INTEREST_RATE);
		double sixthMonthAccountValue = (INITIAL_ACCOUNT_VALUE + fifthMonthAccountValue) * 
				(1 + MONTHLY_INTEREST_RATE);
		
		System.out.println("First month account value: " + firstMonthAccountValue);
		System.out.println("Second month account value: " + secondMonthAccountValue);
		System.out.println("Third month account value: " + thirdMonthAccountValue);
		System.out.println("Fourth month account value: " + fourthMonthAccountValue);
		System.out.println("Fifth month account value: " + fifthMonthAccountValue);
		System.out.println("Sixth month account value: " + sixthMonthAccountValue);
	}

}