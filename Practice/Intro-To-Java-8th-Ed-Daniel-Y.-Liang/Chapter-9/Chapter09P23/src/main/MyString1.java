package main;

import java.util.Arrays;

/**
 * @author Tony Liang
 *
 */
public class MyString1
{
	private int size;
	private char[] string;
	
	/**
	 * Creates a new MyString1 given the character array.
	 * 
	 * @param chars		array of characters to represent as a string
	 */
	public MyString1(char[] chars)
	{
		size = chars.length;
		string = Arrays.copyOf(chars, size);
	}
	
	/**
	 * Returns the character at the given index.
	 * <ul>
	 * 	<li>
	 * 		If the index is not between 0 and the length of the string exclusive, the null character is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param index		index of the character
	 * @return			the character at the given index
	 */
	public char charAt(int index)
	{
		if ((index >= 0) && (index < size))
		{
			return string[index];
		}
		else
		{
			return '\u0000';
		}
	}
	
	/**
	 * Returns the length of this string.
	 * 
	 * @return	the length of this string
	 */
	public int length()
	{
		return size;
	}
	
	/**
	 * Returns the string that is a substring of this string given the begin and end indices.
	 * <ul>
	 * 	<li>
	 * 		If the end index is not less than or equal to the length of the string and the begin index is not a positive integer less than
	 * 		the end index and less than the length of the string, then the substring will default to the entire string.
	 * 	</li>
	 * </ul>
	 * 
	 * @param begin		the beginning index, inclusive
	 * @param end		the ending index, exclusive
	 * @return			the string that is a substring of this string
	 */
	public MyString1 substring(int begin, int end)
	{
		if ((begin >= 0) && (begin < end) && (begin < size) && (end <= size))
		{
			if ((begin == 0) && (end == size))
			{
				return new MyString1(string);
			}
			else
			{
				return new MyString1(Arrays.copyOfRange(string, begin, end));
			}
		}
		else
		{
			return new MyString1(string);
		}
	}
	
	/**
	 * Returns this string with all of the characters lowercased.
	 * 
	 * @return	this string with all of the characters lowercased
	 */
	public MyString1 toLowerCase()
	{
		char[] lowerCaseCharacters = new char[size];
		
		for (int index = 0; index < size; index++)
		{
			lowerCaseCharacters[index] = Character.toLowerCase(string[index]);
		}
		
		return new MyString1(lowerCaseCharacters);
	}
	
	/**
	 * Returns if this string is equal to the given string.
	 * <ul>
	 * 	<li>
	 * 		If the length of both strings are not equal, it will default to false.
	 * 	</li>
	 * </ul>
	 * 
	 * @param s		the string
	 * @return		true if this string is equal to the given string. Otherwise, false.
	 */
	public boolean equals(MyString1 s)
	{
		if (size == s.length())
		{
			for (int index = 0; index < size; index++)
			{
				if (string[index] != s.charAt(index))
				{
					return false;
				}
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns the string representation of the given integer.
	 * 
	 * @param i		the integer
	 * @return		the string representation of the given integer
	 */
	public static MyString1 valueOf(int i)
	{
		if (Math.abs(i) > 9)
		{
			int absoluteInteger = Math.abs(i);
			int integerSize = (int) (Math.floor(Math.log10(absoluteInteger))) + 1;
			
			if (i < 0)
			{
				integerSize++;
			}
			
			char[] integerString = new char[integerSize];
			
			if (i < 0)
			{
				integerString[0] = '-';
			}
			
			for (int index = integerSize - 1; absoluteInteger != 0; index--)
			{
				integerString[index] = (char) ((absoluteInteger % 10) + '0');
				absoluteInteger /= 10;
			}
			
			return new MyString1(integerString);
		}
		else if (i < 0)
		{
			char[] integerString = {'-', (char) (-i + '0')};
			
			return new MyString1(integerString);
		}
		else
		{
			char[] integerString = {(char) (i + '0')};
			
			return new MyString1(integerString);
		}
	}
}