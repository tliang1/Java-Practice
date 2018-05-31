package main;

import java.util.Date;

/**
 * @author Tony Liang
 *
 */
public class UsingDate
{
	public static void main(String[] args)
	{
		Date date = new Date();
		date.setTime(10000);
		System.out.println("For the elapsed time of 10000, the date and time are " + date.toString());
		date.setTime(100000);
		System.out.println("For the elapsed time of 100000, the date and time are " + date.toString());
		date.setTime(1000000);
		System.out.println("For the elapsed time of 1000000, the date and time are " + date.toString());
		date.setTime(10000000);
		System.out.println("For the elapsed time of 10000000, the date and time are " + date.toString());
		date.setTime(100000000);
		System.out.println("For the elapsed time of 100000000, the date and time are " + date.toString());
		date.setTime(1000000000);
		System.out.println("For the elapsed time of 1000000000, the date and time are " + date.toString());
		date.setTime(10000000000L);
		System.out.println("For the elapsed time of 10000000000, the date and time are " + date.toString());
		date.setTime(100000000000L);
		System.out.println("For the elapsed time of 100000000000, the date and time are " + date.toString());
	}
}