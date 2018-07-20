package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import main.MyCharacter;

/**
 * @author Tony Liang
 *
 */
public class MyCharacterTest
{
	final String[] characters = {"abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "`~!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?"};
	Random random = new Random();
	final char randomUppercaseCharacter = characters[1].charAt(random.nextInt(characters[1].length()));
	final MyCharacter myCharacter = new MyCharacter(randomUppercaseCharacter);
	final char randomLowercaseCharacter = characters[0].charAt(random.nextInt(characters[0].length()));
	final char randomNonAlphanumericCharacter = characters[2].charAt(random.nextInt(characters[2].length()));
	final char randomDigitCharacter = (char) (random.nextInt(10) + '0');
	
	/**
	 * Test method for {@link main.MyCharacter#compareTo(java.lang.Character)}.
	 */
	@Test
	public void testCompareTo()
	{
		assertTrue(myCharacter.compareTo(randomDigitCharacter) > 0);
		assertTrue(myCharacter.compareTo(randomUppercaseCharacter) == 0);
		assertTrue(myCharacter.compareTo(randomLowercaseCharacter) < 0);
	}

	/**
	 * Test method for {@link main.MyCharacter#equals(java.lang.Character)}.
	 */
	@Test
	public void testEqualsCharacter()
	{
		assertTrue(myCharacter.equals(randomUppercaseCharacter));
		assertFalse(myCharacter.equals(randomDigitCharacter));
		assertFalse(myCharacter.equals(randomLowercaseCharacter));
		assertFalse(myCharacter.equals(randomNonAlphanumericCharacter));
	}

	/**
	 * Test method for {@link main.MyCharacter#isDigit(char)}.
	 */
	@Test
	public void testIsDigit()
	{
		assertTrue(MyCharacter.isDigit(randomDigitCharacter));
		assertFalse(MyCharacter.isDigit(randomLowercaseCharacter));
		assertFalse(MyCharacter.isDigit(randomUppercaseCharacter));
		assertFalse(MyCharacter.isDigit(randomNonAlphanumericCharacter));
	}

	/**
	 * Test method for {@link main.MyCharacter#isLetter(char)}.
	 */
	@Test
	public void testIsLetter()
	{
		assertTrue(MyCharacter.isLetter(randomLowercaseCharacter));
		assertTrue(MyCharacter.isLetter(randomUppercaseCharacter));
		assertFalse(MyCharacter.isLetter(randomDigitCharacter));
		assertFalse(MyCharacter.isLetter(randomNonAlphanumericCharacter));
	}

	/**
	 * Test method for {@link main.MyCharacter#isLetterOrDigit(char)}.
	 */
	@Test
	public void testIsLetterOrDigit()
	{
		assertTrue(MyCharacter.isLetterOrDigit(randomDigitCharacter));
		assertTrue(MyCharacter.isLetterOrDigit(randomLowercaseCharacter));
		assertTrue(MyCharacter.isLetterOrDigit(randomUppercaseCharacter));
		assertFalse(MyCharacter.isLetterOrDigit(randomNonAlphanumericCharacter));
	}

	/**
	 * Test method for {@link main.MyCharacter#isLowerCase(char)}.
	 */
	@Test
	public void testIsLowerCase()
	{
		assertTrue(MyCharacter.isLowerCase(randomLowercaseCharacter));
		assertFalse(MyCharacter.isLowerCase(randomUppercaseCharacter));
		assertFalse(MyCharacter.isLowerCase(randomDigitCharacter));
		assertFalse(MyCharacter.isLowerCase(randomNonAlphanumericCharacter));
	}

	/**
	 * Test method for {@link main.MyCharacter#isUpperCase(char)}.
	 */
	@Test
	public void testIsUpperCase()
	{
		assertTrue(MyCharacter.isUpperCase(randomUppercaseCharacter));
		assertFalse(MyCharacter.isUpperCase(randomLowercaseCharacter));
		assertFalse(MyCharacter.isUpperCase(randomDigitCharacter));
		assertFalse(MyCharacter.isUpperCase(randomNonAlphanumericCharacter));
	}

	/**
	 * Test method for {@link main.MyCharacter#toLowerCase(char)}.
	 */
	@Test
	public void testToLowerCase()
	{
		int upperCaseIndex = random.nextInt(characters[1].length());
		
		assertEquals(characters[0].charAt(upperCaseIndex), MyCharacter.toLowerCase(characters[1].charAt(upperCaseIndex)));
		assertEquals(characters[0].charAt(upperCaseIndex), MyCharacter.toLowerCase(characters[0].charAt(upperCaseIndex)));
		
		assertEquals(randomDigitCharacter, MyCharacter.toLowerCase(randomDigitCharacter));;
		assertEquals(randomNonAlphanumericCharacter, MyCharacter.toLowerCase(randomNonAlphanumericCharacter));
	}

	/**
	 * Test method for {@link main.MyCharacter#toUpperCase(char)}.
	 */
	@Test
	public void testToUpperCase()
	{
		int lowerCaseIndex = random.nextInt(characters[0].length());
		
		assertEquals(characters[1].charAt(lowerCaseIndex), MyCharacter.toUpperCase(characters[0].charAt(lowerCaseIndex)));
		assertEquals(characters[1].charAt(lowerCaseIndex), MyCharacter.toUpperCase(characters[1].charAt(lowerCaseIndex)));
		
		assertEquals(randomDigitCharacter, MyCharacter.toUpperCase(randomDigitCharacter));;
		assertEquals(randomNonAlphanumericCharacter, MyCharacter.toUpperCase(randomNonAlphanumericCharacter));
	}
}