package main;

public class Pattern2
{

	public static void main(String[] args)
	{
		final int ROWS = 6;
		
		System.out.println("Pattern II");
		
		for (int row = 1; row <= ROWS; row++)
		{
			for (int column = 1; column <= (ROWS - row + 1); column++)
			{
				System.out.print(column + " ");
			}
			
			System.out.println();
		}
	}

}