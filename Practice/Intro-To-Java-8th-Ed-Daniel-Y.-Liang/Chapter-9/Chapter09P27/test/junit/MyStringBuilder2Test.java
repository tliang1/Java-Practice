package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import main.MyStringBuilder2;

/**
 * @author Tony Liang
 *
 */
public class MyStringBuilder2Test
{
	Random random = new Random();
	final MyStringBuilder2 emptyStringBuilder = new MyStringBuilder2();
	final char[] characters = {'J', 'a', 'v', 'a', 'S', 'c', 'r', 'i', 'p', 't'};
	final MyStringBuilder2 charactersArrayStringBuilder = new MyStringBuilder2(characters);
	final String string = "Python";
	final MyStringBuilder2 stringStringBuilder = new MyStringBuilder2(string);
	
	/**
	 * Test method for {@link main.MyStringBuilder2#insert(int, main.MyStringBuilder2)} with valid offsets.
	 */
	@Test
	public void testInsertWithValidOffsets()
	{
		int randomIndex = random.nextInt(characters.length + 1);
		assertEquals(new StringBuilder(String.valueOf(characters)).insert(randomIndex, string).toString().trim(), 
				charactersArrayStringBuilder.insert(randomIndex, stringStringBuilder).toString().trim());
		assertEquals(String.valueOf(characters), charactersArrayStringBuilder.insert(randomIndex, emptyStringBuilder).toString().trim());
	}
	
	/**
	 * Test method for {@link main.MyStringBuilder2#insert(int, main.MyStringBuilder2)} with invalid offsets.
	 */
	@Test
	public void testInsertWithInvalidOffsets()
	{
		assertEquals(charactersArrayStringBuilder.toString(), 
				charactersArrayStringBuilder.insert(charactersArrayStringBuilder.toString().length() + 2, stringStringBuilder).toString());
		assertEquals(charactersArrayStringBuilder.toString(), charactersArrayStringBuilder.insert(-4, emptyStringBuilder).toString());
	}

	/**
	 * Test method for {@link main.MyStringBuilder2#reverse()}.
	 */
	@Test
	public void testReverse()
	{
		assertEquals(emptyStringBuilder.toString(), emptyStringBuilder.reverse().toString());
		assertEquals(new StringBuilder(charactersArrayStringBuilder.toString()).reverse().toString(), 
						charactersArrayStringBuilder.reverse().toString());
		assertEquals(new StringBuilder(stringStringBuilder.toString()).reverse().toString(), stringStringBuilder.reverse().toString());
	}

	/**
	 * Test method for {@link main.MyStringBuilder2#substring(int)} with a valid beginning index.
	 */
	@Test
	public void testSubstringWithValidBeginIndices()
	{
		if (characters.length > 0)
		{
			int randomBeginIndex = random.nextInt(charactersArrayStringBuilder.toString().length());
			String someSubstring = charactersArrayStringBuilder.substring(randomBeginIndex).toString();
			String expected = charactersArrayStringBuilder.toString().substring(randomBeginIndex);
			
			assertTrue(someSubstring.startsWith(expected));
		}
		
		if (string.length() > 0)
		{
			int randomBeginIndex = random.nextInt(stringStringBuilder.toString().length());
			String someSubstring = stringStringBuilder.substring(randomBeginIndex).toString();
			String expected = stringStringBuilder.toString().substring(randomBeginIndex);
			
			assertTrue(someSubstring.startsWith(expected));
		}
	}
	
	/**
	 * Test method for {@link main.MyStringBuilder2#substring(int)} with invalid beginning indices.
	 */
	@Test
	public void testSubstringWithInvalidBeginIndices()
	{
		assertEquals(emptyStringBuilder.toString(), emptyStringBuilder.substring(0).toString());
		assertEquals(emptyStringBuilder.toString(), emptyStringBuilder.substring(1).toString());
		assertEquals(emptyStringBuilder.toString(), emptyStringBuilder.substring(-5).toString());
		
		assertEquals(charactersArrayStringBuilder.toString(), charactersArrayStringBuilder.substring(0).toString());
		assertEquals(charactersArrayStringBuilder.toString(), 
						charactersArrayStringBuilder.substring(charactersArrayStringBuilder.toString().length() + 2).toString());
		assertEquals(charactersArrayStringBuilder.toString(), charactersArrayStringBuilder.substring(-3).toString());
		
		assertEquals(stringStringBuilder.toString(), stringStringBuilder.substring(0).toString());
		assertEquals(stringStringBuilder.toString(), stringStringBuilder.substring(stringStringBuilder.toString().length() + 1).toString());
		assertEquals(stringStringBuilder.toString(), stringStringBuilder.substring(-1).toString());
	}

	/**
	 * Test method for {@link main.MyStringBuilder2#toUpperCase()}.
	 */
	@Test
	public void testToUpperCase()
	{
		assertEquals(emptyStringBuilder.toString(), emptyStringBuilder.toUpperCase().toString());
		assertEquals(charactersArrayStringBuilder.toString().toUpperCase(), charactersArrayStringBuilder.toUpperCase().toString());
		assertEquals(stringStringBuilder.toString().toUpperCase(), stringStringBuilder.toUpperCase().toString());
	}
}