package main;

import java.io.File;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ProcessScoresInATextFile
{
	/**
	 * Displays the sum and average of all scores in the given text file.
	 * <ul>
	 * 	<li>
	 * 		If the string array's length is not equal to 1, the program exits.
	 * 	</li>
	 * 	<li>
	 * 		If the text file does not exist in the given pathname, the program exits.
	 * 	</li>
	 * 	<li>
	 * 		The scores must be separated by blanks.
	 * 	</li>
	 * </ul>
	 * @param args			string array of one text file pathname
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java ProcessScoresInATextFile <filename>.txt");
			System.exit(0);
		}
		
		File file = new File(args[0]);
		
		if (!file.exists())
		{
			System.out.println("File does not exists");
			System.exit(0);
		}
		
		Scanner input = new Scanner(file);
		
		double total = 0.0, average = 0.0;
		int numberOfScores = 0;
		
		while (input.hasNext())
		{	
			String currentScore = input.next();
			
			if (currentScore.matches("(\\d+|\\d+\\.\\d+)"))
			{
				numberOfScores++;
				total += Double.parseDouble(currentScore);
			}
		}
		
		input.close();
		
		if (numberOfScores > 0)
		{
			average = total / numberOfScores;
		}
		
		System.out.println("The sum of all scores is " + total + ".");
		System.out.println("The average of all scores is " + average + ".");
	}
}