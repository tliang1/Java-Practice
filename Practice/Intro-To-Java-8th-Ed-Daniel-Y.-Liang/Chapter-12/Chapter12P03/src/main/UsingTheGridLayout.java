package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Tony Liang
 *
 */
public class UsingTheGridLayout extends JFrame
{
	public UsingTheGridLayout()
	{
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel(new GridLayout(1, 3, 5, 0));
		
		for (int button = 1; button < 4; button++)
		{
			p1.add(new JButton("Button " + button));
		}
		
		JPanel p2 = new JPanel(new GridLayout(1, 3, 5, 0));
		
		for (int button = 4; button < 7; button++)
		{
			p2.add(new JButton("Button " + button));
		}
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		UsingTheGridLayout frame = new UsingTheGridLayout();
		frame.setTitle("Exercise12_3");
		frame.setSize(270, 90);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}