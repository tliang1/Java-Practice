package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.RandomCharacter;

/**
 * @author Tony Liang
 *
 */
public class RandomCharacterTest
{
	@Test
	public void testGetRandomCharacterCharChar()
	{
		Collection<Character[]> characterRanges = Arrays.asList(new Character[][] { { 'c', 'r' }, { '!', '/' }, 
			{ ':', '~' }, { 'a', 'z' }, { 'A', 'Z' }, { '0', '9' }, { '\u0000', '\uFFFF' } });
		
		for (Character[] characterRange : characterRanges)
		{
			char randomCharacter = RandomCharacter.getRandomCharacter(characterRange[0], characterRange[1]);
			assertTrue((randomCharacter >= characterRange[0]) && (randomCharacter <= characterRange[1]));
		}
	}
	
	@Test
	public void testGetRandomLowerCaseLetter()
	{
		char randomCharacter = RandomCharacter.getRandomLowerCaseLetter();
		assertTrue((randomCharacter >= 'a') && (randomCharacter <= 'z'));
	}
	
	@Test
	public void testGetRandomUpperCaseLetter()
	{
		char randomCharacter = RandomCharacter.getRandomUpperCaseLetter();
		assertTrue((randomCharacter >= 'A') && (randomCharacter <= 'Z'));
	}
	
	@Test
	public void testGetRandomDigitCharacter()
	{
		char randomCharacter = RandomCharacter.getRandomDigitCharacter();
		assertTrue((randomCharacter >= '0') && (randomCharacter <= '9'));
	}
	
	@Test
	public void testGetRandomCharacter()
	{
		char randomCharacter = RandomCharacter.getRandomCharacter();
		assertTrue((randomCharacter >= '\u0000') && (randomCharacter <= '\uFFFF'));
	}

}