package main;

/**
 * @author Tony Liang
 *
 */
public class Square extends GeometricObject implements Colorable
{
	private double side;
	
	/**
	 * Creates a new Square with the default side of 1.
	 */
	public Square()
	{
		this(1.0);
	}
	
	/**
	 * Creates a new Square given the side.
	 * 
	 * @param side	side of the square
	 */
	public Square(double side)
	{
		this(side, "white", false);
	}
	
	/**
	 * Creates a new Square given the side, color, and whether the square is filled with the given color.
	 * <ul>
	 * 	<li>
	 * 		If the side is not a nonzero positive number, the side will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param side		side of the square
	 * @param color		color of the square
	 * @param filled	whether the square is filled with the given color
	 */
	public Square(double side, String color, boolean filled)
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
		if (getArea() > ((Square)o).getArea())
		{
			return 1;
		}
		else if (getArea() < ((Square)o).getArea())
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
		return 2.0 * side;
	}

	@Override
	public double getPerimeter()
	{
		return 4.0 * side;
	}
	
	@Override
	public void howToColor()
	{
		System.out.println("Color all four sides");
	}
}