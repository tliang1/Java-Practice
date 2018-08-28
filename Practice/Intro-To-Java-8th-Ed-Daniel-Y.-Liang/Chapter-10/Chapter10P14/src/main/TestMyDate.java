package main;

/**
 * @author Tony Liang
 *
 */
public class TestMyDate
{
	public static void main(String[] args)
	{
		MyDate myDate1 = new MyDate();
		MyDate myDate2 = new MyDate(34355555133101L);
		
		System.out.println("Current time is " + myDate1.displayTime());
		System.out.println("The time for myDate2 is " + myDate2.displayTime());
	}
}