package main;

public class IntegerPatternPyramid
{

	public static void main(String[] args)
	{
		final int LINES = 8;
		
		for (int row = 1; row <= LINES; row++)
		{
			for (int spacing = row; spacing < LINES; spacing++)
			{
				System.out.printf("%4s", "");
			}
			
			int number = 0;
			
			for (int column = 1; column <= row; column++)
			{
				number = (int)(Math.pow(2, column - 1));
				
				System.out.printf("%4d", number);
			}
			
			for (int column = row - 1; column >= 1; column--)
			{
				number = (int)(Math.pow(2, column - 1));
				
				System.out.printf("%4d", number);
			}
			
			System.out.println();
		}
	}

}