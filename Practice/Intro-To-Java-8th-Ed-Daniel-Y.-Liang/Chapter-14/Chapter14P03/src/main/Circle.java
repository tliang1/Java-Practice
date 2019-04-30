package main;

/**
 * @author Tony Liang
 *
 */
public class Circle extends GeometricObject implements Colorable
{
	private double radius;
	
	/**
	 * Creates a new default Circle.
	 */
	public Circle()
	{
		this(0);
	}
	
	/**
	 * Creates a new Circle given the radius.
	 * 
	 * @param radius	radius of the circle
	 */
	public Circle(double radius)
	{
		this(radius, "white", false);
	}
	
	/**
	 * Creates a new Circle given the radius, color, and whether the circle is filled with the given color.
	 * <ul>
	 * 	<li>
	 * 		If the radius is not positive, it will default to 0.0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param radius	radius of the circle
	 * @param color		color of the circle
	 * @param filled	whether the circle is filled with the given color
	 */
	public Circle(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = (radius > 0.0) ? radius : 0.0;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = (radius > 0.0) ? radius : 0.0;
	}
	
	public double getDiameter()
	{
		return 2 * radius;
	}
	
	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

	@Override
	public int compareTo(Object o)
	{
		if (getArea() > ((Circle)o).getArea())
		{
			return 1;
		}
		else if (getArea() < ((Circle)o).getArea())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	@Override
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	@Override
	public void howToColor()
	{
		System.out.println("Color the curve");
	}
}