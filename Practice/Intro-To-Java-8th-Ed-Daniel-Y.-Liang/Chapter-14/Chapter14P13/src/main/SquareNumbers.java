package main;

import java.math.BigInteger;

/**
 * @author Tony Liang
 *
 */
public class SquareNumbers
{
	public static void main(String[] args)
	{
		long smallestN = (long)Math.sqrt(Long.MAX_VALUE);
		BigInteger n = BigInteger.valueOf(smallestN);
		n = n.add(BigInteger.ONE);
		
		final int MAXIMUM_NUMBERS = 10;
		
		for (int count = 0; count < MAXIMUM_NUMBERS; count++)
		{
			System.out.println(n.multiply(n));
			n = n.add(BigInteger.ONE);
		}
	}
}