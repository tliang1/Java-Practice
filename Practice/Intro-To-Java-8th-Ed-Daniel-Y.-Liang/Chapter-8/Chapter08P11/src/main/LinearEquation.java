package main;

/**
 * @author Tony Liang
 *
 */
public class LinearEquation
{
	private double a, b, c, d, e, f;
	
	/**
	 * Creates a new LinearEquation given the x and y coefficients and constant for both equations.
	 * 
	 * @param xCoefficient1		x coefficient of equation 1
	 * @param yCoefficient1		y coefficient of equation 1
	 * @param xCoefficient2		x coefficient of equation 2
	 * @param yCoefficient2		y coefficient of equation 2
	 * @param constant1			constant of equation 1
	 * @param constant2			constant of equation 2
	 */
	public LinearEquation(double xCoefficient1, double yCoefficient1, double xCoefficient2, double yCoefficient2, double constant1, 
			double constant2)
	{
		a = xCoefficient1;
		b = yCoefficient1;
		c = xCoefficient2;
		d = yCoefficient2;
		e = constant1;
		f = constant2;
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

	public double getD()
	{
		return d;
	}

	public double getE()
	{
		return e;
	}

	public double getF()
	{
		return f;
	}
	
	/**
	 * Returns if x and y can be solved from the two equations.
	 * 
	 * @return	true if x and y can be solved from the two equations. Otherwise, false.
	 */
	public boolean isSolvable()
	{
		return ((a * d) - (b * c) != 0);
	}
	
	public double getX()
	{
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}
	
	public double getY()
	{
		return ((a * f) - (e * c)) / ((a * d) - (b * c));
	}
}