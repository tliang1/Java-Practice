package main;

public class RandomUppercaseLetter
{

	public static void main(String[] args)
	{
		char randomUppercaseLetter = (char) ((int)(Math.random() * 26) + 65);
		
		System.out.println("Random uppercase letter: " + randomUppercaseLetter);
	}

}