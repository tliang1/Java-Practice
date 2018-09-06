package main;

/**
 * @author Tony Liang
 *
 */
public class TestTriangle
{
	public static void main(String[] args)
	{
		Triangle triangle = new Triangle(1, 1.5, 1);
		triangle.setColor("yellow");
		triangle.setFilled(true);
		
		System.out.println(triangle);
		System.out.println("The area of the triangle is " + triangle.getArea() + ".");
		System.out.println("The perimeter of the triangle is " + triangle.getPerimeter() + ".");
		System.out.println("The color of the triangle is " + triangle.getColor() + ".");
		System.out.println("Is the triangle filled? " + triangle.isFilled());
	}
}