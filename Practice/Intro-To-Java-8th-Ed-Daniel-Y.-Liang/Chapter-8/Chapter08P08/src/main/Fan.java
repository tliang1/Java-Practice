package main;

/**
 * @author Tony Liang
 *
 */
public class Fan
{
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	/**
	 * Creates the default Fan.
	 */
	public Fan()
	{
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int newSpeed)
	{
		if ((newSpeed > 0) && (newSpeed < 4)) {
			speed = newSpeed;
		}
	}
	public boolean isOn()
	{
		return on;
	}
	public void setOn(boolean newOn)
	{
		on = newOn;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double newRadius)
	{
		if (newRadius >= 0.0)
		{
			radius = newRadius;
		}
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String newColor)
	{
		color = newColor;
	}
	
	public String toString()
	{
		if (on)
		{
			return "fan speed: " + speed + ", fan color: " + color + ", fan radius: " + radius;
		}
		else
		{
			return "fan color: " + color + ", fan radius: " + radius + ", fan is off";
		}
	}
}