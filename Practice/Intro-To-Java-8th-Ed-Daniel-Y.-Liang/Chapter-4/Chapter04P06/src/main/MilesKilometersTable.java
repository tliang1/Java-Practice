package main;

public class MilesKilometersTable
{

	public static void main(String[] args)
	{
		final int MINIMUM_MILES = 1;
		final int MAXIMUM_MILES = 10;
		final int MINIMUM_KILOMETERS = 20;
		final int MAXIMUM_KILOMETERS = 65;
		final int CHANGE_IN_KILOMETERS = 5;
		final double KILOMETERS_PER_MILE = 1.609;
		
		System.out.println("Miles\tKilometers\tKilometers\tMiles");
		
		for (int i = MINIMUM_MILES, j = MINIMUM_KILOMETERS; i <= MAXIMUM_MILES && j <= MAXIMUM_KILOMETERS; 
				i++, j += CHANGE_IN_KILOMETERS)
		{
			System.out.printf(i + "\t" + "%6.3f\t\t" + j + "\t\t" + "%6.3f\n", (i * KILOMETERS_PER_MILE), 
					(j / KILOMETERS_PER_MILE));
		}
	}

}