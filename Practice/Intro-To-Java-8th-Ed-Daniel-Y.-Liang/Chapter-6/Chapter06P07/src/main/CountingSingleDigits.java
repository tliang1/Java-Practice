package main;

/**
 * @author Tony Liang
 *
 */
public class CountingSingleDigits
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_DIGITS = 10;
		final int TOTAL_DIGITS = 100;
		int[] counts = new int[NUMBER_OF_DIGITS];
		
		for (int count = 0; count < TOTAL_DIGITS; count++) 
		{
			counts[(int)(Math.random() * 10)]++;
		}
		
		for (int number = 0; number < NUMBER_OF_DIGITS; number++)
		{
			System.out.println("#" + number + ": " + counts[number] + " times.");
		}
	}
}