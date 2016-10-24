package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class RegularPolygonArea
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numberOfSides = 2;
		
		while (numberOfSides < 3)
		{
			System.out.print("Enter the number of sides of a regular polygon: ");
			numberOfSides = input.nextInt();
		}
		
		double side = -1.0;
		
		while (side < 0.0)
		{
			System.out.print("Enter the side of the " + numberOfSides + "-sided regular polygon: ");
			side = input.nextDouble();
		}
		
		System.out.println("The area of the " + numberOfSides + "-sided regular polygon with the side value of " + 
				side + " is " + area(numberOfSides, side));
		
		input.close();
	}

	/**
	 * Returns the area of a regular polygon using the integer argument and the double argument.
	 * <p>
	 * If the integer argument is less than 3 or the double argument is zero or negative, the area will default to 
	 * 0.0.
	 * 
	 * @param n		number of sides
	 * @param side	side of regular polygon
	 * @return		the area of the regular polygon
	 */
	public static double area(int n, double side)
	{
		if ((n > 2) && (side > 0.0))
		{
			return (n * side * side) / (4.0 * Math.tan(Math.PI / n));
		}
		else
		{
			return 0.0;
		}
	}
}