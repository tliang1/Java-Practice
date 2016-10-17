package main;

import java.util.Scanner;

public class EvenNumber 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("Is " + number + " a even number? " + (number % 2 == 0));
		
		input.close();
	}

}