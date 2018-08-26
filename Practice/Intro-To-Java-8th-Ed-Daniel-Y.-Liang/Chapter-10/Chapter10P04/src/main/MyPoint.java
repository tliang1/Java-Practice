package main;

/**
 * @author Tony Liang
 *
 */
public class MyPoint
{
	private double x, y;
	
	/**
	 * Creates a new default MyPoint.
	 * 
	 */
	public MyPoint()
	{
		this(0, 0);
	}
	
	/**
	 * Creates a new MyPoint given the x and y coordinates.
	 * 
	 * @param x		x
	 * @param y		y
	 */
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	/**
	 * Returns the distance between this point and the given point.
	 * 
	 * @param point		point
	 * @return			the distance between this point and the given point
	 */
	public double distance(MyPoint point)
	{
		return distance(point.getX(), point.getY());
	}
	
	/**
	 * Returns the distance between this point and the given x and y coordinates.
	 * 
	 * @param x		x
	 * @param y		y
	 * @return		the distance between this point and the given x and y coordinates
	 */
	public double distance(double x, double y)
	{
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}
}