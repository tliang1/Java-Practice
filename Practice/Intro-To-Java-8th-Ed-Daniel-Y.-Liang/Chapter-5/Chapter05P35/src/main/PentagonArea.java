package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class PentagonArea
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double side = -1.0;
		
		while (side < 0.0)
		{
			System.out.print("Enter the side of a pentagon: ");
			side = input.nextDouble();
		}
		
		System.out.println("The area of the hexagon with the side value of " + side + " is " + pentagonArea(side));
		
		input.close();
	}

	/**
	 * Returns the area of a pentagon using the double argument.
	 * <p>
	 * If the double argument is negative, the area will default to 0.0.
	 * 
	 * @param side	side of pentagon
	 * @return		the area of the pentagon
	 */
	public static double pentagonArea(double side)
	{
		if (side < 0.0)
		{
			return 0.0;
		}
		else
		{
			return (5.0 * side * side) / (4.0 * Math.tan(Math.PI / 5.0));
		}
	}
}