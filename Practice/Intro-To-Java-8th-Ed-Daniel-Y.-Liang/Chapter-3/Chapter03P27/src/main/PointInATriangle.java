package main;

import java.util.Scanner;

public class PointInATriangle
{

	public static void main(String[] args)
	{
		final double X_MIN = 0.0;
		final double Y_MIN = 0.0;
		final double X_MAX = 200.0;
		final double Y_MAX = 100.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		System.out.print("The point is ");
		
		/* Check hypotenuse by finding the slope and getting the equation of a line. If y point is greater than the 
		 * equation, it is not in the right triangle.
		 */
		if ((x < X_MIN) || (x > X_MAX) || (y < Y_MIN) || (y > Y_MAX) || (y > ((-x / 2.0) + 100)))
		{
			System.out.println("not in the triangle");
		}
		else
		{
			System.out.println("in the triangle");
		}
		
		input.close();
	}

}