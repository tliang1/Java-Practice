package main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ReplaceTextRevised
{
	/**
	 * Replaces every occurrence of a given string with another given string in all files in the given directory.
	 * <ul>
	 * 	<li>
	 * 		If the string array's length is not equal to 3, the program exits.
	 * 	</li>
	 * 	<li>
	 * 		If the directory does not exist in the given pathname, the program exits.
	 * 	</li>
	 * </ul>
	 * 
	 * @param args			string array containing the directory pathname, the string being replaced in all files, and the string to replace 
	 * 						the old string in all files in that order
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
	{
		if (args.length != 3)
		{
			System.out.println("Usage: java ReplaceTextRevised dir oldString newString");
			System.exit(0);
		}
		
		File directory = new File(args[0]);
		
		if (!directory.isDirectory())
		{
			System.out.println("The pathname " + args[0] + " is not a directory");
			System.exit(0);
		}
		
		File[] filesInDirectory = directory.listFiles();
		
		for (File file: filesInDirectory)
		{
			String filename = file.getName();
			int fileExtensionIndex = filename.lastIndexOf('.');
			String fileExtension = filename.substring(fileExtensionIndex + 1);
			File oldFile = new File("original." + fileExtension);
			
			file.renameTo(oldFile);
			
			Scanner input = new Scanner(oldFile);
			PrintWriter output = new PrintWriter(file);
			
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
}