package main;

/**
 * @author Tony Liang
 *
 */
public class Triangle extends GeometricObject
{
	private double side1, side2, side3;
	
	/**
	 * Creates a new default Triangle with side values of 1.0.
	 * 
	 * @throws IllegalTriangleException		if the three sides can't form a triangle
	 */
	public Triangle() throws IllegalTriangleException
	{
		this(1.0, 1.0, 1.0);
	}
	
	/**
	 * Creates a new Triangle given the three sides.
	 * 
	 * @param side1							first side
	 * @param side2							second side
	 * @param side3							third side
	 * @throws IllegalTriangleException		if the three sides can't form a triangle
	 */
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
	{
		if (isValid(side1, side2, side3))
		{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		else
		{
			throw new IllegalTriangleException(side1, side2, side3);
		}
	}

	public double getSide1()
	{
		return side1;
	}

	public double getSide2()
	{
		return side2;
	}

	public double getSide3()
	{
		return side3;
	}
	
	/**
	 * Returns if the specified double arguments can form a triangle.
	 * <ul>
	 * 	<li>
	 * 		If any of the double arguments are less than or equal to 0.0, the triangle will default to be invalid.
	 * 	</li>
	 * </ul>
	 * 
	 * @param side1		first side of the triangle
	 * @param side2		second side of the triangle
	 * @param side3		third side of the triangle
	 * @return			true if the specified sides can form a triangle. Otherwise, false.
	 */
	private static boolean isValid(double side1, double side2, double side3)
	{
		if ((side1 > 0.0) && (side2 > 0.0) && (side3 > 0.0))
		{
			if (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public double getArea()
	{
		if (!isValid(side1, side2, side3))
		{
			return 0.0;
		}
		else
		{
			double s = (side1 + side2 + side3) / 2;
			
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}
	}
	
	public double getPerimeter()
	{
		if (!isValid(side1, side2, side3))
		{
			return -1;
		}
		else
		{
			return side1 + side2 + side3;
		}
	}
	
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}