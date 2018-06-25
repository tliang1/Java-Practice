package main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ReplaceText
{
	/**
	 * Replaces every occurrence of a given string with another given string in the given file.
	 * <ul>
	 * 	<li>
	 * 		If the string array's length is not equal to 3, the program exits.
	 * 	</li>
	 * 	<li>
	 * 		If the file does not exist in the given pathname, the program exits.
	 * 	</li>
	 * </ul>
	 * 
	 * @param args			string array containing the file pathname, the string being replaced in the file, and the string to replace the 
	 * 						old string in the file in that order
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
	{
		if (args.length != 3)
		{
			System.out.println("Usage: java ReplaceText file oldString newString");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		
		if (!sourceFile.exists())
		{
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(0);
		}
		
		String sourceFilename = sourceFile.getName();
		int fileExtensionIndex = sourceFilename.lastIndexOf('.');
		String fileExtension = sourceFilename.substring(fileExtensionIndex + 1);
		File oldFile = new File("original." + fileExtension);
		
		sourceFile.renameTo(oldFile);
		
		Scanner input = new Scanner(oldFile);
		PrintWriter output = new PrintWriter(sourceFile);
		
		while (input.hasNext())
		{
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[1], args[2]);
			output.println(s2);
		}
		
		input.close();
		output.close();
		
		oldFile.delete();
	}
}