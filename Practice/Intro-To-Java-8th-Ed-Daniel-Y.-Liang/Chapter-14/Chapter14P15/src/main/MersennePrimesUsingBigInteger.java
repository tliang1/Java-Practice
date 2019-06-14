package main;

import java.math.BigInteger;

/**
 * @author Tony Liang
 *
 */
public class MersennePrimesUsingBigInteger
{
	public static void main(String[] args)
	{
		System.out.printf("%3s\t%7s", "p", "2^p - 1");
		System.out.println();
		
		final int MAXIMUM_P = 100;
		final int CERTAINTY = Integer.MAX_VALUE;
		
        for (int p = 2; p < MAXIMUM_P;)
        {
            if (new BigInteger(String.valueOf(p)).isProbablePrime(CERTAINTY))
            {
            	BigInteger possibleMersennePrime = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
            	
            	if (possibleMersennePrime.isProbablePrime(CERTAINTY))
            	{
            		System.out.printf("  %d\t   %s\n", p, possibleMersennePrime);
            	}
            }
            
            if (p > 2)
            {
            	p += 2;
            }
            else
            {
            	p++;
            }
        }
        
        System.out.println();
	}
}