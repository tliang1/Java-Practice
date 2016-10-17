package main;

import java.util.Scanner;

public class PointInARectangle
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		System.out.print("Point (" + x + ", " + y + ") is ");
		
		double distanceX = Math.pow((x * x), 0.5);
		double distanceY = Math.pow((y * y), 0.5);
		
		if ((distanceX <= (10.0 / 2)) && (distanceY <= (5.0 / 2)))
		{
			System.out.println("in the rectangle");
		}
		else
		{
			System.out.println("not in the rectangle");
		}
		
		input.close();
	}

}