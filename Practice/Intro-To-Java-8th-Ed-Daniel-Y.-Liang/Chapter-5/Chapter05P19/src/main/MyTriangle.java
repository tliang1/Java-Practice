package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class MyTriangle
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides for a triangle: ");		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		while ((side1 <= 0.0) || (side2 <= 0.0) || (side3 <= 0.0))
		{
			System.out.print("Enter three sides for a triangle (All sides must be nonzero positive numbers): ");		
			side1 = input.nextDouble();
			side2 = input.nextDouble();
			side3 = input.nextDouble();
		}
		
		if (isValid(side1, side2, side3))
		{
			System.out.println("The area of the triangle is " + area(side1, side2, side3));
		}
		else
		{
			System.out.println("Input is invalid. The three sides cannot form a triangle.");
		}
		
		input.close();
	}

	/**
	 * Returns if the specified sides can form a triangle.
	 * <p>
	 * If any sides are less than or equal to 0.0, the triangle will default to be invalid.
	 * 
	 * @param side1		first side of the triangle
	 * @param side2		second side of the triangle
	 * @param side3		third side of the triangle
	 * @return			true if the specified sides can form a triangle. Otherwise, false.
	 */
	public static boolean isValid(double side1, double side2, double side3)
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
	
	/**
	 * Returns the area of the triangle with the specified sides.
	 * <p>
	 * If any sides are less than or equal to 0.0, the area will default to 0.0.
	 * 
	 * @param side1		first side of the triangle
	 * @param side2		second side of the triangle
	 * @param side3		third side of the triangle
	 * @return			the area of the triangle
	 */
	public static double area(double side1, double side2, double side3)
	{
		if ((side1 <= 0.0) || (side2 <= 0.0) || (side3 <= 0.0))
		{
			return 0.0;
		}
		
		double s = (side1 + side2 + side3) / 2;
		
		double areaOfTriangle = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		return (int)(areaOfTriangle * 100) / 100.0;
	}
}