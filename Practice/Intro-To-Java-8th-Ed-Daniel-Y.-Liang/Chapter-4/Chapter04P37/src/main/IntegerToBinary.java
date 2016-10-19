package main;

import java.util.Scanner;

public class IntegerToBinary
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int decimal = -1;
		
		while (decimal < 0)
		{
			System.out.print("Enter an integer (Must be positive): ");
			decimal = input.nextInt();
		}
		
		System.out.print("The binary representation of " + decimal + " is ");
		
		if (decimal == 0)
		{
			System.out.println("0");
		}
		else
		{
			String binaryRepresentation = "";
			int count = 0;
			
			// Repeated division by 2 method to get the binary representation
			while ((decimal > 0) || (count % 4 != 0) || count == 0)
			{
				binaryRepresentation = (decimal % 2) + binaryRepresentation;
				decimal /= 2;
				count++;
			}
			
			System.out.println(binaryRepresentation);
		}
		
		input.close();
	}

}