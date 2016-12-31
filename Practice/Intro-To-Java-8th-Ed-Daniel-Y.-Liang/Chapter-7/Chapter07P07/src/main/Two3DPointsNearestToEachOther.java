package main;

/**
 * @author Tony Liang
 *
 */
public class Two3DPointsNearestToEachOther
{
	public static void main(String[] args)
	{
		double[][] points = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 }, { 2, 0.5, 9 }, { 3.5, 2, -1 },
				{ 3, 1.5, 3 }, { -1.5, 4, 2 }, { 5.5, 4, -0.5 } };
		int nearestPoint1 = 0, nearestPoint2 = 1;
		double shortestDistance = distance(points[nearestPoint1][0], points[nearestPoint1][1],
				points[nearestPoint1][2], points[nearestPoint2][0], points[nearestPoint2][1],
				points[nearestPoint2][2]);
		
		for (int firstPoint = 0; firstPoint < points.length; firstPoint++)
		{
			for (int secondPoint = firstPoint + 1; secondPoint < points.length; secondPoint++)
			{
				double distance = distance(points[firstPoint][0], points[firstPoint][1], points[firstPoint][2],
						points[secondPoint][0], points[secondPoint][1], points[secondPoint][2]);
				
				if (shortestDistance > distance)
				{
					nearestPoint1 = firstPoint;
					nearestPoint2 = secondPoint;
					shortestDistance = distance;
				}
			}
		}
		
		System.out.println("The closest two points are " + "(" + points[nearestPoint1][0] + ", " +
				points[nearestPoint1][1] + ", " + points[nearestPoint1][2] + ") and (" + points[nearestPoint2][0] +
				", " + points[nearestPoint2][1] + ", " + points[nearestPoint2][2] + ")");
	}
	
	/**
	 * Returns the distance between the two three-dimensional space points given the x, y, and z coordinates of the
	 * points.
	 * 
	 * @param x1	the first point's x
	 * @param y1	the first point's y
	 * @param z1	the first point's z
	 * @param x2	the second point's x
	 * @param y2	the second point's y
	 * @param z2	the second point's z
	 * @return		the distance between the two points
	 */
	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
	}
}