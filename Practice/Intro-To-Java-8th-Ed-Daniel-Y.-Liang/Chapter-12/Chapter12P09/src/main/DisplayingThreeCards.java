package main;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

/**
 * @author Tony Liang
 *
 */
public class DisplayingThreeCards extends JFrame
{
	public DisplayingThreeCards()
	{
		ImageIcon[] cardIcons = new ImageIcon[54];
		
		for (int card = 1; card <= cardIcons.length; card++)
		{
			cardIcons[card - 1] = new ImageIcon("images/cards/" + card + ".png");
		}
		
		setLayout(new GridLayout(1, 3));
		
		ArrayList<Integer> cards = new ArrayList<Integer>();
		
		int randomCard = 0;
		for (int card = 0; card < 3; card++)
		{
			while (((card == 0) && (randomCard == 0)) || ((card > 0) && cards.contains(randomCard)))
			{
				randomCard = (int)(Math.random() * 54) + 1;
			}
			
			cards.add(randomCard);
			
			add(new JLabel(cardIcons[randomCard - 1]));
		}
	}
	
	public static void main(String[] args)
	{
		DisplayingThreeCards frame = new DisplayingThreeCards();
		frame.setTitle("Exercise12_9");
		frame.setSize(538, 294);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}