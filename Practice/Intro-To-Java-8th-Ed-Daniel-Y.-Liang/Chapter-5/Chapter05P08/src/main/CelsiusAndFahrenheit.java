package main;

/**
 * @author Tony Liang
 *
 */
public class CelsiusAndFahrenheit
{
	public static void main(String[] args)
	{
		final double MAXIMUM_CELSIUS = 40.0;
		final double MINIMUM_CELSIUS = 31.0;
		final double MAXIMUM_FAHRENHEIT = 120.0;
		final double MINIMUM_FAHRENHEIT = 30.0;
		final double CHANGE_IN_CELSIUS = 1.0;
		final double CHANGE_IN_FAHRENHEIT = 10.0;
		
		System.out.println("Celsius\t\tFahrenheit\tFahrenheit\tCelsius");
		
		for (double celsius = MAXIMUM_CELSIUS, fahrenheit = MAXIMUM_FAHRENHEIT; 
				(celsius >= MINIMUM_CELSIUS) && (fahrenheit >= MINIMUM_FAHRENHEIT); 
				celsius -= CHANGE_IN_CELSIUS, fahrenheit -= CHANGE_IN_FAHRENHEIT)
		{
			System.out.printf("%-4.1f\t\t%-5.1f\t\t%-5.1f\t\t%-5.2f\n", celsius, celsiusToFahrenheit(celsius), 
					fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
		
		System.out.println();
	}
	
	/**
	 * Converts celsius to fahrenheit using the double argument.
	 * 
	 * @param celsius	celsius in degrees
	 * @return			fahrenheit in degrees
	 */
	public static double celsiusToFahrenheit(double celsius)
	{
		return ((9.0 / 5) * celsius) + 32;
	}
	
	/**
	 * Converts fahrenheit to celsius using the double argument.
	 * 
	 * @param fahrenheit	fahrenheit in degrees
	 * @return				celsius in degrees
	 */
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (5.0 / 9) * (fahrenheit - 32);
	}
}