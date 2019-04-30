/**
 * 
 */
package main;

/**
 * @author Tony Liang
 *
 */
public class LargerOfTwoComparableCircles
{
	public static void main(String[] args)
	{
		ComparableCircle circle1 = new ComparableCircle(2);
		ComparableCircle circle2 = new ComparableCircle(4);
		
		System.out.print("A circle ");
		
		if (circle1.compareTo(circle2) >= 0)
		{
			System.out.println(circle1);
			System.out.println("The radius is " + circle1.getRadius());
		}
		else
		{
			System.out.println(circle2);
			System.out.println("The radius is " + circle2.getRadius());
		}
	}
}