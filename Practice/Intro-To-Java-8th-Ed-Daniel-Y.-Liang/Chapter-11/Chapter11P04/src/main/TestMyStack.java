package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TestMyStack
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> strings = new MyStack();
		
		final int NUMBER_OF_STRINGS = 5;
		int count = 0;
		
		if (strings instanceof MyStack)
		{
			while (count < NUMBER_OF_STRINGS)
			{
				System.out.print("Enter a string: ");
				String string = input.next();
				
				((MyStack)strings).push(string);
				count++;
			}
			
			input.close();
			
			while (!strings.isEmpty())
			{
				System.out.print(((MyStack)strings).pop() + " ");
			}
			
			System.out.println();
		}
	}
}