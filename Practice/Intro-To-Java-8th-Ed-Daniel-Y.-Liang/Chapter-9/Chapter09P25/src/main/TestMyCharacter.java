package main;

/**
 * @author Tony Liang
 *
 */
public class TestMyCharacter
{
	public static void main(String[] args)
	{
		char value = 'M';
		MyCharacter myCharacter = new MyCharacter(value);
		
		System.out.println("The character value is " + myCharacter.charValue());
		
		Character differentCharacter = Character.valueOf('7');
		
		System.out.println("Comparing the character " + myCharacter.charValue() + " with the string " + differentCharacter.charValue() + 
				" returns the value " + myCharacter.compareTo(differentCharacter));
		
		Character equalCharacter = Character.valueOf(value);
		
		System.out.println("Is myCharacter equal to differentCharacter? " + myCharacter.equals(differentCharacter));
		System.out.println("Is myCharacter equal to equalCharacter? " + myCharacter.equals(equalCharacter));
		
		System.out.println("Is the character " + myCharacter.charValue() + " a digit? " + MyCharacter.isDigit(value));
		System.out.println("Is the character " + myCharacter.charValue() + " a letter? " + MyCharacter.isLetter(value));
		System.out.println("Is the character " + myCharacter.charValue() + " a letter or a digit? " + MyCharacter.isLetterOrDigit(value));
		System.out.println("Is the character " + myCharacter.charValue() + " lowercased? " + MyCharacter.isLowerCase(value));
		System.out.println("Is the character " + myCharacter.charValue() + " uppercased? " + MyCharacter.isUpperCase(value));
		System.out.println("The lowercase character of " + myCharacter.charValue() + " is " + MyCharacter.toLowerCase(value));
		System.out.println("The uppercase character of " + myCharacter.charValue() + " is " + MyCharacter.toUpperCase(value));
	}
}