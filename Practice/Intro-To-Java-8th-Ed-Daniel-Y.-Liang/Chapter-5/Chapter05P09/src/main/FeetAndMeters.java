package main;

/**
 * @author Tony Liang
 *
 */
public class FeetAndMeters
{
	
	public static void main(String[] args)
	{
		final double MINIMUM_FEET = 1.0;
		final double MAXIMUM_FEET = 10.0;
		final double MINIMUM_METERS = 20.0;
		final double MAXIMUM_METERS = 65.0;
		final double CHANGE_IN_FEET = 1.0;
		final double CHANGE_IN_METERS = 5.0;
		
		System.out.println("Feet\tMeters\tMeters\tFeet");
		
		for (double feet = MINIMUM_FEET, meters = MINIMUM_METERS; 
				(feet <= MAXIMUM_FEET) && (meters <= MAXIMUM_METERS); 
				feet += CHANGE_IN_FEET, meters += CHANGE_IN_METERS)
		{
			System.out.printf("%-4.1f\t%-5.3f\t%-4.1f\t%-7.3f\n", feet, footToMeter(feet), meters, 
					meterToFoot(meters));
		}
		
		System.out.println();
	}
	
	/**
	 * Converts feet to meters.
	 * 
	 * @param foot	foot
	 * @return		meter
	 */
	public static double footToMeter(double foot)
	{
		return foot * 0.305;
	}
	
	/**
	 * Converts meters to feet.
	 * 
	 * @param meter		meter
	 * @return			foot
	 */
	public static double meterToFoot(double meter)
	{
		return meter / 0.305;
	}

}