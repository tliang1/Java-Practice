package main;

import java.util.Scanner;

public class FeetToMeters 
{

	public static void main(String[] args) 
	{
		final double METERS_PER_FOOT = 0.305;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		double meters = feet * METERS_PER_FOOT;
		
		System.out.println(feet + " feet is " + meters + " meters");
		
		input.close();
	}

}