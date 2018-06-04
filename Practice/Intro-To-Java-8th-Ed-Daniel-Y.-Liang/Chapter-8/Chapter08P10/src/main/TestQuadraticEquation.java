package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TestQuadraticEquation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
		
		double discriminant = quadraticEquation.getDiscriminant();
		
		if (discriminant < 0)
		{
			System.out.println("The equation has no roots");
		}
		else
		{
			double root1 = quadraticEquation.getRoot1();
			
			if (discriminant == 0)
			{
				System.out.println("The root is " + root1);
			}
			else
			{
				double root2 = quadraticEquation.getRoot2();
				System.out.println("The roots are " + root1 + " and " + root2);
			}
		}
		
		input.close();
	}
}