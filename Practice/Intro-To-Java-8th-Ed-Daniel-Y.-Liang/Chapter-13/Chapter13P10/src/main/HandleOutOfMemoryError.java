package main;

import java.util.ArrayList;

/**
 * @author Tony Liang
 *
 */
public class HandleOutOfMemoryError
{
	public static void main(String[] args)
	{
		ArrayList<Object> objects = new ArrayList<Object>();
		
		try
		{
			while (true)
			{
				objects.add(new Object());
			}
		}
		catch (OutOfMemoryError er)
		{
			System.out.println("The JVM ran out of memory");
		}
	}
}