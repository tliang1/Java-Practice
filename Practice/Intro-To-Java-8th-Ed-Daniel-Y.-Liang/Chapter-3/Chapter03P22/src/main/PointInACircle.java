package main;

import java.util.Scanner;

public class PointInACircle
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		System.out.print("Point (" + x + ", " + y + ") is ");
		
		double distance = Math.pow(((x * x) + (y * y)), 0.5);
		
		if (distance <= 10.0)
		{
			System.out.println("in the circle");
		}
		else
		{
			System.out.println("not in the circle");
		}
		
		input.close();
	}

}