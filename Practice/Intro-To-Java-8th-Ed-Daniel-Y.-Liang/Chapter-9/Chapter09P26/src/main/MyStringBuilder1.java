package main;

/**
 * @author Tony Liang
 *
 */
public class MyStringBuilder1
{
	private String string;
	
	/**
	 * Creates a new MyStringBuilder1 given the string.
	 * 
	 * @param s		the string
	 */
	public MyStringBuilder1(String s)
	{
		string = s;
	}
	
	/**
	 * Returns the string builder with the string being this string appended with the given string builder's string after it.
	 * 
	 * @param s		the string builder
	 * @return		the string builder with the string being this string appended with the given string builder's string after it
	 */
	public MyStringBuilder1 append(MyStringBuilder1 s)
	{
		return new MyStringBuilder1(string + s.toString());
	}
	
	/**
	 * Returns the string builder with the string being this string appended with the given integer after it.
	 * 
	 * @param i		the integer
	 * @return		the string builder with the string being this string appended with the given integer after it
	 */
	public MyStringBuilder1 append(int i)
	{
		return new MyStringBuilder1(string + i);
	}
	
	/**
	 * Returns the length of this string.
	 * 
	 * @return	the length of this string
	 */
	public int length()
	{
		return string.length();
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
		if ((index >= 0) && (index < string.length()))
		{
			return string.charAt(index);
		}
		else
		{
			return '\u0000';
		}
	}
	
	/**
	 * Returns this string builder with all of the characters lowercased.
	 * 
	 * @return	this string builder with all of the characters lowercased
	 */
	public MyStringBuilder1 toLowerCase()
	{
		return new MyStringBuilder1(string.toLowerCase());
	}
	
	/**
	 * Returns the string builder with the string that is a substring of this string builder's string given the begin and end indices.
	 * <ul>
	 * 	<li>
	 * 		If the end index is not less than or equal to the length of the string and the begin index is not a positive integer less than
	 * 		the end index and less than the length of the string, then the substring will default to the entire string.
	 * 	</li>
	 * </ul>
	 * 
	 * @param begin		the beginning index, inclusive
	 * @param end		the ending index, exclusive
	 * @return			the string builder with the string that is a substring of this string builder's string
	 */
	public MyStringBuilder1 substring(int begin, int end)
	{
		if ((begin >= 0) && (begin < end) && (begin < string.length()) && (end <= string.length()))
		{
			if ((begin == 0) && (end == string.length()))
			{
				return new MyStringBuilder1(string);
			}
			else
			{
				return new MyStringBuilder1(string.substring(begin, end));
			}
		}
		else
		{
			return new MyStringBuilder1(string);
		}
	}
	
	public String toString()
	{
		return string;
	}
}