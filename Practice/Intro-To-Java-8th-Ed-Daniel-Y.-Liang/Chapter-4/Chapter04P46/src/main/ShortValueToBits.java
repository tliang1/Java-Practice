package main;

import java.util.Scanner;

public class ShortValueToBits
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.print("The bits are ");
		
		int mask = 1;
		
		for (int bitPosition = 15; bitPosition >= 0; bitPosition--) {
			int rightShiftedNumber = number >> bitPosition;
			int bit = rightShiftedNumber & mask; // Get the last bit of the right shifted number
			
			System.out.print(bit);
		}
		
		input.close();
	}

}