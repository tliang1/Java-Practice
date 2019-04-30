package main;

/**
 * @author Tony Liang
 *
 */
public class TestEqualCircles
{
	public static void main(String[] args)
	{
		Circle circle1 = new Circle(2);
		Circle circle2 = new Circle(2);
		
		System.out.print("Circle 1 is ");
		
		if (!circle1.equals(circle2))
		{
			System.out.print("not ");
		}
		
		System.out.println("equal to Circle 2");
		
		Circle circle3 = new Circle(4);
		Circle circle4 = new Circle(1);
		
		System.out.print("Circle 3 is ");
		
		if (!circle3.equals(circle4))
		{
			System.out.print("not ");
		}
		
		System.out.println("equal to Circle 4");
	}
}