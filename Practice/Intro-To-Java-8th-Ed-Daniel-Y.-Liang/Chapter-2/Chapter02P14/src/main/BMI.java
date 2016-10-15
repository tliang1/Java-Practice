package main;

import java.util.Scanner;

public class BMI 
{

	public static void main(String[] args) 
	{
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		double bMI = (weight * KILOGRAMS_PER_POUND) / Math.pow((height * METERS_PER_INCH), 2);
		
		System.out.println("BMI is " + bMI);
		
		input.close();
	}

}