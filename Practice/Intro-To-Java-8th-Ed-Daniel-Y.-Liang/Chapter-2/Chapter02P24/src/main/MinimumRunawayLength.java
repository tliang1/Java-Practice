package main;

import java.util.Scanner;

public class MinimumRunawayLength 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v and a: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double minimumRunawayLength = Math.pow(v, 2)/ (2 * a);
		
		System.out.println("The minimum runaway length for this airplane is " + minimumRunawayLength);
		
		input.close();
	}

}