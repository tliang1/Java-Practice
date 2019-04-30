package main;

/**
 * @author Tony Liang
 *
 */
public class TestDeepCopy
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		House house1 = new House(1, 1750.50);
		House house2 = (House)house1.clone();
		
		System.out.println("House 1");
		System.out.println("ID: " + house1.getId());
		System.out.println("Area: " + house1.getArea());
		System.out.println("When the house was built: " + house1.getWhenBuilt());
		
		System.out.println("\nHouse 2");
		System.out.println("ID: " + house2.getId());
		System.out.println("Area: " + house2.getArea());
		System.out.println("When the house was built: " + house2.getWhenBuilt());
		
		System.out.println("\nhouse1.whenBuilt.equals(house2.whenBuilt)? " + house1.getWhenBuilt().equals(house2.getWhenBuilt()));
		System.out.println("house1.whenBuilt == house2.whenBuilt? " + (house1.getWhenBuilt() == house2.getWhenBuilt()));
		System.out.println("house1 == house2? " + (house1 == house2));
	}
}