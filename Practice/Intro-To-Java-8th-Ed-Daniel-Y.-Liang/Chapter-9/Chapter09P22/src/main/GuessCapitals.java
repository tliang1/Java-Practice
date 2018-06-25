package main;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Tony Liang
 *
 */
public class GuessCapitals
{
	public static void main(String[] args)
	{
		String[][] statesAndCapitals = 
			{
				{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"}, {"Arkansas", "Little Rock"}, 
				{"California", "Sacramento"}, {"Colorado", "Denver"}, {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, 
				{"Florida", "Tallahassee"}, {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"}, {"Illinois", "Springfield"}, 
				{"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"}, 
				{"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"}, 
				{"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, 
				{"Montana", "Helena"}, {"Nebraska", "Lincoln"}, {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, 
				{"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"}, 
				{"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, 
				{"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
				{"Tennessee", "Nashville"}, {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, 
				{"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, 
				{"Wyoming", "Cheyenne"}
			};
		final int NUMBER_OF_QUESTIONS = 10;
		int currentQuestion = 0;
		int correctCount = 0;
		
		shuffleRows(statesAndCapitals, 0, NUMBER_OF_QUESTIONS);
		
		while (currentQuestion < NUMBER_OF_QUESTIONS)
		{
			String answer = JOptionPane.showInputDialog(null, "What is the capital of " + statesAndCapitals[currentQuestion][0] + "?", 
					"Input", JOptionPane.QUESTION_MESSAGE);
			
			if (answer == null)
			{
				System.exit(0);
			}
			
			if (answer.trim().equalsIgnoreCase(statesAndCapitals[currentQuestion][1]))
			{
				JOptionPane.showMessageDialog(null, "Your answer is correct", "Message", JOptionPane.INFORMATION_MESSAGE);
				correctCount++;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your answer is incorrect", "Message", JOptionPane.INFORMATION_MESSAGE);
			}
			
			currentQuestion++;
		}
		
		JOptionPane.showMessageDialog(null, "You answered " + correctCount + " questions correctly", "Message", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Shuffles the rows between the given start row (inclusive) and the given end row (exclusive) of the given two-dimensional string array.
	 * <ul>
	 * 	<li>
	 * 		If the start row is negative, greater than or equal to the end row, or greater than or equal to the array's length, no shuffling 
	 * 		occurs.
	 * 	</li>
	 * 	<li>
	 * 		If the end row is greater than the array's length, no shuffling occurs.
	 * 	</li>
	 * </ul>
	 * 
	 * @param array		two-dimensional string array
	 * @param startRow	start row
	 * @param endRow	end row
	 */
	public static void shuffleRows(String[][] array, int startRow, int endRow)
	{
		if ((startRow >= 0) && (startRow < endRow) && (startRow < array.length) && (endRow <= array.length))
		{
			Random random = new Random();
			
			for (int index = startRow; index < endRow; index++)
			{
				int randomIndex = random.nextInt(array.length);
				
				while (randomIndex == index)
				{
					randomIndex = random.nextInt(array.length);
				}
				
				String[] temp = array[index];
				array[index] = array[randomIndex];
				array[randomIndex] = temp;
			}
		}
	}
}