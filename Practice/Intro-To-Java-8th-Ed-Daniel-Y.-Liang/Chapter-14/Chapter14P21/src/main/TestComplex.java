package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TestComplex
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first complex number: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		System.out.print("Enter the second complex number: ");
		double c = input.nextDouble();
		double d = input.nextDouble();
		
		input.close();
		
		Complex complexNumber1 = new Complex(a, b);
		Complex complexNumber2 = new Complex(c, d);
		
		System.out.println(complexNumber1 + " + " + complexNumber2 + " = " + complexNumber1.add(complexNumber2));
		System.out.println(complexNumber1 + " - " + complexNumber2 + " = " + complexNumber1.subtract(complexNumber2));
		System.out.println(complexNumber1 + " * " + complexNumber2 + " = " + complexNumber1.multiply(complexNumber2));
		System.out.println(complexNumber1 + " / " + complexNumber2 + " = " + complexNumber1.divide(complexNumber2));
		System.out.println("|" + complexNumber1 + "| = " + complexNumber1.abs());
	}
}