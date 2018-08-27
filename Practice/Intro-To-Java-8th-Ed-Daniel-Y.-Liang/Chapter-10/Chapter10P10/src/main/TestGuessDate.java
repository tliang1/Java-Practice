package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TestGuessDate
{
	public static void main(String[] args)
	{
		int date = 0;
		int answer;
		
		Scanner input = new Scanner(System.in);
		
		for (int set = 1; set <= 5; set++) 
		{
			System.out.println("Is your birthday in Set" + set + "?");
			
			for (int row = 0; row < 4; row++)
			{
				for (int col = 0; col < 4; col++)
				{
					System.out.print(GuessDate.getValue(set, row, col) + " ");
				}
				
				System.out.println();
			}
			
			System.out.print("Enter 0 for No and 1 for Yes: ");
			answer = input.nextInt();
			
			if (answer == 1)
			{
				date += GuessDate.getValue(set, 0, 0);
			}
			
			System.out.println();
		}
		
		input.close();
		
		System.out.println("Your birthday is " + date);
	}
}