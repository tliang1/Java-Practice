package main;

public class Pattern4
{

	public static void main(String[] args)
	{
		final int ROWS = 6;
		
		System.out.println("Pattern IV");
		
		for (int row = 1; row <= ROWS; row++)
		{
			for (int spacing = row; spacing > 1; spacing--)
			{
				System.out.print("  ");
			}
			
			for (int column = 1; column <= (ROWS - row + 1); column++)
			{
				System.out.print(column + " ");
			}
			
			System.out.println();
		}
	}

}