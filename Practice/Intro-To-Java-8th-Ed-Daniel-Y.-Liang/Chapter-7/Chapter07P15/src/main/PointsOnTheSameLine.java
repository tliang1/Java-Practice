package main;

/**
 * @author Tony Liang
 *
 */
public class PointsOnTheSameLine
{
	public static void main(String[] args)
	{
		double[][] set1 = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 } };
		double[][] set2 = { { 0, 1 }, { 1, 2 }, { 4, 5 }, { 5, 6 } };
		double[][] set3 = { { 0, 1 }, { 1, 2 }, { 4, 5 }, { 4.5, 4 } };
		
		System.out.println("Are all the points on the same line for set 1? " + isOnTheSameLine(set1));
		System.out.println("Are all the points on the same line for set 2? " + isOnTheSameLine(set2));
		System.out.println("Are all the points on the same line for set 3? " + isOnTheSameLine(set3));
	}
	
	/**
	 * Returns if the set of points are on the same line given the double two-dimensional array argument.
	 * <p>
	 * If not every point in the set has the same number of coordinates, then it will default to false.
	 * <br>
	 * If the set only has one point, then it will default to true.
	 * 
	 * @param set	set of points
	 * @return		true if the set of points are on the same line. Otherwise, false.
	 */
	public static boolean isOnTheSameLine(double[][] set)
	{
		if (isSameNumberOfCoordinates(set, 2))
		{
			if (set.length > 1)
			{
				double[] firstPoint = set[0];
				boolean slantedLine = false;
				
				for (int point = 1; point < set.length; point++)
				{
					if (set[point][0] != firstPoint[0])
					{
						slantedLine = true;
						break;
					}
				}
				
				for (int point = 1; point < set.length; point++)
				{
					if (set[point][1] != firstPoint[1])
					{
						slantedLine = true;
						break;
					}
				}
				
				if (!slantedLine)
				{
					return true;
				}
				
				double slope = (set[1][1] - firstPoint[1]) / (set[1][0] - firstPoint[0]);
				
				for (int point = 2; point < set.length; point++)
				{
					double currentSlope = (set[point][1] - firstPoint[1]) / (set[point][0] - firstPoint[0]);
					
					if (currentSlope != slope)
					{
						return false;
					}
				}
				
				return true;
			}
			else
			{
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Returns if every point in the set has the same number of coordinates given the double two-dimensional array
	 * argument and the integer argument.
	 * 
	 * @param set					set of points
	 * @param numberOfCoordinates	number of coordinates
	 * @return						true if every point in the set has the same number of coordinates. Otherwise,
	 * 								false.
	 */
	public static boolean isSameNumberOfCoordinates(double[][] set, int numberOfCoordinates)
	{
		for (int row = 0; row < set.length; row++)
		{
			if (set[row].length != numberOfCoordinates)
			{
				return false;
			}
		}
		
		return true;
	}
}