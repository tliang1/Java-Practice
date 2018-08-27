package main;

/**
 * @author Tony Liang
 *
 */
public class Circle2D
{
	private double x, y, radius;
	
	/**
	 * Creates a new default Circle2D with center x and y at 0 and radius as 1. 
	 */
	public Circle2D()
	{
		this(0, 0, 1);
	}
	
	/**
	 * Creates a new Circle2D given the center x and y and radius of the circle.
	 * <ul>
	 * 	<li>
	 * 		If the radius is negative, it will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param x			x
	 * @param y			y
	 * @param radius	radius
	 */
	public Circle2D(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = (radius > 0) ? radius : 0;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter()
	{
		return 2.0 * Math.PI * radius;
	}
	
	/**
	 * Returns if the given point is inside this circle.
	 * 
	 * @param x		x
	 * @param y		y
	 * @return		true if the given point is inside this circle. Otherwise, false.
	 */
	public boolean contains(double x, double y)
	{
		return Math.sqrt((x * x) + (y * y)) <= radius;
	}
	
	/**
	 * Returns if the given circle is inside this circle.
	 * 
	 * @param circle	circle
	 * @return			true if the given circle is inside this circle. Otherwise, false.
	 */
	public boolean contains(Circle2D circle)
	{
		return Math.sqrt((x * x) + (y * y)) <= Math.abs(radius - circle.getRadius());
	}
	
	/**
	 * Returns if the given circle overlaps this circle.
	 * 
	 * @param circle	circle
	 * @return			true if the given circle overlaps this circle. Otherwise, false.
	 */
	public boolean overlaps(Circle2D circle)
	{
		return Math.sqrt((x * x) + (y * y)) <= (radius + circle.getRadius());
	}
}