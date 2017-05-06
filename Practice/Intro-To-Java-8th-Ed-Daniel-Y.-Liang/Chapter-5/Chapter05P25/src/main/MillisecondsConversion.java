package main;

/**
 * @author Tony Liang
 *
 */
public class MillisecondsConversion
{
	public static void main(String[] args)
	{
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));
	}

	/**
	 * Returns a string as hours:minutes:seconds by converting the specified long argument.
	 * <ul>
	 * 	<li>
	 * 		If the long argument is negative, the string will default to 0:0:0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param millis	milliseconds
	 * @return			a string as hours:minutes:seconds
	 */
	public static String convertMillis(long millis)
	{
		if (millis < 0)
		{
			return "0:0:0";
		}
		
		long totalSeconds = millis / 1000;
		long currentSecond = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		
		return totalHours + ":" + currentMinute + ":" + currentSecond;
	}
}