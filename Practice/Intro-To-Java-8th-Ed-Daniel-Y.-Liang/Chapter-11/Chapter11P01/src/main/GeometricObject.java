package main;

/**
 * @author Tony Liang
 *
 */
public class GeometricObject
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**
	 * Creates a new default GeometricObject.
	 */
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	
	/**
	 * Creates a new GeometricObject given the color and whether the object is filled with the given color.
	 * 
	 * @param color		color of the geometric object
	 * @param filled	whether the geometric object is filled with the given color
	 */
	public GeometricObject(String color, boolean filled)
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
	
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}