package main;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Tony Liang
 *
 */
public class UsingTheFlowLayout extends JFrame
{
	public UsingTheFlowLayout()
	{
		setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		for (int button = 1; button < 4; button++)
		{
			p1.add(new JButton("Button " + button));
		}
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		for (int button = 4; button < 7; button++)
		{
			p2.add(new JButton("Button " + button));
		}
		
		add(p1);
		add(p2);
	}
	
	public static void main(String[] args)
	{
		UsingTheFlowLayout frame = new UsingTheFlowLayout();
		frame.setTitle("Exercise12_1");
		frame.setSize(552, 95);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}