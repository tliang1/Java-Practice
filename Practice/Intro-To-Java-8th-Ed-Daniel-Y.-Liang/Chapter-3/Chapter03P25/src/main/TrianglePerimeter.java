package main;

import java.util.Scanner;

public class TrianglePerimeter
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three edges of the triangle: ");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		if (((edge1 + edge2) > edge3) && ((edge1 + edge3) > edge2) && ((edge2 + edge3) > edge1))
		{
			System.out.println("The perimeter of the triangle is " + (edge1 + edge2 + edge3));
		}
		else
		{
			System.out.println("Input is invalid. The three edges cannot form a triangle.");
		}
		
		input.close();
	}

}