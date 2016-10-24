package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.CreditCardNumberValidation;

/**
 * @author Tony Liang
 *
 */
public class CreditCardNumberValidationTest
{
	Collection<Object[]> validCardNumbers = Arrays.asList(new Object[][] { { 4388576018410707L, 29, 41 } });
	Collection<Object[]> invalidCardNumbers = Arrays.asList(new Object[][] { { 4388576018402626L, 37, 38 } });
	
	@Test
	public void testIsValid()
	{
		for (Object[] cardNumber : validCardNumbers)
		{
			assertTrue(CreditCardNumberValidation.isValid((long)(cardNumber[0])));
		}
		
		for (Object[] cardNumber : invalidCardNumbers)
		{
			assertFalse(CreditCardNumberValidation.isValid((long)(cardNumber[0])));
		}
	}
	
	@Test
	public void testSumOfDoubleEvenPlace()
	{
		for (Object[] cardNumber : validCardNumbers)
		{
			assertEquals((int)(cardNumber[1]), 
					CreditCardNumberValidation.sumOfDoubleEvenPlace((long)(cardNumber[0])));
		}
		
		for (Object[] cardNumber : invalidCardNumbers)
		{
			assertEquals((int)(cardNumber[1]), 
					CreditCardNumberValidation.sumOfDoubleEvenPlace((long)(cardNumber[0])));
		}
	}
	
	@Test
	public void testGetDigit()
	{
		int[][] numbers = new int[][] { { 4, 4 }, { 16, 7 }, { -7, 0 }, { 21, 0 } };
		
		for (int[] number : numbers)
		{
			assertEquals(number[1], CreditCardNumberValidation.getDigit(number[0]));
		}
	}
	
	@Test
	public void testSumOfOddPlace()
	{
		for (Object[] cardNumber : validCardNumbers)
		{
			assertEquals((int)(cardNumber[2]), CreditCardNumberValidation.sumOfOddPlace((long)(cardNumber[0])));
		}
		
		for (Object[] cardNumber : invalidCardNumbers)
		{
			assertEquals((int)(cardNumber[2]), CreditCardNumberValidation.sumOfOddPlace((long)(cardNumber[0])));
		}
	}
	
	@Test
	public void testPrefixMatched()
	{
		Collection<Object[]> validPrefixNumbers = Arrays.asList(new Object[][] { 
			{ 4388576018410707L, 43, true }, { 4388576018410707L, 4, true }, { 4388576018410707L, 43885, true } });
		Collection<Object[]> invalidPrefixNumbers = Arrays.asList(new Object[][] { 
			{ 4388576018410707L, 5, false }, { 4388576018410707L, 638, false }, { 4388576018410707L, -5, false }, 
			{ -4388576018410707L, 4, false }, { -4388576018410707L, -5, false } });
		
		for (Object[] number : validPrefixNumbers)
		{
			assertTrue(CreditCardNumberValidation.prefixMatched((long)(number[0]), (int)(number[1])));
		}
		
		for (Object[] number : invalidPrefixNumbers)
		{
			assertFalse(CreditCardNumberValidation.prefixMatched((long)(number[0]), (int)(number[1])));
		}
	}
	
	@Test
	public void testGetSize()
	{
		int[][] randomNumbers = new int[][] { { (int)(Math.random() * -1000), 0 }, 
			{ (int)(Math.random() * 10), 1 }, { 10 + (int)(Math.random() * 90), 2 }, 
			{ 100 + (int)(Math.random() * 900), 3 }, { 1000 + (int)(Math.random() * 9000), 4 } };
		
		for (int[] number : randomNumbers)
		{
			assertEquals(number[1], CreditCardNumberValidation.getSize(number[0]));
		}
	}
	
	@Test
	public void testGetPrefix()
	{
		long[][] prefixNumbers = new long[][] { { 4388576018410707L, 1, 4 }, { 4388576018410707L, 4, 4388 }, 
			{ 4388576018410707L, 6, 438857 }, { 123L, 5, 123 }, { 4388576018410707L, 0, 4388576018410707L },
			{ 0, 0, 0}, { -56, 1, -56 } };
		
		for (long[] number : prefixNumbers)
		{
			assertEquals(number[2], CreditCardNumberValidation.getPrefix(number[0], (int)(number[1])));
		}
	}

}