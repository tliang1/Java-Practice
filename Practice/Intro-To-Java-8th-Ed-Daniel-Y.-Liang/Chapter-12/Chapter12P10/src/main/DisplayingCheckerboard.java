package main;

import java.awt.*;

import javax.swing.*;

/**
 * @author Tony Liang
 *
 */
public class DisplayingCheckerboard extends JFrame
{
	public DisplayingCheckerboard()
	{
		setLayout(new GridLayout(8, 8));
		
		JButton[][] checkerboard = new JButton[8][8];
		
		for (int row = 0; row < checkerboard.length; row++)
		{
			for (int col = 0; col < checkerboard[row].length; col++)
			{
				checkerboard[row][col] = new JButton();
				
				if ((((row % 2) == 0) && ((col % 2) == 0)) || (((row % 2) != 0) && ((col % 2) != 0)))
				{
					checkerboard[row][col].setBackground(Color.WHITE);
				}
				else
				{
					checkerboard[row][col].setBackground(Color.BLACK);
				}
				
				add(checkerboard[row][col]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		DisplayingCheckerboard frame = new DisplayingCheckerboard();
		frame.setTitle("Exercise12_10");
		frame.setSize(256, 256);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}