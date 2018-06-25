package main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class RemoveText
{
	/**
	 * Removes every occurrence of the given string in the given file.
	 * <ul>
	 * 	<li>
	 * 		If the string array's length is not equal to 2, the program exits.
	 * 	</li>
	 * 	<li>
	 * 		If the file does not exist in the given pathname, the program exits.
	 * 	</li>
	 * </ul>
	 * 
	 * @param args			string array containing the string being removed in the file and the file pathname in that order
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
	{
		if (args.length != 2)
		{
			System.out.println("Usage: java RemoveText string filename");
			System.exit(0);
		}
		
		File file = new File(args[1]);
		
		if (!file.exists())
		{
			System.out.println("File " + args[1] + " does not exist");
			System.exit(0);
		}
		
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
			String s2 = s1.replaceAll(args[0], "");
			output.println(s2);
		}
		
		input.close();
		output.close();
		
		oldFile.delete();
	}
}