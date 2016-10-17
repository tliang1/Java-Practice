package main;

import java.util.Scanner;

public class QuadraticEquationRoots 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = (b * b) - (4 * a * c);
		
		if (discriminant < 0)
		{
			System.out.println("The equation has no roots");
		}
		else
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			
			if (discriminant == 0)
			{
				System.out.println("The root is " + root1);
			}
			else
			{
				double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
				System.out.println("The roots are " + root1 + " and " + root2);
			}
		}
		
		input.close();
	}

}