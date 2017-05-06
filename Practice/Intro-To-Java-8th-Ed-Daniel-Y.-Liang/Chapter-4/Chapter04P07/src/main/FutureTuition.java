package main;

public class FutureTuition
{

	public static void main(String[] args)
	{
		double tuition = 10000; // Year 1
		final double TUITION_INCREASE_PERCENT_RATE = 0.05;
		int year = 1;
		double totalTuitionAfterFourYears = 0.0;
		
		while (year <= 14) 
		{
			tuition *= (1 + TUITION_INCREASE_PERCENT_RATE);
			
			if (year == 10)
			{
				System.out.printf("In ten years, the tuition will be $%8.2f\n", tuition);
			}
			else if (year > 10)
			{
				totalTuitionAfterFourYears += tuition;
			}
			
			year++;
		}
		
		System.out.printf("Starting ten years from now, the total tuition after four years will be $%8.2f\n", 
				totalTuitionAfterFourYears);
	}

}