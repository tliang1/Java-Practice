package main;

/**
 * @author Tony Liang
 *
 */
public class ComputeSeries
{
	public static void main(String[] args)
	{
		final int STARTING_NUMBER = 10;
		final int ENDING_NUMBER = 100;
		final int CHANGE_IN_NUMBER = 10;
		
		System.out.println("i\tm(i)");
		
		for (int i = STARTING_NUMBER; i <= ENDING_NUMBER; i += CHANGE_IN_NUMBER)
		{
			System.out.printf("%-3d\t%-7.5f\n", i, computeSeries(i));
		}
		
		System.out.println();
	}

	/**
	 * Returns the summation of the following series with the specified integer argument:
	 * <p>
	 * m( i ) = 4 (1 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11) + .<!-- -->.<!-- -->.<!-- --> + 
	 * (1 / (2i - 1)) - (1 / (2i + 1))) where i &gt;= 0.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 1, the sum will be 4.0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param i		number of iterations
	 * @return		the summation of the series
	 */
	public static double computeSeries(int i)
	{
		if (i < 1)
		{
			i = 1;
		}
		
		double pI = 0.0;
		
		for (int iteration = 0; iteration < i; iteration++)
		{
			pI += Math.pow(-1, iteration) / ((2 * iteration) + 1);
		}
		
		pI *= 4.0;
		
		return pI;
	}
}