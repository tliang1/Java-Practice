package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TestTwoLineSegmentsIntersection
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the endpoints of the first line segment: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("Enter the endpoints of the second line segment: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		LinearEquation linearEquation = new LinearEquation(x1, y1, x2, y2, x3, y3, x4, y4);
		
		if (!linearEquation.isSolvable())
		{
			System.out.println("There is no intersecting point.");
		}
		else
		{
			System.out.println("The intersecting point is: (" + linearEquation.getX() + ", " + linearEquation.getY() + ")");
		}
		
		input.close();
	}
}