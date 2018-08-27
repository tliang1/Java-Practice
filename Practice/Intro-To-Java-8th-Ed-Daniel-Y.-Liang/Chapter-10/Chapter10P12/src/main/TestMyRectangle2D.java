package main;

/**
 * @author Tony Liang
 *
 */
public class TestMyRectangle2D
{
	public static void main(String[] args)
	{
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		
		System.out.println("The area of this rectangle is " + r1.getArea() + ".");
		System.out.println("The perimeter of this rectangle is " + r1.getPerimeter() + ".");
		
		System.out.println("Is the point (3, 3) inside this rectangle? " + r1.contains(3, 3));
		
		System.out.println("Is the rectangle centered at (4, 5) with width of 10.5 and height of 3.2 inside this rectangle? " + 
								r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println("Is the rectangle centered at (3, 5) with width of 2.3 and height of 5.4 overlapping this rectangle? " + 
								r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}
}