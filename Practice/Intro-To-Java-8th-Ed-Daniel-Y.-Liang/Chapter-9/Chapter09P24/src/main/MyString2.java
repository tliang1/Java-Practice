package main;

import java.util.Arrays;

/**
 * @author Tony Liang
 *
 */
public class MyString2
{
	private String string;
	
	/**
	 * Creates a new MyString2 given the string.
	 * 
	 * @param s		the string
	 */
	public MyString2(String s)
	{
		string = s;
	}
	
	/**
	 * Returns a comparison integer after comparing this string with the given string lexicographically.
	 * <ul>
	 * 	<li>
	 * 		The comparison integer is the earliest difference of this string's character and the given string's character at the same index.
	 * 	</li>
	 * 	<li>
	 * 		If this string is not the same length as the given string and one of the strings is a prefix of the other string, then the 
	 * 		comparison integer will default to the difference of the lengths of the strings. 
	 * 	</li>
	 * </ul>
	 * 
	 * @param s		the string
	 * @return		0 if this string is equal to the given string; a negative integer if this string is lexicographically less than the given 
	 * 				string; and a nonzero positive integer if this string is lexicographically greater than the given string
	 */
	public int compare(String s)
	{
		int smallestStringSize = (string.length() < s.length()) ? string.length() : s.length();
		
		for (int index = 0; index < smallestStringSize; index++)
		{
			if (string.charAt(index) != s.charAt(index))
			{
				return string.charAt(index) - s.charAt(index);
			}
		}
		
		if (string.length() != s.length())
		{
			return string.length() - s.length();
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Returns the string that is a substring of this string given the begin index.
	 * <ul>
	 * 	<li>
	 * 		If the begin index is not between 0 and the length of the string exclusive, the substring will default to the entire string.
	 * 	</li>
	 * </ul>
	 * 
	 * @param begin		the beginning index, inclusive
	 * @return			the string that is a substring of this string
	 */
	public MyString2 substring(int begin)
	{
		if ((begin > 0) && (begin < string.length()))
		{
			return new MyString2(String.valueOf(Arrays.copyOfRange(toChars(), begin, string.length())));
		}
		else
		{
			return new MyString2(string);
		}
	}
	
	/**
	 * Returns this string with all of the characters uppercased.
	 * 
	 * @return	this string with all of the characters uppercased
	 */
	public MyString2 toUpperCase()
	{
		char[] upperCaseCharacters = new char[string.length()];
		
		for (int index = 0; index < upperCaseCharacters.length; index++)
		{
			upperCaseCharacters[index] = Character.toUpperCase(string.charAt(index));
		}
		
		return new MyString2(String.valueOf(upperCaseCharacters));
	}
	
	/**
	 * Returns the array of characters that represents the string.
	 * 
	 * @return	the array of characters that represents the string
	 */
	public char[] toChars()
	{
		char[] stringCharacters = new char[string.length()];
		
		for (int index = 0; index < stringCharacters.length; index++)
		{
			stringCharacters[index] = string.charAt(index);
		}
		
		return stringCharacters;
	}
	
	/**
	 * Returns the string representation of the given boolean value.
	 * 
	 * @param b		the boolean value
	 * @return		the string representation of the given boolean value
	 */
	public static MyString2 valueOf(boolean b)
	{
		return b ? new MyString2("true") : new MyString2("false");
	}
}