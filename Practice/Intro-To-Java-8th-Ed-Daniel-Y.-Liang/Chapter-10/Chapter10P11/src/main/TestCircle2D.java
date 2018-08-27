package main;

/**
 * @author Tony Liang
 *
 */
public class TestCircle2D
{
	public static void main(String[] args)
	{
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println("The area of this circle is " + c1.getArea() + ".");
		System.out.println("The perimeter of this circle is " + c1.getPerimeter() + ".");
		
		System.out.println("Is the point (3, 3) inside this circle? " + c1.contains(3, 3));
		
		System.out.println("Is the circle centered at (4, 5) with radius 10.5 inside this circle? " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Is the circle centered at (3, 5) with radius 2.3 overlapping this circle? " + 
								c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}