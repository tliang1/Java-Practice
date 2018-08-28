package main;

import java.awt.geom.Line2D;

/**
 * @author Tony Liang
 *
 */
public class Triangle2D
{
	private MyPoint p1, p2, p3;
	
	/**
	 * Creates a new default Triangle2D with three points at (0, 0), (1, 1), and (2, 5).
	 */
	public Triangle2D()
	{
		this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
	}
	
	/**
	 * Creates a new Triangle2D given the three points.
	 * 
	 * @param p1	first point
	 * @param p2	second point
	 * @param p3	third point
	 */
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public MyPoint getP1()
	{
		return p1;
	}

	public void setP1(MyPoint p1)
	{
		this.p1 = p1;
	}

	public MyPoint getP2()
	{
		return p2;
	}

	public void setP2(MyPoint p2)
	{
		this.p2 = p2;
	}

	public MyPoint getP3()
	{
		return p3;
	}

	public void setP3(MyPoint p3)
	{
		this.p3 = p3;
	}
	
	/**
	 * Returns if the specified double arguments can form a triangle.
	 * <ul>
	 * 	<li>
	 * 		If any of the double arguments are less than or equal to 0.0, the triangle will default to be invalid.
	 * 	</li>
	 * </ul>
	 * 
	 * @param side1		first side of the triangle
	 * @param side2		second side of the triangle
	 * @param side3		third side of the triangle
	 * @return			true if the specified sides can form a triangle. Otherwise, false.
	 */
	private static boolean isValid(double side1, double side2, double side3)
	{
		if ((side1 > 0.0) && (side2 > 0.0) && (side3 > 0.0))
		{
			if (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public double getArea()
	{
		double side1 = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
		double side2 = Math.sqrt(Math.pow((p3.getX() - p2.getX()), 2) + Math.pow((p3.getY() - p2.getY()), 2));
		double side3 = Math.sqrt(Math.pow((p3.getX() - p1.getX()), 2) + Math.pow((p3.getY() - p1.getY()), 2));
		
		if (!isValid(side1, side2, side3))
		{
			return 0.0;
		}
		else
		{
			double s = (side1 + side2 + side3) / 2;
			
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}
	}
	
	public double getPerimeter()
	{
		double side1 = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
		double side2 = Math.sqrt(Math.pow((p3.getX() - p2.getX()), 2) + Math.pow((p3.getY() - p2.getY()), 2));
		double side3 = Math.sqrt(Math.pow((p3.getX() - p1.getX()), 2) + Math.pow((p3.getY() - p1.getY()), 2));
		
		if (!isValid(side1, side2, side3))
		{
			return -1;
		}
		else
		{
			return side1 + side2 + side3;
		}
	}
	
	/**
	 * Returns if the given point is inside this triangle.
	 * 
	 * @param p		point
	 * @return		true if the given point is inside this triangle. Otherwise, false.
	 */
	public boolean contains(MyPoint p)
	{
		MyPoint midpoint1 = new MyPoint((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
		MyPoint midpoint2 = new MyPoint((p1.getX() + p3.getX()) / 2, (p1.getY() + p3.getY()) / 2);
		MyPoint midpoint3 = new MyPoint((p2.getX() + p3.getX()) / 2, (p2.getY() + p3.getY()) / 2);
		
		return (!Line2D.linesIntersect(p.getX(), p.getY(), midpoint1.getX(), midpoint1.getY(), p1.getX(), p1.getY(), p3.getX(), p3.getY()) &&
				!Line2D.linesIntersect(p.getX(), p.getY(), midpoint1.getX(), midpoint1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY()) &&
				!Line2D.linesIntersect(p.getX(), p.getY(), midpoint2.getX(), midpoint1.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY()) &&
				!Line2D.linesIntersect(p.getX(), p.getY(), midpoint2.getX(), midpoint1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY()) &&
				!Line2D.linesIntersect(p.getX(), p.getY(), midpoint3.getX(), midpoint1.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY()) &&
				!Line2D.linesIntersect(p.getX(), p.getY(), midpoint1.getX(), midpoint1.getY(), p1.getX(), p1.getY(), p3.getX(), p3.getY())
		);
	}
	
	/**
	 * Returns if the given triangle is inside this triangle.
	 * 
	 * @param t		triangle
	 * @return		true if the given triangle is inside this triangle. Otherwise, false.
	 */
	public boolean contains(Triangle2D t)
	{
		return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
	}
	
	/**
	 * Returns if the given triangle overlaps this triangle.
	 * 
	 * @param t		triangle
	 * @return		true if the given triangle overlaps this triangle. Otherwise, false.
	 */
	public boolean overlaps(Triangle2D t)
	{
		return (Line2D.linesIntersect(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY(), t.getP1().getX(), t.getP1().getY(), 
								t.getP2().getX(), t.getP2().getY()) ||
				Line2D.linesIntersect(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY(), t.getP1().getX(), t.getP1().getY(), 
						t.getP3().getX(), t.getP3().getY()) ||
				Line2D.linesIntersect(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY(), t.getP2().getX(), t.getP2().getY(), 
						t.getP3().getX(), t.getP3().getY()) ||
				Line2D.linesIntersect(this.p1.getX(), this.p1.getY(), this.p3.getX(), this.p3.getY(), t.getP1().getX(), t.getP1().getY(), 
						t.getP2().getX(), t.getP2().getY()) ||
				Line2D.linesIntersect(this.p1.getX(), this.p1.getY(), this.p3.getX(), this.p3.getY(), t.getP1().getX(), t.getP1().getY(), 
						t.getP3().getX(), t.getP3().getY()) ||
				Line2D.linesIntersect(this.p1.getX(), this.p1.getY(), this.p3.getX(), this.p3.getY(), t.getP2().getX(), t.getP2().getY(), 
						t.getP3().getX(), t.getP3().getY()) ||
				Line2D.linesIntersect(this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY(), t.getP1().getX(), t.getP1().getY(), 
						t.getP2().getX(), t.getP2().getY()) ||
				Line2D.linesIntersect(this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY(), t.getP1().getX(), t.getP1().getY(), 
						t.getP3().getX(), t.getP3().getY()) ||
				Line2D.linesIntersect(this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY(), t.getP2().getX(), t.getP2().getY(), 
						t.getP3().getX(), t.getP3().getY())
				);
	}
}