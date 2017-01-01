package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class AllClosestPairOfPointsWithSameMinDistance
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		
		while (numberOfPoints < 2)
		{
			System.out.print("Enter the number of points (Limit: 2 points minimum.): ");
			numberOfPoints = input.nextInt();
		}
		
		double[][] points = new double[numberOfPoints][2];
		
		System.out.print("Enter " + numberOfPoints + " points: ");
		
		for (int x = 0; x < points.length; x++)
		{
			points[x][0] = input.nextDouble();
			points[x][1] = input.nextDouble();
		}
		
		double shortestDistance = distance(points[0][0], points[0][1], 
				points[1][0], points[1][1]);
		
		System.out.println("All closest pair of points with the same minimum distance are ");
		
		for (int firstPoint = 0; firstPoint < points.length; firstPoint++)
		{
			for (int secondPoint = firstPoint + 1; secondPoint < points.length; secondPoint++)
			{
				double distance = distance(points[firstPoint][0], points[firstPoint][1], points[secondPoint][0], 
						points[secondPoint][1]);
				
				if (shortestDistance > distance)
				{
					shortestDistance = distance;
				}
			}
		}
		
		for (int firstPoint = 0; firstPoint < points.length; firstPoint++)
		{
			for (int secondPoint = firstPoint + 1; secondPoint < points.length; secondPoint++)
			{
				double distance = distance(points[firstPoint][0], points[firstPoint][1], points[secondPoint][0], 
						points[secondPoint][1]);
				
				if (shortestDistance == distance)
				{
					System.out.println("(" + points[firstPoint][0] + ", " + points[firstPoint][1] + ") and (" +
							points[secondPoint][0] + ", " + points[secondPoint][1] + ")");
				}
			}
		}
		
		input.close();
	}
	
	/**
	 * Returns the distance between the two two-dimensional space points given the x and y coordinates of the
	 * points.
	 * 
	 * @param x1	the first point's x
	 * @param y1	the first point's y
	 * @param x2	the second point's x
	 * @param y2	the second point's y
	 * @return		the distance between the two points
	 */
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}