package main;

/**
 * @author Tony Liang
 *
 */
public class ComparableCircle extends Circle implements Comparable<Object>
{
	/**
	 * Creates a new ComparableCircle given the radius.
	 * 
	 * @param radius	radius of the ComparableCircle
	 */
	public ComparableCircle(double radius)
	{
		super(radius);
	}
	
	@Override
	public int compareTo(Object o)
	{
		if (getArea() > ((ComparableCircle)o).getArea())
		{
			return 1;
		}
		else if (getArea() < ((ComparableCircle)o).getArea())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}