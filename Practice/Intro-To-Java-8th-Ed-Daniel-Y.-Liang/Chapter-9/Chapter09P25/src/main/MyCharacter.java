package main;

/**
 * @author Tony Liang
 *
 */
public class MyCharacter
{
	private char character;
	
	/**
	 * Creates a new MyCharacter given the character.
	 * 
	 * @param value		the character
	 */
	public MyCharacter(char value)
	{
		character = value;
	}
	
	/**
	 * Returns the character.
	 * 
	 * @return	the character
	 */
	public char charValue()
	{
		return character;
	}
	
	/**
	 * Returns a comparison integer after comparing this character with the given character numerically.
	 * 
	 * @param anotherCharacter	the character
	 * @return					0 if this character is equal to the given Character; a negative integer if this character is numerically less 
	 * 							than the given character; and a nonzero positive integer if this character is numerically greater than the 
	 * 							given character 
	 */
	public int compareTo(Character anotherCharacter)
	{
		return character - anotherCharacter;
	}
	
	/**
	 * Returns if this character is equal to the given character.
	 * 
	 * @param anotherCharacter	the character
	 * @return					true if this character is equal to the given character. Otherwise, false.
	 */
	public boolean equals(Character anotherCharacter)
	{
		return character == anotherCharacter.charValue();
	}
	
	/**
	 * Returns if the given character is a digit.
	 * 
	 * @param ch	the character
	 * @return		true if the given character is a digit. Otherwise, false.
	 */
	public static boolean isDigit(char ch)
	{
		return ((ch >= '0') && (ch <= '9'));
	}
	
	/**
	 * Returns if the given character is a letter.
	 * 
	 * @param ch	the character
	 * @return		true if the given character is a letter. Otherwise, false.
	 */
	public static boolean isLetter(char ch)
	{
		return (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')));
	}
	
	/**
	 * Returns if the given character is a letter or a digit.
	 * 
	 * @param ch	the character
	 * @return		true if the given character is a letter or a digit. Otherwise, false.
	 */
	public static boolean isLetterOrDigit(char ch)
	{
		return isLetter(ch) || isDigit(ch);
	}
	
	/**
	 * Returns if the given character is a lowercase letter.
	 * 
	 * @param ch	the character
	 * @return		true if the given character is a lowercase letter. Otherwise, false.
	 */
	public static boolean isLowerCase(char ch)
	{
		return ((ch >= 'a') && (ch <= 'z'));
	}
	
	/**
	 * Returns if the given character is a uppercase letter.
	 * 
	 * @param ch	the character
	 * @return		true if the given character is a uppercase letter. Otherwise, false.
	 */
	public static boolean isUpperCase(char ch)
	{
		return ((ch >= 'A') && (ch <= 'Z'));
	}
	
	/**
	 * Returns the lowercase of the given character.
	 * <ul>
	 * 	<li>
	 * 		If the given character is not an uppercase letter, the given character is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param ch	the character
	 * @return		the lowercase of the given character
	 */
	public static char toLowerCase(char ch)
	{
		return isUpperCase(ch) ? (char) (ch + ('a' - 'A')) : ch;
	}
	
	/**
	 * Returns the uppercase of the given character.
	 * <ul>
	 * 	<li>
	 * 		If the given character is not an lowercase letter, the given character is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param ch	the character
	 * @return		the uppercase of the given character
	 */
	public static char toUpperCase(char ch)
	{
		return isLowerCase(ch) ? (char) (ch - ('a' - 'A')) : ch;
	}
}