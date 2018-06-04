package main;

/**
 * @author Tony Liang
 *
 */
public class RegularPolygon
{
	private int n;
	private double side, x, y;
	
	/**
	 * Creates a new default RegularPolygon.
	 */
	public RegularPolygon()
	{
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	/**
	 * Creates a new RegularPolygon given the number of sides and the length of the side.
	 * <ul>
	 * 	<li>
	 * 		If the number of sides is not greater than 3, it will default to 3.
	 * 	</li>
	 * 	<li>
	 * 		If the length of the side is not a nonzero positive number, it will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param numberOfSides		number of sides of the regular polygon
	 * @param lengthOfSide		length of each side of the regular polygon
	 */
	public RegularPolygon(int numberOfSides, double lengthOfSide)
	{
		n = (numberOfSides > 3) ? numberOfSides : 3;
		side = (lengthOfSide > 0.0) ? lengthOfSide : 1;
		x = 0;
		y = 0;
	}
	
	/**
	 * Creates a new RegularPolygon given the number of sides, the length of the side, and the x and y coordinates of the center of the 
	 * polygon.
	 * <ul>
	 * 	<li>
	 * 		If the number of sides is not greater than 3, it will default to 3.
	 * 	</li>
	 * 	<li>
	 * 		If the length of the side is not a nonzero positive number, it will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param numberOfSides		number of sides of the regular polygon
	 * @param lengthOfSide		length of each side of the regular polygon
	 * @param centerX			x-coordinate of the center of the polygon
	 * @param centerY			y-coordinate of the center of the polygon
	 */
	public RegularPolygon(int numberOfSides, double lengthOfSide, double centerX, double centerY)
	{
		n = (numberOfSides > 3) ? numberOfSides : 3;
		side = (lengthOfSide > 0.0) ? lengthOfSide : 1;
		x = centerX;
		y = centerY;
	}
	
	public int getN()
	{
		return n;
	}

	public void setN(int numberOfSides)
	{
		n = (numberOfSides > 3) ? numberOfSides : n;
	}

	public double getSide()
	{
		return side;
	}

	public void setSide(double lengthOfSide)
	{
		side = (lengthOfSide > 0.0) ? lengthOfSide : side;
	}

	public double getX()
	{
		return x;
	}

	public void setX(double centerX)
	{
		x = centerX;
	}

	public double getY()
	{
		return y;
	}

	public void setY(double centerY)
	{
		y = centerY;
	}

	public double getPerimeter()
	{
		return n * side;
	}
	
	public double getArea()
	{
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}