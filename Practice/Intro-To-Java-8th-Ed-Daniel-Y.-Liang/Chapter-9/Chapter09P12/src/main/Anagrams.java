package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class Anagrams
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first word: ");
		String firstWord = input.next();
		
		System.out.print("Enter the second word: ");
		String secondWord = input.next();
		
		if (isAnagram(firstWord, secondWord))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		
		input.close();
	}
	
	/**
	 * Returns if the two given strings are anagrams.
	 * <ul>
	 * 	<li>
	 * 		If both strings are not the same length, they will default to not being anagrams.
	 * 	</li>
	 * </ul>
	 * 
	 * @param s1	the first string
	 * @param s2	the second string
	 * @return		true if the two given strings are anagrams. Otherwise, false.
	 */
	public static boolean isAnagram(String s1, String s2)
	{
		if (s1.length() != s2.length())
		{
			return false;
		}
		
		char[] s1Characters = s1.toCharArray();
		Arrays.sort(s1Characters);
		
		char[] s2Characters = s2.toCharArray();
		Arrays.sort(s2Characters);
		
		return Arrays.equals(s1Characters, s2Characters);
	}
}