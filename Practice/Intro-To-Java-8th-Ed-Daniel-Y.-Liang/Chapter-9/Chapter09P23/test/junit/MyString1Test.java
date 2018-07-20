package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import main.MyString1;

/**
 * @author Tony Liang
 *
 */
public class MyString1Test
{
	Random random = new Random();
	final char[] myString = {'J', 'a', 'v', 'a'};
	final MyString1 myString1 = new MyString1(myString);
	
	/**
	 * Test method for {@link main.MyString1#charAt(int)} with a valid index.
	 */
	@Test
	public void testCharAtWithAValidIndex()
	{	
		if (myString1.length() > 0)
		{
			int randomIndex = random.nextInt(myString1.length());
			
			assertEquals(myString[randomIndex], myString1.charAt(randomIndex));
		}
	}
	
	/**
	 * Test method for {@link main.MyString1#charAt(int)} with invalid indices.
	 */
	@Test
	public void testCharAtWithInvalidIndices()
	{	
		assertEquals('\u0000', myString1.charAt(-1));
		assertEquals('\u0000', myString1.charAt(myString1.length()));
	}
	
	/**
	 * Test method for {@link main.MyString1#equals(main.MyString1)} with equal and unequal strings.
	 */
	@Test
	public void testEqualsMyString1WithEqualAndUnequalStrings()
	{
		MyString1 myString2 = new MyString1(myString);
		
		assertTrue(myString1.equals(myString2));
		
		char[] differentSizeString = {'S', 'c', 'a', 'l', 'a'};
		MyString1 differentSizeString1 = new MyString1(differentSizeString);
		
		assertFalse(myString1.equals(differentSizeString1));
	}
	
	/**
	 * Test method for {@link main.MyString1#equals(main.MyString1)} with lowercased string.
	 */
	@Test
	public void testEqualsMyString1WithLowercasedString()
	{
		MyString1 lowerCaseString = myString1.toLowerCase();
		
		if (myString1.length() > 0)
		{
			assertFalse(myString1.equals(lowerCaseString));
		}
		else
		{
			assertTrue(myString1.equals(lowerCaseString));
		}
	}
	
	/**
	 * Test method for {@link main.MyString1#substring(int, int)} with valid beginning and ending indices.
	 */
	@Test
	public void testSubstringWithValidBeginEndIndices()
	{
		if (myString1.length() > 0)
		{
			int randomBeginIndex = random.nextInt(myString1.length());
			MyString1 someSubstring = myString1.substring(randomBeginIndex, myString1.length());
			char[] expected = String.valueOf(myString).substring(randomBeginIndex, myString.length).toCharArray();
			
			assertTrue(someSubstring.equals(new MyString1(expected)));
		}
		
		assertTrue(myString1.equals(myString1.substring(0, myString1.length())));
	}
	
	/**
	 * Test method for {@link main.MyString1#substring(int, int)} with invalid beginning and ending indices.
	 */
	@Test
	public void testSubstringWithInvalidBeginEndIndices()
	{
		assertTrue(myString1.equals(myString1.substring(0, myString1.length() + 2)));
		assertTrue(myString1.equals(myString1.substring(myString1.length(), myString1.length() + 2)));
		assertTrue(myString1.equals(myString1.substring(2, 1)));
		assertTrue(myString1.equals(myString1.substring(myString1.length(), myString1.length())));
		assertTrue(myString1.equals(myString1.substring(myString1.length() + 5, myString1.length() + 2)));
		assertTrue(myString1.equals(myString1.substring(-5, myString1.length())));
		assertTrue(myString1.equals(myString1.substring(-5, myString1.length() + 2)));
		assertTrue(myString1.equals(myString1.substring(-2, -5)));
	}

	/**
	 * Test method for {@link main.MyString1#toLowerCase()}.
	 */
	@Test
	public void testToLowerCase()
	{
		MyString1 lowerCaseString = myString1.toLowerCase();
		String expected = String.valueOf(myString).toLowerCase();
		
		for (int index = 0; index < lowerCaseString.length(); index++)
		{
			assertEquals(expected.charAt(index), lowerCaseString.charAt(index));
		}
	}

	/**
	 * Test method for {@link main.MyString1#valueOf(int)} with a random integer.
	 */
	@Test
	public void testValueOfWithRandomInteger()
	{
		int randomInteger = random.nextInt();
		MyString1 randomIntegerString = MyString1.valueOf(randomInteger);
		String expectedRandomIntegerString = String.valueOf(randomInteger);
		
		for (int index = 0; index < randomIntegerString.length(); index++)
		{
			assertEquals(expectedRandomIntegerString.charAt(index), randomIntegerString.charAt(index));
		}
	}
	
	/**
	 * Test method for {@link main.MyString1#valueOf(int)} with positive and negative digits.
	 */
	@Test
	public void testValueOfWithPostiveAndNegativeDigits()
	{		
		int randomDigit = random.nextInt(10);
		
		assertEquals((char) (randomDigit + '0'), MyString1.valueOf(randomDigit).charAt(0));
		
		MyString1 randomNegativeDigitString = MyString1.valueOf(-randomDigit);
		String expectedRandomNegativeDigitString = String.valueOf(-randomDigit);
		
		for (int index = 0; index < randomNegativeDigitString.length(); index++)
		{
			assertEquals(expectedRandomNegativeDigitString.charAt(index), randomNegativeDigitString.charAt(index));
		}
	}
}