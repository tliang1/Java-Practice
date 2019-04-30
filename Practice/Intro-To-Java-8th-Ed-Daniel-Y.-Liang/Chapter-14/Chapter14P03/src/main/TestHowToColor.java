package main;

import java.util.ArrayList;

/**
 * @author Tony Liang
 *
 */
public class TestHowToColor
{
	public static void main(String[] args)
	{
		ArrayList<GeometricObject> geometricObjects = new ArrayList<GeometricObject>();
		geometricObjects.add(new Circle(2));
		geometricObjects.add(new Rectangle(4, 5));
		geometricObjects.add(new Rectangle(2, 3));
		geometricObjects.add(new Circle(4));
		geometricObjects.add(new Square(5));
		
		for (GeometricObject geometricObject: geometricObjects)
		{
			if (geometricObject instanceof Colorable)
			{
				((Colorable) geometricObject).howToColor();
			}
		}
		
	}
}