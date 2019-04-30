package main;

/**
 * @author Tony Liang
 *
 */
public class TestEqualRectangles
{
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle(2, 2);
		Rectangle rectangle2 = new Rectangle(1, 4);
		
		System.out.print("Rectangle 1 is ");
		
		if (!rectangle1.equals(rectangle2))
		{
			System.out.print("not ");
		}
		
		System.out.println("equal to Rectangle 2");
		
		Rectangle rectangle3 = new Rectangle(2, 3);
		Rectangle rectangle4 = new Rectangle(4, 5);
		
		System.out.print("Rectangle 3 is ");
		
		if (!rectangle3.equals(rectangle4))
		{
			System.out.print("not ");
		}
		
		System.out.println("equal to Rectangle 4");
	}
}