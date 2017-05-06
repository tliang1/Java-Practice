package main;

import java.util.Scanner;

public class RockPaperScissor
{

	public static void main(String[] args)
	{
		int cpuHand = (int)(Math.random() * 3);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper(2): ");
		int hand = input.nextInt();
		
		System.out.print("The computer is ");
		
		switch (cpuHand)
		{
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		}
		
		System.out.print(" You are ");
		
		switch (hand)
		{
		case 0:
			System.out.print("scissor");
			break;
		case 1:
			System.out.print("rock");
			break;
		case 2:
			System.out.print("paper");
			break;
		}
		
		if (hand == cpuHand)
		{
			System.out.println(" too. It is a draw.");
		}
		else if ((hand == 0 && cpuHand == 2) || (hand == 1 && cpuHand == 0) || (hand == 2 && cpuHand == 1))
		{
			System.out.println(". You won.");
		}
		else
		{
			System.out.println(". You lose.");
		}
		
		input.close();
	}

}