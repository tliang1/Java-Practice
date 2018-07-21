package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class NewStringSplitMethod
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String string = input.nextLine();
		
		System.out.print("Enter the delimiter or regular expression: ");
		String regex = input.nextLine();
		
		input.close();
		
		String[] substringsAndDelimiters = split(string, regex);
		
		for (String substring: substringsAndDelimiters)
		{
			System.out.println(substring);
		}
	}
	
	/**
	 * Returns the array of strings consisting of the substrings including the delimiter(s) of the given string split by the given 
	 * delimiter(s).
	 * 
	 * @param s			the string	
	 * @param regex		the regular expression
	 * @return			the array of strings consisting of the substrings including the delimiter(s) of the given string split by the given 
	 * 					delimiter(s)
	 */
	public static String[] split(String s, String regex)
	{
		return s.split("(?<=" + regex + ")|(?=" + regex + ")");
	}
}