package main;

/**
 * @author Tony Liang
 *
 */
public class Rational extends Number implements Comparable<Object>
{
	private long numerator = 0;
	private long denominator = 1;
	
	/**
	 * Creates a new default Rational.
	 */
	public Rational()
	{
		this(0, 1);
	}
	
	/**
	 * Creates a new Rational given the numerator and denominator.
	 * 
	 * @param numerator		numerator
	 * @param denominator	denominator
	 */
	public Rational(long numerator, long denominator)
	{
		long gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}
	
	private static long gcd(long n, long d)
	{
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		
		for (int k = 1; k <= n1 && k <= n2; k++)
		{
			if (n1 % k == 0 && n2 % k == 0)
			{
				gcd = k;
			}
		}
		
		return gcd;
	}
	
	public long getNumerator()
	{
		return numerator;
	}
	
	public long getDenominator()
	{
		return denominator;
	}

	public Rational add(Rational secondRational)
	{
		long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}
	
	public Rational subtract(Rational secondRational)
	{
		long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}
	
	public Rational multiply(Rational secondRational)
	{
		long n = numerator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}
	
	public Rational divide(Rational secondRational)
	{
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.getNumerator();
		return new Rational(n, d);
	}
	
	@Override  
	public String toString()
	{
		if (denominator == 1)
		{
			return numerator + "";
		}
		else
		{
			return numerator + "/" + denominator;
		}
	}
	
	@Override
	public boolean equals(Object param1)
	{
		if ((this.subtract((Rational)(param1))).getNumerator() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int intValue()
	{
		return (int)doubleValue();
	}
	
	@Override
	public float floatValue()
	{
		return (float)doubleValue();
	}
	
	@Override
	public double doubleValue()
	{
		return numerator * 1.0 / denominator;
	}
	
	@Override
	public long longValue()
	{
		return (long)doubleValue();
	}
	
	@Override
	public int compareTo(Object o)
	{
		if (this.subtract((Rational)o).getNumerator() > 0)
		{
			return 1;
		}
		else if (this.subtract((Rational)o).getNumerator() < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}