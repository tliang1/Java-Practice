package main;

import java.util.Scanner;

public class CelsiusToFahrenheit 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double degreeInCelsius = input.nextDouble();
		
		double degreeInFahrenheit = (9.0 / 5) * degreeInCelsius + 32;
		
		System.out.println(((int) (degreeInCelsius)) + " Celsius is " + degreeInFahrenheit + " Fahrenheit");
		
		input.close();
	}

}