package main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class WritingReadingData
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("Exercise9_19.txt");
		PrintWriter output = new PrintWriter(file);
		
		final int NUMBER_OF_INTEGERS = 100;
		
		Random randomInteger = new Random();
		
		for (int count = 0; count < (NUMBER_OF_INTEGERS - 1); count++)
		{
			output.print(randomInteger.nextInt() + " ");
		}
		
		output.println(randomInteger.nextInt());
		output.close();
		
		Scanner input = new Scanner(file);
		
		int[] integers = new int[NUMBER_OF_INTEGERS];
		int count = 0;
		
		while (input.hasNext() && (count < NUMBER_OF_INTEGERS))
		{
			integers[count] = input.nextInt();
			count++;
		}
		
		input.close();
		
		Arrays.sort(integers);
		
		System.out.print("The sorted integers are:");
		
		for (int integer : integers)
		{
			System.out.print(" " + integer);
		}
		
		System.out.println(".");
	}
}