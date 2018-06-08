package main;

/**
 * @author Tony Liang
 *
 */
public class LinearEquation
{
	private boolean isLineSegments = false;
	private double a, b, c, d, e, f, x1, y1, x2, y2, x3, y3, x4, y4;
	
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
	
	/**
	 * Creates a new LinearEquation given both end points of the two line segments.
	 * 
	 * @param lineSegment1EndPointX1	x-coordinate of the first end point of the first line segment
	 * @param lineSegment1EndPointY1	y-coordinate of the first end point of the first line segment
	 * @param lineSegment1EndPointX2	x-coordinate of the second end point of the first line segment
	 * @param lineSegment1EndPointY2	y-coordinate of the second end point of the first line segment
	 * @param lineSegment2EndPointX1	x-coordinate of the first end point of the second line segment
	 * @param lineSegment2EndPointY1	y-coordinate of the first end point of the second line segment
	 * @param lineSegment2EndPointX2	x-coordinate of the second end point of the second line segment
	 * @param lineSegment2EndPointY2	y-coordinate of the second end point of the second line segment
	 */
	public LinearEquation(double lineSegment1EndPointX1, double lineSegment1EndPointY1, double lineSegment1EndPointX2, 
			double lineSegment1EndPointY2, double lineSegment2EndPointX1, double lineSegment2EndPointY1, double lineSegment2EndPointX2, 
			double lineSegment2EndPointY2)
	{
		isLineSegments = true;
		
		x1 = lineSegment1EndPointX1;
		y1 = lineSegment1EndPointY1;
		x2 = lineSegment1EndPointX2;
		y2 = lineSegment1EndPointY2;
		x3 = lineSegment2EndPointX1;
		y3 = lineSegment2EndPointY1;
		x4 = lineSegment2EndPointX2;
		y4 = lineSegment2EndPointY2;
		
		if ((x2 - x1) == 0.0)
		{
			a = 1;
			b = 0;
			e = x1;
		}
		else if ((y2 - y1) == 0.0)
		{
			a = 0;
			b = 1;
			e = y1;
		}
		else
		{
			double slope = getSlope(x1, y1, x2, y2);
			
			a = -slope;
			b = 1;
			e = (-x1 * slope) + y1;
		}
		
		if ((x4 - x3) == 0.0)
		{
			c = 1;
			d = 0;
			f = x3;
		}
		else if ((y4 - y3) == 0.0)
		{
			c = 0;
			d = 1;
			f = y3;
		}
		else
		{
			double slope = getSlope(x3, y3, x4, y4);
			
			c = -slope;
			d = 1;
			f = (-x3 * slope) + y3;
		}
	}
	
	private double getSlope(double x1, double y1, double x2, double y2)
	{
		return (y2 - y1) / (x2 - x1);
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
	 * Returns if x and y can be solved from the two equations or line segments.
	 * 
	 * @return	true if x and y can be solved from the two equations or line segments. Otherwise, false.
	 */
	public boolean isSolvable()
	{
		if (isLineSegments && ((a * d) - (b * c) != 0))
		{
			double x = getX();
			double y = getY();
			
			if ((x >= Math.min(x1, x2)) && (x <= Math.max(x1, x2)) && (x >= Math.min(x3, x4)) && (x <= Math.max(x3, x4)) && 
					(y >= Math.min(y1, y2)) && (y <= Math.max(y1, y2)) && (y >= Math.min(y3, y4)) && (y <= Math.max(y3, y4)))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return ((a * d) - (b * c) != 0);
		}
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