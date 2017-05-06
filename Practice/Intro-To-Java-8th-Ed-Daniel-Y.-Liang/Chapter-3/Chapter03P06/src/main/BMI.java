package main;

import java.util.Scanner;

public class BMI
{

	public static void main(String[] args)
	{
		final double INCHES_PER_FOOT = 12.0;
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in feet and inches: ");
		double feet = input.nextDouble();
		double inches = input.nextDouble();
		
		double height = (feet * INCHES_PER_FOOT) + inches;
		
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.printf("Your BMI is %5.2f\n", bmi);
		
		if (bmi < 16)
		{
			System.out.println("You are seriously underweight");
		}
		else if (bmi < 18)
		{
			System.out.println("You are underweight");
		}
		else if (bmi < 24)
		{
			System.out.println("You are normal weight");
		}
		else if (bmi < 29)
		{
			System.out.println("You are overweight");
		}
		else if (bmi < 35)
		{
			System.out.println("You are seriously overweight");
		}
		else
		{
			System.out.println("You are gravely overweight");
		}
		
		input.close();
	}

}