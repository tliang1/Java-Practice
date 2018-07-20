package main;

import java.util.Random;

/**
 * @author Tony Liang
 *
 */
public class TestMyStringBuilder1
{
	public static void main(String[] args)
	{
		String myString = "Scala";
		MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1(myString);
		
		System.out.println("The string is " + myStringBuilder1.toString());
		System.out.println("The character at index 2 is " + myStringBuilder1.charAt(2));
		System.out.println("The length of the string is " + myStringBuilder1.length());
		
		MyStringBuilder1 lowerCaseStringBuilder = myStringBuilder1.toLowerCase();
		
		System.out.println("The lowercase string is " + lowerCaseStringBuilder.toString());
		
		MyStringBuilder1 someSubstringBuilder = myStringBuilder1.substring(1, 4);
		
		System.out.println("The substring is " + someSubstringBuilder.toString());
		
		MyStringBuilder1 someStringStringBuilder = new MyStringBuilder1(" Programming Language");
		MyStringBuilder1 appendedStringBuilder = myStringBuilder1.append(someStringStringBuilder);
		
		System.out.println("The appended string is " + appendedStringBuilder.toString());
		
		Random random = new Random();
		MyStringBuilder1 appendedIntegerStringBuilder = myStringBuilder1.append(random.nextInt());
		
		System.out.println("The appended string is " + appendedIntegerStringBuilder);
	}
}