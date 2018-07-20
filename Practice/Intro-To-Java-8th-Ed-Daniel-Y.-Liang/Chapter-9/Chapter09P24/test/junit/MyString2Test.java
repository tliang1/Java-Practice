package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import main.MyString2;

/**
 * @author Tony Liang
 *
 */
public class MyString2Test
{
	final String myString = "Java";
	final MyString2 myString2 = new MyString2(myString);
	
	/**
	 * Test method for {@link main.MyString2#compare(java.lang.String)} with empty strings.
	 */
	@Test
	public void testCompareWithEmptyStrings()
	{
		MyString2 emptyString = new MyString2("");
		String equalToString = "";
		String lessThanString = "Scala";
		
		assertTrue(emptyString.compare(equalToString) == 0);
		assertTrue(emptyString.compare(lessThanString) < 0);
	}
	
	/**
	 * Test method for {@link main.MyString2#compare(java.lang.String)} with different strings.
	 */
	@Test
	public void testCompareWithDifferentStrings()
	{
		MyString2 someString2 = new MyString2("Java");
		String greaterThanString = "Clojure";
		String equalToString = "Java";
		String lessThanString = "Scala";
		
		assertTrue(someString2.compare(greaterThanString) > 0);
		assertTrue(someString2.compare(equalToString) == 0);
		assertTrue(someString2.compare(lessThanString) < 0);
	}
	
	/**
	 * Test method for {@link main.MyString2#compare(java.lang.String)} with similar strings.
	 */
	@Test
	public void testCompareWithSimilarStrings()
	{
		MyString2 someString2 = new MyString2("Java");
		String greaterThanString = "Ja";
		String equalToString = "Java";
		String lessThanString = "Java!";
		
		assertTrue(someString2.compare(greaterThanString) > 0);
		assertTrue(someString2.compare(equalToString) == 0);
		assertTrue(someString2.compare(lessThanString) < 0);
	}
	
	/**
	 * Test method for {@link main.MyString2#substring(int)} with a valid beginning index.
	 */
	@Test
	public void testSubstringWithValidBeginIndices()
	{
		if (myString.length() > 0)
		{
			Random random = new Random();
			int randomBeginIndex = random.nextInt(myString.length());
			char[] someSubstring = myString2.substring(randomBeginIndex).toChars();
			char[] expected = myString.substring(randomBeginIndex).toCharArray();
			
			assertArrayEquals(expected, someSubstring);
		}
	}
	
	/**
	 * Test method for {@link main.MyString2#substring(int)} with invalid beginning indices.
	 */
	@Test
	public void testSubstringWithInvalidBeginIndices()
	{
		assertArrayEquals(myString.toCharArray(), myString2.substring(0).toChars());
		assertArrayEquals(myString.toCharArray(), myString2.substring(myString.length() + 2).toChars());
		assertArrayEquals(myString.toCharArray(), myString2.substring(-5).toChars());
	}

	/**
	 * Test method for {@link main.MyString2#toUpperCase()}.
	 */
	@Test
	public void testToUpperCase()
	{
		char[] upperCaseString = myString2.toUpperCase().toChars();
		char[] expected = String.valueOf(myString).toUpperCase().toCharArray();
		
		assertArrayEquals(expected, upperCaseString);
	}

	/**
	 * Test method for {@link main.MyString2#toChars()}.
	 */
	@Test
	public void testToChars()
	{
		char[] string = myString2.toChars();
		char[] expected = myString.toCharArray();
		
		assertArrayEquals(expected, string);
	}

	/**
	 * Test method for {@link main.MyString2#valueOf(boolean)}.
	 */
	@Test
	public void testValueOf()
	{
		char[] trueString = MyString2.valueOf(true).toChars();
		assertArrayEquals("true".toCharArray(), trueString);
		
		char[] falseString = MyString2.valueOf(false).toChars();
		assertArrayEquals("false".toCharArray(), falseString);
	}
}