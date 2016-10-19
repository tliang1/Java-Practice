package main;

import java.util.Scanner;

public class CountdownMessages
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int seconds = 0;
		
		while (seconds < 1)
		{
			System.out.print("Enter the number of seconds (Must be a nonzero positive integer): ");
			seconds = input.nextInt();
		}
		
		long countDownSeconds = 0;
		long startTime = (System.currentTimeMillis() / 1000);
		long elapsedTime = startTime;
		
		while (elapsedTime < (startTime + seconds))
		{	
			if ((System.currentTimeMillis() / 1000) >= (elapsedTime + 1))
			{
				elapsedTime = (System.currentTimeMillis() / 1000);
				
				countDownSeconds = (startTime + seconds) - elapsedTime;
				
				System.out.print(countDownSeconds);
				
				if (countDownSeconds < 2)
				{
					System.out.println(" second remaining");
				}
				else
				{
					System.out.println(" seconds remaining");
				}
			}
		}
		
		System.out.println("Stopped");
		
		input.close();
	}

}