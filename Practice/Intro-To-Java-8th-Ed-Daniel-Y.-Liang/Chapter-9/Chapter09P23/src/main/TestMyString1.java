package main;

import java.util.Random;

/**
 * @author Tony Liang
 *
 */
public class TestMyString1
{
	public static void main(String[] args)
	{
		char[] myString = {'J', 'a', 'v', 'a'};
		MyString1 myString1 = new MyString1(myString);
		
		System.out.println("The character at index 2 is " + myString1.charAt(2));
		System.out.println("The length of the string is " + myString1.length());
		
		MyString1 someSubstring = myString1.substring(1, myString1.length());
		
		System.out.print("The substring is ");
		
		for (int index = 0; index < someSubstring.length(); index++)
		{
			System.out.print(someSubstring.charAt(index));
		}
		
		System.out.println();
		
		MyString1 lowerCaseString = myString1.toLowerCase();
		
		System.out.print("The lowercase string is ");
		
		for (int index = 0; index < lowerCaseString.length(); index++)
		{
			System.out.print(lowerCaseString.charAt(index));
		}
		
		System.out.println();
		
		MyString1 myString2 = new MyString1(myString);
		
		System.out.println("Is myString1 equal to lowerCaseString? " + myString1.equals(lowerCaseString));
		System.out.println("Is myString1 equal to myString2? " + myString1.equals(myString2));
		
		Random random = new Random();
		MyString1 randomIntegerString = MyString1.valueOf(random.nextInt());
		
		System.out.print("The random integer is ");
		
		for (int index = 0; index < randomIntegerString.length(); index++)
		{
			System.out.print(randomIntegerString.charAt(index));
		}
		
		System.out.println();
	}
}