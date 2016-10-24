package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.MersennePrimes;

/**
 * @author Tony Liang
 *
 */
public class MersennePrimesTest
{
	Collection<Object[]> mersenneNumbers = Arrays.asList(new Object[][] { { 2, 3, true }, { 1, 0, false }, 
		{ 13, 8191, true }, { 6, 63, false } });
	
	@Test
	public void testMersennePrime()
	{
		for (Object[] number : mersenneNumbers)
		{
			int num = (int) number[0];
			assertEquals(number[1], MersennePrimes.mersennePrime(num));
		}
	}
	
	@Test
	public void testIsMersennePrime()
	{
		for (Object[] number : mersenneNumbers)
		{
			int num = (int) number[0];
			assertEquals(number[2], MersennePrimes.isMersennePrime(num));
		}
	}

}