package main;

import java.util.Date;

/**
 * @author Tony Liang
 *
 */
public class LargestObject
{
	public static void main(String[] args)
	{
		String[] stringArray = {"river", "fence", "quaint", "prickly", "lavish", "noiseless", "harbor", "lazy", "cloth", "overwrought"};
		Integer[] intArray = {970957957, 421686761, 114850705, 495293102, 547331349, 780146938, 987234039, 659937783, 945664799, 659028214};
		Date[] dateArray = {new Date(), new Date(34355555133101L), new Date(1234567), new Date(271997640777869300L), 
				new Date(5665078664603615000L), new Date(6346382397938463000L), new Date(1609457431454742500L), new Date(4483442147532200000L), 
				new Date(2514508416423532500L), new Date(9027624620983886000L)};
		
		System.out.println("The largest string is " + max(stringArray));
		System.out.println("The largest integer is " + max(intArray));
		System.out.println("The largest date is " + max(dateArray));
	}
	
	/**
	 * Returns the largest object in the given array of objects.
	 * <ul>
	 * 	<li>
	 * 		If the given array is empty, a new object is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param a		array of objects
	 * @return		the largest object in the given array of objects
	 */
	public static Object max(Comparable[] a)
	{
		if (a.length > 0)
		{
			if (a.length == 1)
			{
				return (Object)a[0];
			}
			else
			{
				Comparable currentMax = a[0];
				
				for (Comparable comparable : a)
				{
					if (comparable.compareTo(currentMax) > 0)
					{
						currentMax = comparable;
					}
				}
				
				return (Object)currentMax;
			}
		}
		
		return new Object();
	}
}