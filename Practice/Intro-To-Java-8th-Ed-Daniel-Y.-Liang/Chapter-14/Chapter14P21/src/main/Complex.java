package main;

/**
 * @author Tony Liang
 *
 */
public class Complex
{
	private double a, b;
	
	/**
	 * Creates a new default Complex number.
	 */
	public Complex()
	{
		this(0.0);
	}
	
	/**
	 * Creates a new Complex number given the real part of the complex number.
	 * 
	 * @param a		real part of the complex number
	 */
	public Complex(double a)
	{
		this(a, 0.0);
	}
	
	/**
	 * Creates a new Complex number given the real and imaginary parts of the complex number.
	 * 
	 * @param a		real part of the complex number
	 * @param b		imaginary part of the complex number
	 */
	public Complex(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public double getRealPart()
	{
		return a;
	}
	
	public double getImaginaryPart()
	{
		return b;
	}
	
	public Complex add(Complex complexNumber)
	{
		return new Complex(a + complexNumber.getRealPart(), b + complexNumber.getImaginaryPart());
	}
	
	public Complex subtract(Complex complexNumber)
	{
		return new Complex(a - complexNumber.getRealPart(), b - complexNumber.getImaginaryPart());
	}
	
	public Complex multiply(Complex complexNumber)
	{
		return new Complex((a * complexNumber.getRealPart()) - (b * complexNumber.getImaginaryPart()), 
				(b * complexNumber.getRealPart()) + (a * complexNumber.getImaginaryPart()));
	}
	
	public Complex divide(Complex complexNumber)
	{
		double newA = ((a * complexNumber.getRealPart()) + (b * complexNumber.getImaginaryPart())) / ((complexNumber.getRealPart() * 
				complexNumber.getRealPart()) + (complexNumber.getImaginaryPart() * complexNumber.getImaginaryPart()));
		double newB = ((b * complexNumber.getRealPart()) - (a * complexNumber.getImaginaryPart())) / ((complexNumber.getRealPart() * 
				complexNumber.getRealPart()) + (complexNumber.getImaginaryPart() * complexNumber.getImaginaryPart()));
		return new Complex(newA, newB);
	}
	
	public double abs()
	{
		return Math.sqrt((a * a) + (b * b));
	}
	
	@Override  
	public String toString()
	{
		String complexNumber = String.valueOf(a);
		
		if (b != 0.0)
		{
			complexNumber += " + " + b + "i";
		}
		
		return complexNumber;
	}
}