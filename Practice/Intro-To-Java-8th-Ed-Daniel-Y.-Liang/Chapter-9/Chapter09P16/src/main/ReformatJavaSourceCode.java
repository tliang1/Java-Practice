package main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ReformatJavaSourceCode
{
	/**
	 * Converts the given Java file written in the next-line brace style to the end-of-line brace style.
	 * <ul>
	 * 	<li>
	 * 		If the string array's length is not equal to 1, the program exits.
	 * 	</li>
	 * 	<li>
	 * 		If the Java file does not exist in the given pathname, the program exits.
	 * 	</li>
	 * </ul>
	 * 
	 * @param args			string array of one Java file pathname
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java ReformatJavaSourceCode <filename>.java");
			System.exit(0);
		}
		
		File file = new File(args[0]);
		
		if (!file.exists())
		{
			System.out.println("File does not exists");
			System.exit(0);
		}
		
		File oldFile = new File("original.java");
		
		file.renameTo(oldFile);
		
		Scanner input = new Scanner(oldFile);
		PrintWriter output = new PrintWriter(file);
		
		boolean isFirstLine = true;
		
		while (input.hasNext())
		{
			String string = input.nextLine();
			
			if (isFirstLine)
			{
				isFirstLine = !isFirstLine;
				output.print(string);
			}
			else if (string.matches("\\s*\\{\\s*"))
			{
				output.print(" {");
			}
			else
			{
				output.print("\n" + string);
			}
		}
		
		input.close();
		output.close();
		
		oldFile.delete();
	}
}