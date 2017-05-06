package main;

public class ASCIITable
{

	public static void main(String[] args)
	{
		final int REMAINDER = '!' % 10;
		
		for (char character = '!'; character <= '~'; character++)
		{
			if ((character != '!') && (character % 10 == REMAINDER))
			{
				System.out.println();
			}
			
			System.out.print(character + " ");
		}
		
		System.out.println();
	}

}