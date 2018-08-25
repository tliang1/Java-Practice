package main;

/**
 * @author Tony Liang
 *
 */
public class BMI
{
	private String name;
	private int age;
	private double weight;
	private double height;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	
	/**
	 * Creates a new BMI given the name, age, weight in pounds, and height in inches.
	 * <ul>
	 * 	<li>
	 * 		If the weight is negative, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the height is zero or negative, it will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name		name
	 * @param age		age
	 * @param weight	weight in pounds
	 * @param height	height in inches
	 */
	public BMI(String name, int age, double weight, double height)
	{
		this.name = name;
		this.age = (age > 0) ? age : 0;
		this.weight = (weight > 0) ? weight : 0;
		this.height = (height > 0) ? height : 1;
	}
	
	/**
	 * Creates a new BMI given the name, weight in pounds, and height in inches.
	 * <ul>
	 * 	<li>
	 * 		If the weight is negative, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the height is zero or negative, it will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name		name
	 * @param weight	weight in pounds
	 * @param height	height in inches
	 */
	public BMI(String name, double weight, double height)
	{
		this(name, 20, weight, height);
	}
	
	/**
	 * Creates a new BMI given the name, age, weight in pounds, and height in feet and inches.
	 * <ul>
	 * 	<li>
	 * 		If the weight is negative, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the height is zero or negative, it will default to 1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name		name
	 * @param age		age
	 * @param weight	weight in pounds
	 * @param feet		feet
	 * @param inches	inches
	 */
	public BMI(String name, int age, double weight, double feet, double inches)
	{
		this(name, age, weight, (feet * 12) + inches);
	}
	
	public double getBMI()
	{
		double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		
		return Math.round(bmi * 100) / 100.0;
	}
	
	public String getStatus()
	{
		double bmi = getBMI();
		
		if (bmi < 16)
			return "seriously underweight";
		else if (bmi < 18)
			return "underweight";
		else if (bmi < 24)
			return "normal weight";
		else if (bmi < 29)
			return "overweight";
		else if (bmi < 35)
			return "seriously overweight";
		else
			return "gravely overweight";
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getHeight()
	{
		return height;
	}
}