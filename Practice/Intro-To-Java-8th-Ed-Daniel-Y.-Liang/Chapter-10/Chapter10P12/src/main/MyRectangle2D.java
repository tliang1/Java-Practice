package main;

/**
 * @author Tony Liang
 *
 */
public class MyRectangle2D
{
	private double x, y, width, height;
	
	/**
	 * Creates a new default MyRectangle2D with center x and y at 0 and width and height as 1.
	 */
	public MyRectangle2D()
	{
		this(0, 0, 1, 1);
	}
	
	/**
	 * Creates a new MyRectangle2D given the center x and y, width, and height of the rectangle.
	 * <ul>
	 * 	<li>
	 * 		If the width is negative, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the height is negative, it will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param x			x
	 * @param y			y
	 * @param width		width
	 * @param height	height
	 */
	public MyRectangle2D(double x, double y, double width, double height)
	{
		this.x = x;
		this.y = y;
		this.width = (width > 0) ? width : 0;
		this.height = (height > 0) ? height : 0;
	}

	public double getX()
	{
		return x;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public double getY()
	{
		return y;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = (width > 0) ? width : 0;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = (height > 0) ? height : 0;
	}
	
	public double getArea()
	{
		return width * height;
	}
	
	public double getPerimeter()
	{
		return 2 * (width + height);
	}
	
	/**
	 * Returns if the given point is inside this rectangle.
	 * 
	 * @param x		x
	 * @param y		y
	 * @return		true if the given point is inside this rectangle. Otherwise, false.
	 */
	public boolean contains(double x, double y)
	{
		double minX = this.x - (width / 2);
		double maxX = minX + width;
		double minY = this.y - (height / 2);
		double maxY = minY + height;
		
		if ((x >= minX) && (x <= maxX))
		{
			if ((y >= minY) && (y <= maxY))
			{
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Returns if the given rectangle is inside this rectangle.
	 * 
	 * @param r		rectangle
	 * @return		true if the given rectangle is inside this rectangle. Otherwise, false.
	 */
	public boolean contains(MyRectangle2D r)
	{
		double distanceX = Math.abs(r.getX() - this.x);
		double distanceY = Math.abs(r.getY() - this.y);
		double sumOfRectanglesHalfWidths = (width / 2) + (r.getWidth() / 2);
		double sumOfRectanglesHalfHeights = (height / 2) + (r.getHeight() / 2);
		
		if ((distanceX < sumOfRectanglesHalfWidths) && (distanceY < sumOfRectanglesHalfHeights))
		{
			if ((r.getWidth() <= this.width) && (r.getHeight() <= this.height))
			{
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Returns if the given rectangle overlaps this rectangle.
	 * 
	 * @param r		rectangle
	 * @return		true if the given rectangle overlaps this rectangle. Otherwise, false.
	 */
	public boolean overlaps(MyRectangle2D r)
	{
		double distanceX = Math.abs(r.getX() - this.x);
		double distanceY = Math.abs(r.getY() - this.y);
		double sumOfRectanglesHalfWidths = (width / 2) + (r.getWidth() / 2);
		double sumOfRectanglesHalfHeights = (height / 2) + (r.getHeight() / 2);
		
		if ((distanceX < sumOfRectanglesHalfWidths) && (distanceY < sumOfRectanglesHalfHeights))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}