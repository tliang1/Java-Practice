package main;

public class Pattern1
{

	public static void main(String[] args)
	{
		final int ROWS = 6;
		
		System.out.println("Pattern I");
		
		for (int row = 1; row <= ROWS; row++)
		{
			for (int column = 1; column <= row; column++)
			{
				System.out.print(column + " ");
			}
			
			System.out.println();
		}
	}

}