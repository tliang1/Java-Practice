package main;

import java.math.BigInteger;

/**
 * @author Tony Liang
 *
 */
public class DivisibleByTwoOrThree
{
	public static void main(String[] args)
	{	
		StringBuilder numberString = new StringBuilder("1");
		
		for (int count = 0; count < 49; count++)
		{
			numberString.append("0");
		}
		
		BigInteger bigInteger = new BigInteger(numberString.toString());;
		
		final int MAXIMUM_NUMBERS = 10;
		int count = 0;
		
		while (count < MAXIMUM_NUMBERS)
		{
			if ((bigInteger.mod(BigInteger.TWO) == BigInteger.ZERO) || (bigInteger.mod(BigInteger.valueOf(3)) == BigInteger.ZERO))
			{
				System.out.println(bigInteger);
				count++;
			}
			
			bigInteger = bigInteger.add(BigInteger.ONE);
		}
	}
}