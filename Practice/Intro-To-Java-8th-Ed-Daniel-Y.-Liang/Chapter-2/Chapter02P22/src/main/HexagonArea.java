package main;

import java.util.Scanner;

public class HexagonArea 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double areaOfHexagon = (3.0 / 2) * Math.pow(3, 0.5) * Math.pow(side, 2);
		
		System.out.println("The area of the hexagon is " + areaOfHexagon);
		
		input.close();
	}

}