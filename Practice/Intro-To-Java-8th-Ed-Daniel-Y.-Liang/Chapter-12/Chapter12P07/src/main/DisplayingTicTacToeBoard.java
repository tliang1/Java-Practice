package main;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * @author Tony Liang
 *
 */
public class DisplayingTicTacToeBoard extends JFrame
{
	private ImageIcon xIcon = new ImageIcon("images/tic_tac_toe/x.png");
	private ImageIcon oIcon = new ImageIcon("images/tic_tac_toe/o.png");
	
	public DisplayingTicTacToeBoard()
	{
		setLayout(new GridLayout(3, 3));
		
		JLabel[] ticTacToeBoard = new JLabel[9];
		
		int randomIcon = 0;
		
		for (JLabel jLabel: ticTacToeBoard)
		{
			randomIcon = (int)(Math.random() * 3);
			
			switch (randomIcon)
			{
			case 0: jLabel = new JLabel(xIcon);
					break;
			case 1: jLabel = new JLabel(oIcon);
					break;
			case 2: jLabel = new JLabel();
					break;
			}
			
			add(jLabel);
		}
	}
	
	public static void main(String[] args)
	{
		DisplayingTicTacToeBoard frame = new DisplayingTicTacToeBoard();
		frame.setTitle("Exercise12_7");
		frame.setSize(248, 190);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}