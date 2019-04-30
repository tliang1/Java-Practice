package main;

/**
 * @author Tony Liang
 *
 */
public class House implements Cloneable, Comparable<Object>
{
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	/**
	 * Creates a new House given the ID and area.
	 * 
	 * @param id	ID of the house
	 * @param area	area of the house
	 */
	public House(int id, double area)
	{
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public java.util.Date getWhenBuilt()
	{
		return whenBuilt;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		House clone = (House)super.clone();
		clone.whenBuilt = new java.util.Date(clone.whenBuilt.getTime());
		
		return clone;
	}
	
	@Override
	public int compareTo(Object o)
	{
		if (area > ((House)o).area)
		{
			return 1;
		}
	    else if (area < ((House)o).area)
	    {
	    	return -1;
	    }
	    else
	    {
	    	return 0;
	    }
	}
}