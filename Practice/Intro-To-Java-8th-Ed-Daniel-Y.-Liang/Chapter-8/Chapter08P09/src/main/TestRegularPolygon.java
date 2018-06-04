package main;

/**
 * @author Tony Liang
 *
 */
public class TestRegularPolygon
{
	public static void main(String[] args)
	{
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("For the first regular polygon, its perimeter is " + regularPolygon1.getPerimeter() + " and its area is " + 
				regularPolygon1.getArea() + ".");
		System.out.println("For the second regular polygon, its perimeter is " + regularPolygon2.getPerimeter() + " and its area is " + 
				regularPolygon2.getArea() + ".");
		System.out.println("For the third regular polygon, its perimeter is " + regularPolygon3.getPerimeter() + " and its area is " + 
				regularPolygon3.getArea() + ".");
	}
}