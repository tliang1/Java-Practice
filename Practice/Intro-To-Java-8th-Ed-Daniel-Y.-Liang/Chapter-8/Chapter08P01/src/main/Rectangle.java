package main;

/**
 * @author Tony Liang
 *
 */
public class Rectangle
{
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The width of rectangle1 is " + rectangle1.width);
		System.out.println("The height of rectangle1 is " + rectangle1.height);
		System.out.println("The area of rectangle1 is " + rectangle1.getArea());
		System.out.println("The perimeter of rectangle1 is " + rectangle1.getPerimeter());
		
		System.out.println("The width of rectangle2 is " + rectangle2.width);
		System.out.println("The height of rectangle2 is " + rectangle2.height);
		System.out.println("The area of rectangle2 is " + rectangle2.getArea());
		System.out.println("The perimeter of rectangle2 is " + rectangle2.getPerimeter());
	}
	
	double width, height;
	
	/**
	 * Creates a new Rectangle with the default width and height of 1.
	 */
	Rectangle()
	{
		width = 1;
		height = 1;
	}
	
	/**
	 * Creates a new Rectangle given the width and height.
	 * <ul>
	 * 	<li>
	 * 		If the width is not a nonzero positive number, the width will default to 1.
	 * 	</li>
	 * 	<li>
	 * 		If the height is not a nonzero positive number, the height will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param newWidth	new width of the rectangle
	 * @param newHeight	new height of the rectangle
	 */
	Rectangle(double newWidth, double newHeight)
	{
		width = (newWidth > 0.0) ? newWidth : 1;
		height = (newHeight > 0.0) ? newHeight : 1;
	}
	
	double getArea()
	{
		return width * height;
	}
	
	double getPerimeter()
	{
		return 2.0 * (width + height);
	}
}