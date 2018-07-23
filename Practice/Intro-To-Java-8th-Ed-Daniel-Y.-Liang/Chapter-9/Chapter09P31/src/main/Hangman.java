package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class Hangman
{
	public static void main(String[] args)
	{
		String[] words = {"write", "that", "snitch", "sincerity", "clamber", "bungalow", "stockpile", "godfather", "airline", "volleyball"};
		
		Random random = new Random();
		
		Scanner input = new Scanner(System.in);
		
		boolean isPlaying = true;
		
		while (isPlaying)
		{
			String word = words[random.nextInt(words.length)];
			
			char[] characters = word.toCharArray();
			Arrays.fill(characters, '*');
			
			StringBuilder guessString = new StringBuilder(String.valueOf(characters));
			
			int misses = 0;
			
			while (guessString.indexOf("*") != -1)
			{
				System.out.print("(Guess) Enter a letter in word " + guessString.toString() + " > ");
				char letter = input.next().charAt(0);
				
				if (word.indexOf(letter) == -1)
				{
					misses++;
					System.out.println(letter + " is not in the word");
				}
				else
				{
					if (guessString.indexOf(String.valueOf(letter)) != -1)
					{
						System.out.println(letter + " is already in the word");
					}
					else
					{
						int beginningIndex = word.indexOf(letter);
						int endingIndex = (word.lastIndexOf(letter) > beginningIndex) ? (word.lastIndexOf(letter) + 1) : guessString.length();
						
						for (int character = beginningIndex; character < endingIndex; character++)
						{
							if ((letter == word.charAt(character)) && (guessString.charAt(character) == '*'))
							{
								guessString.setCharAt(character, letter);
							}
						}
					}
				}
			}
			
			System.out.print("The word is " + word + ". You missed " + misses);
			
			if (misses > 1)
			{
				System.out.println(" times");
			}
			else
			{
				System.out.println(" time");
			}
			
			char continuePlaying = '\u0000';
			
			while ((continuePlaying != 'y') && (continuePlaying != 'n'))
			{
				System.out.print("Do you want to guess for another word? Enter y or n> ");
				continuePlaying = input.next().charAt(0);
			}
			
			if (continuePlaying == 'n')
			{
				isPlaying = false;
			}
		}
		
		input.close();
	}
}