package main;

import java.util.Scanner;

public class ASCIICodeToCharacter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int asciiCode = input.nextInt();
		
		char character = (char)(asciiCode);
		
		System.out.println("The character for ASCII code " + asciiCode + " is " + character);
		
		input.close();
	}

}