package main;

import java.math.*;

/**
 * @author Tony Liang
 *
 */
public class ApproximateEUsingBigDecimal
{
	public static void main(String[] args)
	{
		final int STARTING_I = 100;
		final int ENDING_I = 1000;
		final int CHANGE_IN_I = 100;
		
		System.out.println("e is approximately 1 + 1/(1!) + 1/(2!) + 1/(3!) + 1/(4!) + ... + 1/(i!).");
		
		for (int i = STARTING_I; i <= ENDING_I; i += CHANGE_IN_I)
		{
			System.out.println("For i = " + i + ", e is approximately " + approximateE(i));
		}
	}
	
	/**
	 * Returns an approximate number e with a precision of 25 digits given a nonzero positive integer.
	 * <ul>
	 * 	<li>
	 * 		If the integer is less than 1, e will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param i		an integer
	 * @return		an approximate number e with a precision of 25 digits given a nonzero positive integer
	 */
	public static BigDecimal approximateE(int i)
	{
		BigDecimal e = BigDecimal.ONE;
		
		if (i > 0)
		{
			BigDecimal reciprocalFactorial = BigDecimal.ONE;
			
			for (int n = 1; n <= i; n++)
			{
				reciprocalFactorial = reciprocalFactorial.divide(BigDecimal.valueOf(n), 24, RoundingMode.HALF_UP);
				e = e.add(reciprocalFactorial);
			}
		}
		
		return e;
	}
}