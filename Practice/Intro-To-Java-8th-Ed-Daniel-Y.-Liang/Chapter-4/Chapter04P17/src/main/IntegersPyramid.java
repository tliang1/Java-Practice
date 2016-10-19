package main;

import java.util.Scanner;

public class IntegersPyramid
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int lines = 0;
		
		while ((lines < 1) || (lines > 15))
		{
			System.out.print("Enter the number of lines (1-15): ");
			lines = input.nextInt();
		}
		
		for (int row = 1; row <= lines; row++)
		{
			for (int spacing = row; spacing < lines; spacing++)
			{
				if (spacing > 8)
				{
					System.out.print("   ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			for (int column = -row; column <= row; column++)
			{
				if ((column != -1) && (column != 0))
				{
					if (column < 0)
					{
						System.out.print(-column + " ");
					}
					else
					{
						System.out.print(column + " ");
					}
				}
			}
			
			System.out.println();
		}
		
		input.close();
	}

}