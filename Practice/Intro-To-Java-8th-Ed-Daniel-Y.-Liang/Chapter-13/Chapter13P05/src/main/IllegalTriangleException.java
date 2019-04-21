package main;

/**
 * @author Tony Liang
 *
 */
public class IllegalTriangleException extends Exception
{
	private double side1, side2, side3;
	
	/**
	 * Creates a new IllegalTriangleException given the three sides.
	 * 
	 * @param side1		first side
	 * @param side2		second side
	 * @param side3		third side
	 */
	public IllegalTriangleException(double side1, double side2, double side3)
	{
		super("Invalid sides " + side1 + " " + side2 + " " + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
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
}