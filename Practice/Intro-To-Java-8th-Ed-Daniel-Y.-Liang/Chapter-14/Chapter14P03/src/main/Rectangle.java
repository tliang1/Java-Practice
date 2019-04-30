package main;

/**
 * @author Tony Liang
 *
 */
public class Rectangle extends GeometricObject implements Colorable
{
	private double width;
	private double height;
	
	/**
	 * Creates a new Rectangle with the default width and height of 1.
	 */
	public Rectangle()
	{
		this(1.0, 1.0);
	}
	
	/**
	 * Creates a new Rectangle given the width and height.
	 * 
	 * @param width		width of the rectangle
	 * @param height	height of the rectangle
	 */
	public Rectangle(double width, double height)
	{
		this(width, height, "white", false);
	}
	
	/**
	 * Creates a new Rectangle given the width, height, color, and whether the rectangle is filled with the given color.
	 * <ul>
	 * 	<li>
	 * 		If the width is not a nonzero positive number, the width will default to 1.
	 * 	</li>
	 * 	<li>
	 * 		If the height is not a nonzero positive number, the height will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param width		width of the rectangle
	 * @param height	height of the rectangle
	 * @param color		color of the rectangle
	 * @param filled	whether the rectangle is filled with the given color
	 */
	public Rectangle(double width, double height, String color, boolean filled)
	{
		super(color, filled);
		this.width = (width > 0.0) ? width : 1.0;
		this.height = (height > 0.0) ? height : 1.0;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = (width > 0.0) ? width : 1.0;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = (height > 0.0) ? height : 1.0;
	}

	@Override
	public int compareTo(Object o)
	{
		if (getArea() > ((Rectangle)o).getArea())
		{
			return 1;
		}
		else if (getArea() < ((Rectangle)o).getArea())
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
		return width * height;
	}
	
	@Override
	public double getPerimeter()
	{
		return 2.0 * (width + height);
	}

	@Override
	public void howToColor()
	{
		System.out.println("Color all four sides");
	}
}