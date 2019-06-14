package main;

import java.math.*;

/**
 * @author Tony Liang
 *
 */
public class Rational extends Number implements Comparable<Object>
{
	private BigInteger numerator = BigInteger.ZERO;
	private BigInteger denominator = BigInteger.ONE;
	
	/**
	 * Creates a new default Rational.
	 */
	public Rational()
	{
		this(BigInteger.ZERO, BigInteger.ONE);
	}
	
	/**
	 * Creates a new Rational given the numerator and denominator.
	 * 
	 * @param numerator		numerator
	 * @param denominator	denominator
	 */
	public Rational(BigInteger numerator, BigInteger denominator)
	{
		BigInteger gcd = numerator.gcd(denominator);
		
		if (denominator.compareTo(BigInteger.ZERO) > 0)
		{
			this.numerator = numerator.divide(gcd);
		}
		else
		{
			this.numerator = numerator.negate().divide(gcd);
		}
		
		this.denominator = denominator.abs().divide(gcd);
	}
	
	public BigInteger getNumerator()
	{
		return numerator;
	}
	
	public BigInteger getDenominator()
	{
		return denominator;
	}

	public Rational add(Rational secondRational)
	{
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	public Rational subtract(Rational secondRational)
	{
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	public Rational multiply(Rational secondRational)
	{
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	public Rational divide(Rational secondRational)
	{
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new Rational(n, d);
	}
	
	@Override  
	public String toString()
	{
		if (denominator.compareTo(BigInteger.ONE) == 0)
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
		if ((this.subtract((Rational)(param1))).getNumerator().compareTo(BigInteger.ZERO) == 0)
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
		BigDecimal value = new BigDecimal(numerator).divide(new BigDecimal(denominator), 25, RoundingMode.HALF_UP);
		return value.doubleValue();
	}
	
	@Override
	public long longValue()
	{
		return (long)doubleValue();
	}
	
	@Override
	public int compareTo(Object o)
	{
		if (this.subtract((Rational)o).getNumerator().compareTo(BigInteger.ZERO) > 0)
		{
			return 1;
		}
		else if (this.subtract((Rational)o).getNumerator().compareTo(BigInteger.ZERO) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}