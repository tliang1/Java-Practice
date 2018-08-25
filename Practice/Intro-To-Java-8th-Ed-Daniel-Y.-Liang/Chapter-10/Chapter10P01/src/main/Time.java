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
	 * <ul>
	 * 	<li>
	 * 		If the elapse time is negative, it will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param elapseTime	the elapse time in milliseconds
	 */
	public Time(long elapseTime)
	{
		long totalSeconds = (elapseTime > 0) ? (elapseTime / 1000) : 0;
		
		second = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		
		minute = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		
		hour = (int)(totalHours % 24);
	}
	
	/**
	 * Creates a new Time given the hours, minutes, and seconds.
	 * <ul>
	 * 	<li>
	 * 		If the hours are negative, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the minutes are negative, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the seconds are negative, it will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param hour		hours
	 * @param minute	minutes
	 * @param second	seconds
	 */
	public Time(int hour, int minute, int second)
	{
		this.hour = (hour > 0) ? hour : 0;
		this.minute = (minute > 0) ? minute : 0;
		this.second = (second > 0) ? second : 0;
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
	 * <ul>
	 * 	<li>
	 * 		If the elapse time is negative, it will default to 0.
	 * 	</li>
	 * </ul>
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