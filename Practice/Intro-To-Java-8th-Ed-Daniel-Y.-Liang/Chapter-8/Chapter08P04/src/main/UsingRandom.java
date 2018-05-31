package main;

import java.util.Random;

/**
 * @author Tony Liang
 *
 */
public class UsingRandom
{
	public static void main(String[] args)
	{
		final long SEED = 1000;
		final int NUMBER_OF_RANDOM_INTEGERS = 50;
		
		Random random = new Random(SEED);
		
		System.out.print("The first 50 random integers between 0 and 100 are: ");
		
		for (int i = 0; i < NUMBER_OF_RANDOM_INTEGERS; i++)
		{
			System.out.print(random.nextInt(100) + " ");
		}
	}
}