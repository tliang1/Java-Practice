package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class BeanMachine
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		
		while (numberOfBalls < 0)
		{
			System.out.print("Enter the number of balls to drop (Must be positive): ");
			numberOfBalls = input.nextInt();
		}
		
		System.out.print("Enter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();
		
		while (numberOfSlots < 1)
		{
			System.out.print("Enter the number of slots in the bean machine (Must be nonzero positive): ");
			numberOfSlots = input.nextInt();
		}
		
		int[] slots = new int[numberOfSlots];
		int mostBalls = 0;
		
		for (int ball = 0; ball < numberOfBalls; ball++)
		{
			int currentSlot = 0;
			
			for (int row = 0; row < (numberOfSlots - 1); row++)
			{
				int fallingDirection = (int) (Math.random() * 2);
				
				if (fallingDirection == 0)
				{
					System.out.print("L");
				}
				else
				{
					System.out.print("R");
					currentSlot++;
				}
				
				if (row == (numberOfSlots - 2))
				{
					System.out.println();
				}
			}
			
			slots[currentSlot]++;
			
			if (slots[currentSlot] > mostBalls)
			{
				mostBalls = slots[currentSlot];
			}
		}
		
		System.out.println();
		
		for (int ball = mostBalls; ball > 0; ball--)
		{
			for (int slot = 0; slot < slots.length; slot++)
			{
				if (slots[slot] >= ball)
				{
					System.out.print("O");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		for (int column = 0; column < numberOfSlots; column++)
		{
			System.out.print("-");
		}
		
		System.out.println();
		
		input.close();
	}
}