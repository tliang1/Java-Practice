package main;

import java.math.BigInteger;

/**
 * @author Tony Liang
 *
 */
public class UsingRational
{
	public static void main(String[] args)
	{
		Rational sum = new Rational();
		
		final BigInteger MAXIMUM_I = BigInteger.valueOf(100);
		
		for (BigInteger i = BigInteger.ONE; i.compareTo(MAXIMUM_I) < 0; i = i.add(BigInteger.ONE))
		{
			sum = sum.add(new Rational(i, i.add(BigInteger.ONE)));
		}
		
		System.out.println("The summation of i/(i + 1) for i = 1 to i = " + (MAXIMUM_I.subtract(BigInteger.ONE)) + " is " + sum);
	}
}