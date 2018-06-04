package main;

/**
 * @author Tony Liang
 *
 */
public class QuadraticEquation
{
	private double a, b, c;
	
	/**
	 * Creates a new QuadraticEquation given the three coefficients.
	 * <ul>
	 * 	<li>
	 * 		If the quadratic coefficient is 0.0, it will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param coefficientA	the quadratic coefficient
	 * @param coefficientB	the linear coefficient
	 * @param coefficientC	the constant
	 */
	public QuadraticEquation(double coefficientA, double coefficientB, double coefficientC)
	{
		a = (coefficientA != 0.0) ? coefficientA : 1;
		b = coefficientB;
		c = coefficientC;
	}
	
	public double getA()
	{
		return a;
	}

	public double getB()
	{
		return b;
	}

	public double getC()
	{
		return c;
	}
	
	public double getDiscriminant()
	{
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	public double getRoot1()
	{
		return (getDiscriminant() >= 0.0) ? (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a) : 0; 
	}
	
	public double getRoot2()
	{
		return (getDiscriminant() >= 0.0) ? (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a) : 0;
	}
}