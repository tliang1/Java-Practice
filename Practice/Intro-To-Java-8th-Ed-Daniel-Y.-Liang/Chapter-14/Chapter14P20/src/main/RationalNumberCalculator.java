package main;

import java.math.BigInteger;

/**
 * @author Tony Liang
 *
 */
public class RationalNumberCalculator
{
	public static void main(String[] args)
	{
		// Check number of strings passed
		if (args.length != 3)
		{
			System.out.println("Usage: java RationalNumberCalculator operand1 operator operand2");
			System.exit(0);
		}
		
		if (!args[0].matches("\\d+(\\/\\d+)?"))
		{
			System.out.println("Wrong Input: " + args[0]);
		}
		else if (!args[2].matches("\\d+(\\/\\d+)?"))
		{
			System.out.println("Wrong Input: " + args[2]);
		}
		else
		{
			String[] rational1 = args[0].split("\\/");
			String[] rational2 = args[2].split("\\/");
			
			Rational operand1 = new Rational(new BigInteger(rational1[0]), new BigInteger(rational1[1]));
			Rational operand2 = new Rational(new BigInteger(rational2[0]), new BigInteger(rational2[1]));
			
			// The result of the operation
			Rational result = new Rational();
			
			// Determine the operator
			switch (args[1].charAt(0))
			{
			case '+':
				result = operand1.add(operand2);
				break;
			case '-':
				result = operand1.subtract(operand2);
				break;
			case '*':
				result = operand1.multiply(operand2);
				break;
			case '/':
				result = operand1.divide(operand2);
			}
			
			// Display result
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]+ " = " + result);
		}
	}
}