package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SortCharactersInAString
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.next();
		
		System.out.println("The sorted string is " + sort(s) + ".");
		
		input.close();
	}
	
	/**
	 * Returns a sorted string given the string.
	 * 
	 * @param s		a string
	 * @return		a sorted string given the string.
	 */
	public static String sort(String s)
	{
		char[] charactersOfTheString = s.toCharArray();
		Arrays.sort(charactersOfTheString);
		return String.valueOf(charactersOfTheString);
	}
}