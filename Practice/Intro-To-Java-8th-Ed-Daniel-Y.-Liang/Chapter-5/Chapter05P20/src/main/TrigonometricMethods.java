package main;

/**
 * @author Tony Liang
 *
 */
public class TrigonometricMethods
{
	public static void main(String[] args)
	{
		final int STARTING_DEGREES = 0;
		final int ENDING_DEGREES = 360;
		final int CHANGE_IN_DEGREES = 10;
		
		System.out.println("Degree\tSin\tCos");
		
		for (int degree = STARTING_DEGREES; degree <= ENDING_DEGREES; degree += CHANGE_IN_DEGREES)
		{
			double sinValue = Math.round(Math.sin(degree * Math.PI / 180.0) * 10000.0) / 10000.0;
			double cosValue = Math.round(Math.cos(degree * Math.PI / 180.0) * 10000.0) / 10000.0;
			
			System.out.printf("%-3d\t%-6.4f\t%-6.4f\n", degree, sinValue, cosValue);
		}
		
		System.out.println();
	}
}