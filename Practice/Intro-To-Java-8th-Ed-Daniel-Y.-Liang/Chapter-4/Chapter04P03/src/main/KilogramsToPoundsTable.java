package main;

public class KilogramsToPoundsTable
{

	public static void main(String[] args)
	{
		final int MINIMUM_KILOGRAMS = 1;
		final int MAXIMUM_KILOGRAMS = 200;
		final int CHANGE_IN_KILOGRAMS = 2;
		final double POUNDS_PER_KILOGRAM = 2.2;
		
		System.out.println("Kilograms\tPounds");
		
		for (int i = MINIMUM_KILOGRAMS; i < MAXIMUM_KILOGRAMS; i += CHANGE_IN_KILOGRAMS)
		{
			System.out.printf(i + "\t\t" + "%5.1f\n", (i * POUNDS_PER_KILOGRAM));
		}
	}

}