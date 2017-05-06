package main;

import java.util.Scanner;

public class HeadOrTail
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int coin = (int) (Math.random() * 2);
		
		System.out.print("Head or tail?(Enter 0 for head or 1 for tail): ");
		int guess = input.nextInt();
		
		if (guess == 0)
		{
			System.out.print("Head");
		}
		else
		{
			System.out.print("Tail");
		}
		
		if (guess == coin)
		{
			System.out.println(" is correct!");
		}
		else
		{
			System.out.println(" is incorrect!");
		}
		
		input.close();
	}

}