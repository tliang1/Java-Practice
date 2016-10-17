package main;

import java.util.Scanner;

public class CirclesOverlap
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-. y-coordinates, and radius: ");
		double circle1CenterX = input.nextDouble();
		double circle1CenterY = input.nextDouble();
		double circle1Radius = input.nextDouble();
		
		System.out.print("Enter circle2's center x-. y-coordinates, and radius: ");
		double circle2CenterX = input.nextDouble();
		double circle2CenterY = input.nextDouble();
		double circle2Radius = input.nextDouble();
		
		double distance = Math.pow(Math.pow(circle2CenterX - circle1CenterX, 2) + 
				Math.pow(circle2CenterY - circle1CenterY, 2), 0.5);
		double differenceInRadius = Math.pow(Math.pow(circle1Radius - circle2Radius, 2), 0.5);
		
		if (distance <= (circle1Radius + circle2Radius))
		{
			if (distance <= differenceInRadius)
			{
				System.out.println("circle2 is inside circle1");
			}
			else
			{
				System.out.println("circle2 overlaps circle1");
			}
		}
		else
		{
			System.out.println("circle2 does not overlap circle1");
		}
		
		input.close();
	}

}