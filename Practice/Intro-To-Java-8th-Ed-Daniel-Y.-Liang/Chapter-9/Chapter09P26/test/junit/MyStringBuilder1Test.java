package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import main.MyStringBuilder1;

/**
 * @author Tony Liang
 *
 */
public class MyStringBuilder1Test
{
	final String myString = "Java";
	final MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1(myString);
	Random random = new Random();
	
	/**
	 * Test method for {@link main.MyStringBuilder1#append(main.MyStringBuilder1)}.
	 */
	@Test
	public void testAppendMyStringBuilder1()
	{
		String someString = " Programming Language";
		MyStringBuilder1 someStringStringBuilder = new MyStringBuilder1(someString);
		MyStringBuilder1 appendedStringBuilder = myStringBuilder1.append(someStringStringBuilder);
		
		assertEquals(myString + someString, appendedStringBuilder.toString());
	}

	/**
	 * Test method for {@link main.MyStringBuilder1#append(int)}.
	 */
	@Test
	public void testAppendInt()
	{
		int randomInteger = random.nextInt();
		MyStringBuilder1 appendedIntegerStringBuilder = myStringBuilder1.append(randomInteger);
		
		assertEquals(myString + randomInteger, appendedIntegerStringBuilder.toString());
	}

	/**
	 * Test method for {@link main.MyStringBuilder1#charAt(int)} with a valid index.
	 */
	@Test
	public void testCharAtWithAValidIndex()
	{
		if (myStringBuilder1.length() > 0)
		{
			int randomIndex = random.nextInt(myStringBuilder1.length());
			
			assertEquals(myString.charAt(randomIndex), myStringBuilder1.charAt(randomIndex));
		}
	}
	
	/**
	 * Test method for {@link main.MyStringBuilder1#charAt(int)} with invalid indices.
	 */
	@Test
	public void testCharAtWithInvalidIndices()
	{	
		assertEquals('\u0000', myStringBuilder1.charAt(-1));
		assertEquals('\u0000', myStringBuilder1.charAt(myStringBuilder1.length()));
	}
	
	/**
	 * Test method for {@link main.MyStringBuilder1#toLowerCase()}.
	 */
	@Test
	public void testToLowerCase()
	{
		MyStringBuilder1 lowerCaseStringBuilder = myStringBuilder1.toLowerCase();
		
		assertEquals(myString.toLowerCase(), lowerCaseStringBuilder.toString());
	}

	/**
	 * Test method for {@link main.MyStringBuilder1#substring(int, int)} with valid beginning and ending indices.
	 */
	@Test
	public void testSubstringWithValidBeginEndIndices()
	{
		if (myStringBuilder1.length() > 0)
		{
			int randomBeginIndex = random.nextInt(myStringBuilder1.length());
			MyStringBuilder1 someSubstring = myStringBuilder1.substring(randomBeginIndex, myStringBuilder1.length());
			String expected = myString.substring(randomBeginIndex, myString.length());
			
			assertEquals(expected, someSubstring.toString());
		}
		
		assertEquals(myString, myStringBuilder1.substring(0, myStringBuilder1.length()).toString());
	}
	
	/**
	 * Test method for {@link main.MyStringBuilder1#substring(int, int)} with invalid beginning and ending indices.
	 */
	@Test
	public void testSubstringWithInvalidBeginEndIndices()
	{
		assertEquals(myStringBuilder1.toString(), myStringBuilder1.substring(0, myStringBuilder1.length() + 2).toString());
		assertEquals(myStringBuilder1.toString(), 
						myStringBuilder1.substring(myStringBuilder1.length(), myStringBuilder1.length() + 2).toString());
		assertEquals(myStringBuilder1.toString(), myStringBuilder1.substring(2, 1).toString());
		assertEquals(myStringBuilder1.toString(), 
						myStringBuilder1.substring(myStringBuilder1.length(), myStringBuilder1.length()).toString());
		assertEquals(myStringBuilder1.toString(), 
						myStringBuilder1.substring(myStringBuilder1.length() + 5, myStringBuilder1.length() + 2).toString());
		assertEquals(myStringBuilder1.toString(), myStringBuilder1.substring(-5, myStringBuilder1.length()).toString());
		assertEquals(myStringBuilder1.toString(), myStringBuilder1.substring(-5, myStringBuilder1.length() + 2).toString());
		assertEquals(myStringBuilder1.toString(), myStringBuilder1.substring(-2, -5).toString());
	}
	
	/**
	 * Test method for {@link main.MyStringBuilder1#toString()}.
	 */
	@Test
	public void testToString()
	{
		assertEquals(myString, myStringBuilder1.toString());
	}
}