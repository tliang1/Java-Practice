package main;

import java.util.Arrays;

/**
 * @author Tony Liang
 *
 */
public class MyStringBuilder2
{
	private int length, capacity = 16;
	private char[] string;
	
	/**
	 * Creates a new default MyStringBuilder2.
	 */
	public MyStringBuilder2()
	{
		string = new char[capacity];
	}
	
	/**
	 * Creates a new MyStringBuilder2 given the array of characters.
	 * 
	 * @param chars		the array of characters
	 */
	public MyStringBuilder2(char[] chars)
	{
		string = new char[capacity];
		
		for (int index = chars.length - 1; index >= 0; index--)
		{
			if (chars[index] != '\u0000')
			{
				length = index + 1;
				break;
			}
		}
		
		while (capacity < length)
		{
			capacity = 2 * (capacity + 1);
		}
		
		string = Arrays.copyOf(string, capacity);
		
		System.arraycopy(Arrays.copyOfRange(chars, 0, length), 0, string, 0, length);
	}
	
	/**
	 * Creates a new MyStringBuilder2 given the string.
	 * 
	 * @param s		the string
	 */
	public MyStringBuilder2(String s)
	{
		string = new char[capacity];
		
		for (int index = s.length() - 1; index >= 0; index--)
		{
			if (s.charAt(index) != '\u0000')
			{
				length = index + 1;
				break;
			}
		}
		
		while (capacity < s.length())
		{
			capacity = 2 * (capacity + 1);
		}
		
		string = Arrays.copyOf(string, capacity);
		
		System.arraycopy(s.toCharArray(), 0, string, 0, s.length());
	}
	
	/**
	 * Returns the string builder with the string that is this string with the given string builder's string inserted into the given offset 
	 * of this string.
	 * <ul>
	 * 	<li>
	 * 		If the offset is not between 0 and this string builder's string's length inclusive, the string will remain the same.
	 * 	</li>
	 * </ul>
	 * 
	 * @param offset	the offset
	 * @param s			the string builder
	 * @return			the string builder with the string that is this string with the given string builder's string inserted into the 
	 * 					given offset of this string
	 */
	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s)
	{
		char[] newString = string;
		
		if ((offset >= 0) && (offset <= string.length))
		{
			String sTrimmed = s.toString().trim();
			int totalLength = offset + sTrimmed.length() + (string.length - offset);
			char[] originalOffsetCharacters = Arrays.copyOfRange(string, offset, string.length);
			
			while (capacity < totalLength)
			{
				capacity = 2 * (capacity + 1);
			}
			
			newString = Arrays.copyOf(string, capacity);
			
			int index = offset;
			
			while (index < (offset + sTrimmed.length()))
			{
				newString[index] = sTrimmed.charAt(index - offset);
				index++;
			}
			
			int afterOffsetIndex = index;
			
			while ((index - afterOffsetIndex) < originalOffsetCharacters.length)
			{
				newString[index] = originalOffsetCharacters[index - afterOffsetIndex];
				index++;
			}
		}
		
		return new MyStringBuilder2(newString);
	}
	
	/**
	 * Returns the string builder with the string that is a reverse of this string builder's string.
	 * 
	 * @return	the string builder with the string that is a reverse of this string builder's string
	 */
	public MyStringBuilder2 reverse()
	{
		char[] reverseString = new char[string.length];
		
		for (int index = 0, reverseIndex = string.length - 1; (index < string.length) && (reverseIndex >= 0); index++, reverseIndex--)
		{
			reverseString[reverseIndex] = string[index];
		}
		
		return new MyStringBuilder2(reverseString);
	}
	
	/**
	 * Returns the string builder with the string that is a substring of this string builder's string given the begin index.
	 * <ul>
	 * 	<li>
	 * 		If the begin index is not between 0 and the length of the string exclusive, the substring will default to the entire string.
	 * 	</li>
	 * </ul>
	 * 
	 * @param begin		the beginning index, inclusive
	 * @return			the string builder with string that is a substring of this string builder's string
	 */
	public MyStringBuilder2 substring(int begin)
	{
		if ((begin > 0) && (begin < string.length))
		{
			return new MyStringBuilder2(Arrays.copyOfRange(string, begin, string.length));
		}
		else
		{
			return new MyStringBuilder2(string);
		}
	}
	
	/**
	 * Returns this string builder with all of the characters uppercased.
	 * 
	 * @return	this string builder with all of the characters uppercased
	 */
	public MyStringBuilder2 toUpperCase()
	{
		char[] upperCaseString = new char[string.length];
		
		for (int index = 0; index < string.length; index++)
		{
			upperCaseString[index] = Character.toUpperCase(string[index]);
		}
		
		return new MyStringBuilder2(upperCaseString);
	}
	
	public String toString()
	{
		return String.valueOf(string);
	}
}