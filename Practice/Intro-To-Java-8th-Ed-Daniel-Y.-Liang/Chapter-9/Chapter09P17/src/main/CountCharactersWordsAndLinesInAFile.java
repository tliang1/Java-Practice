package main;

import java.io.File;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class CountCharactersWordsAndLinesInAFile
{
	/**
	 * Counts and displays the number of characters (excluding any whitespace characters), words (alphanumeric only), and lines in the given 
	 * file.
	 * <ul>
	 * 	<li>
	 * 		If the string array's length is not equal to 1, the program exits.
	 * 	</li>
	 * 	<li>
	 * 		If the file does not exist in the given pathname, the program exits.
	 * 	</li>
	 * </ul>
	 * 
	 * @param args			string array of one file pathname
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java CountCharactersWordsAndLinesInAFile <filename>.extension");
			System.exit(0);
		}
		
		File file = new File(args[0]);
		
		if (!file.exists())
		{
			System.out.println("File does not exists");
			System.exit(0);
		}
		
		Scanner input = new Scanner(file);
		
		int charactersCount = 0, wordsCount = 0, linesCount = 0;
		
		while (input.hasNext())
		{
			String string = input.nextLine().trim();
			linesCount++;
			
			for (int index = 0; index < string.length(); index++)
			{
				char character = string.charAt(index);
				
				if ((character != '\r') && (character != '\n') && (character != ' ') && (character != '\t') && (character != '\f') && 
						(character != '\u2B7F'))
				{
					charactersCount++;
				}
			}
			
			if ((string.length() > 0) && (string.matches(".*\\w+.*")))
			{
				String[] words = string.split("\\W+");
				
				for (String word : words)
				{
					if (word.length() > 0)
					{
						wordsCount++;
					}
				}
			}
		}
		
		input.close();
		
		System.out.println("File " + file.getName() + " has");
		System.out.println(charactersCount + " characters");
		System.out.println(wordsCount + " words");
		System.out.println(linesCount + " lines");
	}
}