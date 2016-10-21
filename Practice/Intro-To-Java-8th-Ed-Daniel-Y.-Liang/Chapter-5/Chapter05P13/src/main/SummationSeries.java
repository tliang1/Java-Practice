package main;

/**
 * @author Tony Liang
 *
 */
public class SummationSeries
{
	
	public static void main(String[] args)
	{
		final int STARTING_NUMBER = 1;
		final int ENDING_NUMBER = 20;
		
		System.out.println("i\tm(i)");
		
		for (int i = STARTING_NUMBER; i <= ENDING_NUMBER; i++)
		{
			System.out.printf("%-2d\t%-7.4f\n", i, computeSummationSeries(i));
		}
		
		System.out.println();
	}

	/**
	 * Returns the summation of the following series with a specified integer argument: 
	 * m( i ) = (1 / 2) + (2 / 3) + .<!-- -->.<!-- -->.<!-- --> + ( i / ( i + 1)) where i &gt;= 0.
	 * <p>
	 * If i is less than 0, the sum will be 0.0.
	 * 
	 * @param i		an integer
	 * @return		the summation of the series
	 */
	public static double computeSummationSeries(int i)
	{
		double sum = 0.0;
		
		for (int num = 1; num <= i; num++)
		{
			sum += (num / (num + 1.0));
		}
		
		return sum;
	}
}