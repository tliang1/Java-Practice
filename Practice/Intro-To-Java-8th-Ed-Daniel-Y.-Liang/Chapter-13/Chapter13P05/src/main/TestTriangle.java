package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TestTriangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		input.close();
		
		try
		{
			Triangle triangle = new Triangle(side1, side2, side3);
			System.out.println("The area of the triangle is " + triangle.getArea() + ".");
			System.out.println("The perimeter of the triangle is " + triangle.getPerimeter() + ".");
			System.out.println("The color of the triangle is " + triangle.getColor() + ".");
			System.out.println("Is the triangle filled? " + triangle.isFilled());
		}
		catch (IllegalTriangleException ex)
		{
			System.out.println("The three sides (" + ex.getSide1() + ", " + ex.getSide2() + ", and " + ex.getSide3() + ") can't form a " + 
					"triangle.");
		}
	}
}