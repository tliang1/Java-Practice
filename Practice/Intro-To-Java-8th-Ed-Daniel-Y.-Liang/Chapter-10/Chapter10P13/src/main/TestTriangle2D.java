package main;

/**
 * @author Tony Liang
 *
 */
public class TestTriangle2D
{
	public static void main(String[] args)
	{
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		
		System.out.println("The area of this triangle is " + t1.getArea() + ".");
		System.out.println("The perimeter of this triangle is " + t1.getPerimeter() + ".");
		
		System.out.println("Is the point (3, 3) inside this triangle? " + t1.contains(new MyPoint(3, 3)));
		
		System.out.println("Is the triangle with points at (2.9, 2), (4, 1), and (1, 3.4) inside this triangle? " + 
								t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		System.out.println("Is the triangle with points at (2, 5.5), (4, -3), and (2, 6.5) overlapping this triangle? " + 
								t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
	}
}