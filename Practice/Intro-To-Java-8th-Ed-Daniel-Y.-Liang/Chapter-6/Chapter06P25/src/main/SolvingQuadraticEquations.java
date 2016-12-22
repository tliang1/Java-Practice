package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SolvingQuadraticEquations
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double[] coefficients = new double[3];
		double[] roots = new double[2];
		
		System.out.print("Enter a, b, and c: ");
		
		for (int coefficient = 0; coefficient < coefficients.length; coefficient++)
		{
			coefficients[coefficient] = input.nextDouble();
		}
		
		int numberOfRoots = solveQuadratic(coefficients, roots);
		
		System.out.print("The number of roots for the quadratic equation is " + numberOfRoots);
		
		if (numberOfRoots == 0)
		{
			System.out.println(".");
		}
		else if (numberOfRoots == 1)
		{
			System.out.println(" and the noncomplex root is " + roots[0] + ".");
		}
		else
		{
			System.out.println(" and all the noncomplex roots are " + roots[0] + " and " + roots[1] + ".");
		}
		
		input.close();
	}
	
	/**
	 * Returns the number of roots given the double array arguments.
	 * <p>
	 * If the first double array's size is not equal to 3 or the first element is 0, then the number of roots will 
	 * default to 0.
	 * <p>
	 * If the second double array's size is not equal to 2, it will default to a new double array of size 2.
	 * 
	 * @param eqn		array of coefficients
	 * @param roots		array of roots
	 * @return			the number of roots
	 */
	public static int solveQuadratic(double[] eqn, double[] roots)
	{
		if ((eqn.length != 3) || (eqn[0] == 0))
		{
			return 0;
		}
		
		if (roots.length != 2)
		{
			roots = new double[2];
		}
		
		double discriminant = (eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]);
		
		if (discriminant < 0)
		{
			return 0;
		}
		else
		{
			double root1 = (-eqn[1] + Math.pow(discriminant, 0.5)) / (2 * eqn[0]);
			
			if (discriminant == 0)
			{
				roots[0] = root1;
				
				return 1;
			}
			else
			{
				double root2 = (-eqn[1] - Math.pow(discriminant, 0.5)) / (2 * eqn[0]);
				
				roots[0] = root1;
				roots[1] = root2;
				
				return 2;
			}
		}
	}
}