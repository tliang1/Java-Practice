package main;

/**
 * @author Tony Liang
 *
 */
public class CalculatorWithoutExceptionHandler
{
	public static void main(String[] args)
	{
		// Check number of strings passed
		if (args.length != 3)
		{
			System.out.println("Usage: java CalculatorWithoutExceptionHandler operand1 operator operand2");
			System.exit(0);
		}
		
		if (!args[0].matches("\\d+"))
		{
			System.out.println("Wrong Input: " + args[0]);
		}
		else if (!args[2].matches("\\d+"))
		{
			System.out.println("Wrong Input: " + args[2]);
		}
		else
		{
			// The result of the operation
			int result = 0;
			
			// Determine the operator
			switch (args[1].charAt(0))
			{
			case '+':
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-':
				result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case '*':
				result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/':
				result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			}
			
			// Display result
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]+ " = " + result);
		}
	}
}