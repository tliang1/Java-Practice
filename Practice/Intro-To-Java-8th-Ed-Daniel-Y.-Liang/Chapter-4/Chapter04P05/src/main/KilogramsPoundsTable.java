package main;

public class KilogramsPoundsTable
{

	public static void main(String[] args)
	{
		final int MINIMUM_KILOGRAMS = 1;
		final int MAXIMUM_KILOGRAMS = 200;
		final int MINIMUM_POUNDS = 20;
		final int MAXIMUM_POUNDS = 515;
		final int CHANGE_IN_KILOGRAMS = 2;
		final int CHANGE_IN_POUNDS = 5;
		final double POUNDS_PER_KILOGRAM = 2.2;
		
		System.out.println("Kilograms\tPounds\tPounds\tKilograms");
		
		for (int i = MINIMUM_KILOGRAMS, j = MINIMUM_POUNDS; i < MAXIMUM_KILOGRAMS && j <= MAXIMUM_POUNDS; 
				i += CHANGE_IN_KILOGRAMS, j += CHANGE_IN_POUNDS)
		{
			System.out.printf(i + "\t\t" + "%5.1f\t" + j + "\t" + "%6.2f\n", (i * POUNDS_PER_KILOGRAM), 
					(j / POUNDS_PER_KILOGRAM));
		}
	}

}