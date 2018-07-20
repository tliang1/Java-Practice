package main;

/**
 * @author Tony Liang
 *
 */
public class TestMyString2
{
	public static void main(String[] args)
	{
		String myString = "Java";
		MyString2 myString2 = new MyString2(myString);
		String someString = "Scala";
		
		System.out.println("Comparing the string " + myString + " with the string " + someString + " returns the value " + 
							myString2.compare(someString));
		
		System.out.println("The substring is " + String.valueOf(myString2.substring(2).toChars()));
		System.out.println("The uppercase string is " + String.valueOf(myString2.toUpperCase().toChars()));
		
		char[] myString2Characters = myString2.toChars();
		
		System.out.print("The character array makes the string: ");
		
		for (char character : myString2Characters)
		{
			System.out.print(character);
		}
		
		System.out.println();
		
		System.out.println(String.valueOf(MyString2.valueOf(true).toChars()));
		System.out.println(String.valueOf(MyString2.valueOf(false).toChars()));
	}
}