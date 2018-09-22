package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Tony Liang
 *
 */
public class UsingTheBorderLayout extends JFrame
{
	public UsingTheBorderLayout()
	{
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		
		for (int button = 1; button < 4; button++)
		{
			p1.add(new JButton("Button " + button));
		}
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		
		for (int button = 4; button < 7; button++)
		{
			p2.add(new JButton("Button " + button));
		}
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		UsingTheBorderLayout frame = new UsingTheBorderLayout();
		frame.setTitle("Exercise12_2");
		frame.setSize(292, 125);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}