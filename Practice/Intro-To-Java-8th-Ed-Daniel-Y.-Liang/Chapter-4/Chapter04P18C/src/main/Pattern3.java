package main;

public class Pattern3
{

	public static void main(String[] args)
	{
		final int ROWS = 6;
		
		System.out.println("Pattern III");
		
		for (int row = 1; row <= ROWS; row++)
		{
			for (int spacing = row; spacing < ROWS; spacing++)
			{
				System.out.print("  ");
			}
			
			for (int column = row; column >= 1; column--)
			{
				System.out.print(column + " ");
			}
			
			System.out.println();
		}
	}

}