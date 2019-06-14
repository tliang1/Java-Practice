package main;

import java.math.BigInteger;

/**
 * @author Tony Liang
 *
 */
public class DivisibleByFiveOrSix
{
	public static void main(String[] args)
	{	
		BigInteger bigInteger = new BigInteger(String.valueOf(Long.MAX_VALUE));
		bigInteger = bigInteger.add(BigInteger.ONE);
		
		final int MAXIMUM_NUMBERS = 10;
		int count = 0;
		
		while (count < MAXIMUM_NUMBERS)
		{
			if ((bigInteger.mod(BigInteger.valueOf(5)) == BigInteger.ZERO) || (bigInteger.mod(BigInteger.valueOf(6)) == BigInteger.ZERO))
			{
				System.out.println(bigInteger);
				count++;
			}
			
			bigInteger = bigInteger.add(BigInteger.ONE);
		}
	}
}