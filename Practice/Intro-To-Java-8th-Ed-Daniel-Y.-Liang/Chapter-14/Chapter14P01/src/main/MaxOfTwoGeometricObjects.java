package main;

/**
 * @author Tony Liang
 *
 */
public class MaxOfTwoGeometricObjects
{
	public static void main(String[] args)
	{
		Circle circle1 = new Circle(2);
		Circle circle2 = new Circle(4);
		Circle maxCircle = (Circle)GeometricObject.max(circle1, circle2);
		System.out.println("A circle " + maxCircle);
		System.out.println("The radius is " + maxCircle.getRadius());
		System.out.println("The area is " + maxCircle.getArea());
		System.out.println("The diameter is " + maxCircle.getDiameter());
		
		Rectangle rectangle1 = new Rectangle(4, 5);
		Rectangle rectangle2 = new Rectangle(3, 6);
		Rectangle maxRectangle = (Rectangle)GeometricObject.max(rectangle1, rectangle2);
		System.out.println("\nA rectangle " + maxRectangle);
		System.out.println("The area is " + maxRectangle.getArea());
		System.out.println("The perimeter is " + maxRectangle.getPerimeter());
	}
}