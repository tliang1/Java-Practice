package main;

/**
 * @author Tony Liang
 *
 */
public class TestOctagon
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Octagon octagon = new Octagon(5);
		System.out.println("The area is " + octagon.getArea());
		System.out.println("The perimeter is " + octagon.getPerimeter());
		
		Octagon clonedOctagon = (Octagon) octagon.clone();
		
		if (octagon.compareTo(clonedOctagon) > 0)
		{
			System.out.println("The first octagon's area is larger than the second octagon.");
		}
		else if (octagon.compareTo(clonedOctagon) == 0)
		{
			System.out.println("Both octagons have the same area.");
		}
		else
		{
			System.out.println("The first octagon's area is smaller than the second octagon.");
		}
	}
}