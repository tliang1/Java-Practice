package main;

import java.util.Scanner;

public class IntegerToHexadecimal
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
		
		System.out.print("The hexadecimal of " + decimal + " is ");
		
		if (decimal == 0)
		{
			System.out.println("0");
		}
		else
		{
			String hexadecimal = "";
			
			// Repeated division by 16 method to get the hexadecimal digits
			while (decimal > 0)
			{
				int hexadecimalDigit = (decimal % 16);
				
				switch (hexadecimalDigit)
				{
				case 10:
					hexadecimal = "A" + hexadecimal;
					break;
				case 11:
					hexadecimal = "B" + hexadecimal;
					break;
				case 12:
					hexadecimal = "C" + hexadecimal;
					break;
				case 13:
					hexadecimal = "D" + hexadecimal;
					break;
				case 14:
					hexadecimal = "E" + hexadecimal;
					break;
				case 15:
					hexadecimal = "F" + hexadecimal;
					break;
				default:
					hexadecimal = hexadecimalDigit + hexadecimal;
					break;	
				}
				
				decimal /= 16;
			}
			
			System.out.println(hexadecimal);
		}
		
		input.close();
	}

}