package main;

/**
 * @author Tony Liang
 *
 */
public class Time
{
	private int hour, minute, second;
	
	/**
	 * Creates a new default Time.
	 */
	public Time()
	{
		this(System.currentTimeMillis());
	}
	
	/**
	 * Creates a new Time given the elapse time in milliseconds.
	 * 
	 * @param elapseTime	the elapse time in milliseconds
	 */
	public Time(long elapseTime)
	{
		long totalSeconds = elapseTime / 1000;
		
		second = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		
		minute = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		
		hour = (int)(totalHours % 24);
	}
	
	/**
	 * Creates a new Time given the hours, minutes, and seconds.
	 * 
	 * @param hour		hours
	 * @param minute	minutes
	 * @param second	seconds
	 */
	public Time(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	/**
	 * Set a new time given the elapse time in milliseconds.
	 * 
	 * @param elapseTime	the elapse time in milliseconds
	 */
	public void setTime(long elapseTime)
	{
		long totalSeconds = (elapseTime > 0) ? (elapseTime / 1000) : 0;
		
		second = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		
		minute = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		
		hour = (int)(totalHours % 24);
	}
}