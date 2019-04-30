package main;

/**
 * @author Tony Liang
 *
 */
public abstract class GeometricObject implements Comparable<Object>
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**
	 * Creates a new default GeometricObject.
	 */
	protected GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	
	/**
	 * Creates a new GeometricObject given the color and whether the object is filled with the given color.
	 * 
	 * @param color		color of the geometric object
	 * @param filled	whether the geometric object is filled with the given color
	 */
	protected GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	
	@Override
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	/**
	 * Returns the maximum of the two given geometric objects.
	 * 
	 * @param o1	first geometric object
	 * @param o2	second geometric object
	 * @return		the maximum of the two given geometric objects
	 */
	public static Comparable<Object> max(Comparable<Object> o1, Comparable<Object> o2)
	{
		if (o1.compareTo(o2) > 0)
		{
			return o1;
		}
		else
		{
			return o2;
		}
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}