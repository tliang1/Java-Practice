package main;

import java.util.Scanner;

public class HeatWaterEnergy 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double waterWeightInKilograms = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperatureInDegreeCelsius = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperatureInDegreeCelsius = input.nextDouble();
		
		double energyToHeatWaterInJoules = waterWeightInKilograms * 
				(finalTemperatureInDegreeCelsius - initialTemperatureInDegreeCelsius) * 4184;
		
		System.out.println("The energy needed is " + energyToHeatWaterInJoules);
		
		input.close();
	}

}