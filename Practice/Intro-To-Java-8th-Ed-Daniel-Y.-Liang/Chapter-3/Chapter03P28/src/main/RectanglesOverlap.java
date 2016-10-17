package main;

import java.util.Scanner;

public class RectanglesOverlap
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-. y-coordinates, width, and height: ");
		double r1CenterX = input.nextDouble();
		double r1CenterY = input.nextDouble();
		double r1Width = input.nextDouble();
		double r1Height = input.nextDouble();
		
		System.out.print("Enter r2's center x-. y-coordinates, width, and height: ");
		double r2CenterX = input.nextDouble();
		double r2CenterY = input.nextDouble();
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();
		
		double distanceX = Math.pow(Math.pow(r2CenterX - r1CenterX, 2), 0.5);
		double distanceY = Math.pow(Math.pow(r2CenterY - r1CenterY, 2), 0.5);
		double sumOfRectanglesHalfWidths = (r1Width / 2) + (r2Width / 2);
		double sumOfRectanglesHalfHeights = (r1Height / 2) + (r2Height / 2);
		
		if ((distanceX < sumOfRectanglesHalfWidths) && (distanceY < sumOfRectanglesHalfHeights))
		{
			if ((r2Width <= r1Width) && (r2Height <= r1Height))
			{
				System.out.println("r2 is inside r1");
			}
			else
			{
				System.out.println("r2 overlaps r1");
			}
		}
		else
		{
			System.out.println("r2 does not overlap r1");
		}
		
		input.close();
	}

}