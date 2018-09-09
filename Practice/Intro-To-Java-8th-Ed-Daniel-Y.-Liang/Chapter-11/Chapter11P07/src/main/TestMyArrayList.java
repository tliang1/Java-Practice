package main;

/**
 * @author Tony Liang
 *
 */
public class TestMyArrayList
{
	public static void main(String[] args)
	{
		MyArrayList cityList = new MyArrayList();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("List size? "+ cityList.size());
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());
		
		cityList.add(2, "Xian");
		cityList.remove("Miami");
		cityList.remove(1);
		
		System.out.println(cityList.toString());
		
		for (int i = cityList.size() - 1; i >= 0; i--)
		{
			System.out.print(cityList.get(i) + " ");
		}
		
		System.out.println();
		
		System.out.println("The city at index 3 is replaced with Xian. The original city was " + cityList.set(3, "Xian") + ".");
		
		System.out.println("The last location of Xian in the list? " + cityList.lastIndexOf("Xian"));
		
		cityList.clear();
		
		System.out.println(cityList);
		
	}
}