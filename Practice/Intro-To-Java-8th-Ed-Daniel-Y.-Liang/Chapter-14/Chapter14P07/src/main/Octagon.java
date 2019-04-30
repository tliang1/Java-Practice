package main;

/**
 * @author Tony Liang
 *
 */
public class Octagon extends GeometricObject implements Comparable<Object>, Cloneable
{
	private double side;
	
	/**
	 * Creates a new Octagon with the default side of 1.
	 */
	public Octagon()
	{
		this(1.0);
	}
	
	/**
	 * Creates a new Octagon given the side.
	 * 
	 * @param side	side of the octagon
	 */
	public Octagon(double side)
	{
		this(side, "white", false);
	}
	
	/**
	 * Creates a new Octagon given the side, color, and whether the octagon is filled with the given color.
	 * 
	 * @param side		side of the octagon
	 * @param color		color of the octagon
	 * @param filled	whether the octagon is filled with the given color
	 */
	public Octagon(double side, String color, boolean filled)
	{
		super(color, filled);
		this.side = (side > 0.0) ? side : 1.0;
	}
	
	public double getSide()
	{
		return side;
	}

	public void setSide(double side)
	{
		this.side = (side > 0.0) ? side : 1.0;
	}
	
	@Override
	public int compareTo(Object o)
	{
		if (getArea() > ((Octagon)o).getArea())
		{
			return 1;
		}
		else if (getArea() < ((Octagon)o).getArea())
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
		return (2 + (4/ Math.sqrt(2.0))) * side * side;
	}

	@Override
	public double getPerimeter()
	{
		return 8.0 * side;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}