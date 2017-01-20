package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CreditCardNumberValidation;

/**
 * @author Tony Liang
 *
 */
public class CreditCardNumberValidationTest
{
	@Test
	public void testIsValid()
	{
		long[] creditCardNumbers = { 4388576018402626L, 4388576018410707L };
		boolean[] validOrNot = { false, true };
		
		for (int creditCardNumber = 0; creditCardNumber < creditCardNumbers.length; creditCardNumber++)
		{
			assertEquals(validOrNot[creditCardNumber],
					CreditCardNumberValidation.isValid(creditCardNumbers[creditCardNumber]));
		}
	}
	
	@Test
	public void testSumOfDoubleEvenPlace()
	{
		long[] creditCardNumbers = { 0, 4388576018402626L, 4388576018410707L };
		int[] listOfSumOfAllDoubledDigitsInEvenPlace = { 0, 37, 29 };
		
		for (int creditCardNumber = 0; creditCardNumber < creditCardNumbers.length; creditCardNumber++)
		{
			assertEquals(listOfSumOfAllDoubledDigitsInEvenPlace[creditCardNumber],
					CreditCardNumberValidation.sumOfDoubleEvenPlace(creditCardNumbers[creditCardNumber]));
		}
	}
	
	@Test
	public void testGetDigit()
	{
		int[] creditCardNumbers = { -7, 21, 4, 16 };
		int[] listOfSumOfAllDigits = { 0, 0, 4, 7 };
		
		for (int creditCardNumber = 0; creditCardNumber < creditCardNumbers.length; creditCardNumber++)
		{
			assertEquals(listOfSumOfAllDigits[creditCardNumber],
					CreditCardNumberValidation.getDigit(creditCardNumbers[creditCardNumber]));
		}
	}
	
	@Test
	public void testSumOfOddPlace()
	{
		long[] creditCardNumbers = { 0, 4388576018402626L, 4388576018410707L };
		int[] listOfSumOfAllDigitsInOddPlace = { 0, 38, 41 };
		
		for (int creditCardNumber = 0; creditCardNumber < creditCardNumbers.length; creditCardNumber++)
		{
			assertEquals(listOfSumOfAllDigitsInOddPlace[creditCardNumber],
					CreditCardNumberValidation.sumOfOddPlace(creditCardNumbers[creditCardNumber]));
		}
	}
	
	@Test
	public void testPrefixMatched()
	{
		long[] validCreditCardNumbers = { 4388576018410707L, 4388576018410707L, 4388576018410707L };
		long[] invalidCreditCardNumbers = { 4388576018410707L, 4388576018410707L, 4388576018410707L,
				-4388576018410707L, -4388576018410707L };
		int[] validPrefixes = { 43, 4, 43885 };
		int[] invalidPrefixes = { 5, 638, -5, 4, -5 };
		
		for (int creditCardNumber = 0; creditCardNumber < validCreditCardNumbers.length; creditCardNumber++)
		{
			assertTrue(CreditCardNumberValidation.prefixMatched(validCreditCardNumbers[creditCardNumber],
					validPrefixes[creditCardNumber]));
		}
		
		for (int creditCardNumber = 0; creditCardNumber < invalidCreditCardNumbers.length; creditCardNumber++)
		{
			assertFalse(CreditCardNumberValidation.prefixMatched(invalidCreditCardNumbers[creditCardNumber],
					invalidPrefixes[creditCardNumber]));
		}
	}
	
	@Test
	public void testGetSize()
	{
		long[] creditCardNumbers = { (int)(Math.random() * -1000), (int)(Math.random() * 10),
				10 + (int)(Math.random() * 90), 100 + (int)(Math.random() * 900),
				1000 + (int)(Math.random() * 9000) };
		int[] numberOfDigitsForCreditCardNumbers = { 0, 1, 2, 3, 4 };
		
		for (int creditCardNumber = 0; creditCardNumber < creditCardNumbers.length; creditCardNumber++)
		{
			assertEquals(numberOfDigitsForCreditCardNumbers[creditCardNumber],
					CreditCardNumberValidation.getSize(creditCardNumbers[creditCardNumber]));
		}
	}
	
	@Test
	public void testGetPrefix()
	{
		long[] creditCardNumbers = { 0, 4388576018410707L, -56, 4388576018410707L, 4388576018410707L,
				4388576018410707L, 123 };
		int[] numberOfDigitsForPrefixes = { 0, 0, 1, 1, 4, 6, 5 };
		long[] prefixes = { 0, 4388576018410707L, -56, 4, 4388, 438857, 123 };
		
		for (int creditCardNumber = 0; creditCardNumber < creditCardNumbers.length; creditCardNumber++)
		{
			assertEquals(prefixes[creditCardNumber],
					CreditCardNumberValidation.getPrefix(creditCardNumbers[creditCardNumber],
							numberOfDigitsForPrefixes[creditCardNumber]));
		}
	}
}