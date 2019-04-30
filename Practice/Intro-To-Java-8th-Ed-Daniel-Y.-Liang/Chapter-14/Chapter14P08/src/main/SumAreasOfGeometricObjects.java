package main;

/**
 * @author Tony Liang
 *
 */
public class SumAreasOfGeometricObjects
{
	public static void main(String[] args)
	{
		GeometricObject[] geometricObjects = {new Circle(2), new Circle(4), new Rectangle(4, 5), new Rectangle(3, 6)};
		System.out.println("The total area of all geometric objects in the array is " + sumArea(geometricObjects));
	}
	
	/**
	 * Returns the sum of all areas of the geometric objects in the given array.
	 * 
	 * @param a		array of geometric objects
	 * @return		the sum of all areas of the geometric objects in the given array
	 */
	public static double sumArea(GeometricObject[] a)
	{
		double sum = 0;
		
		for (GeometricObject geometricObject: a)
		{
			sum += geometricObject.getArea();
		}
		
		return sum;
	}
}