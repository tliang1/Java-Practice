package main;

public class MilesToKilometersTable
{

	public static void main(String[] args)
	{
		final int MINIMUM_MILES = 1;
		final int MAXIMUM_MILES = 10;
		final double KILOMETERS_PER_MILE = 1.609;
		
		System.out.println("Miles\tKilometers");
		
		for (int i = MINIMUM_MILES; i <= MAXIMUM_MILES; i++)
		{
			System.out.printf(i + "\t" + "%6.3f\n", (i * KILOMETERS_PER_MILE));
		}
	}

}