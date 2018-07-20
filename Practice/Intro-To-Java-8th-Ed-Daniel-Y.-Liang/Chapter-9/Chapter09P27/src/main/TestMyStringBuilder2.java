package main;

import java.util.Random;

/**
 * @author Tony Liang
 *
 */
public class TestMyStringBuilder2
{
	public static void main(String[] args)
	{
		MyStringBuilder2 emptyStringBuilder = new MyStringBuilder2();
		char[] characters = {'O', 'b', 'j', 'e', 'c', 't', 'i', 'v', 'e', '-', 'C'};
		MyStringBuilder2 charactersArrayStringBuilder = new MyStringBuilder2(characters);
		String string = "Java Programming Language";
		MyStringBuilder2 stringStringBuilder = new MyStringBuilder2(string);
		
		Random random = new Random();
		int randomOffset = random.nextInt(charactersArrayStringBuilder.toString().length() + 1);
		
		System.out.println("After inserting the string \"" + stringStringBuilder + "\" at offset " + randomOffset + " of \"" + 
								charactersArrayStringBuilder + "\", the new string is \"" + 
									charactersArrayStringBuilder.insert(randomOffset, stringStringBuilder).toString() + "\"");
		System.out.println("After inserting the string \"" + emptyStringBuilder + "\" at offset " + randomOffset + " of \"" + 
								charactersArrayStringBuilder + "\", the new string is \"" + 
									charactersArrayStringBuilder.insert(randomOffset, emptyStringBuilder) .toString()+ "\"");
		System.out.println("The reverse of \"" + stringStringBuilder.toString() + "\" is " + "\"" + stringStringBuilder.reverse().toString() + 
								"\"");
		System.out.println("The substring is " + charactersArrayStringBuilder.substring(randomOffset).toString());
		System.out.println("The string with all characters uppercased is " + charactersArrayStringBuilder.toUpperCase().toString());
	}
}