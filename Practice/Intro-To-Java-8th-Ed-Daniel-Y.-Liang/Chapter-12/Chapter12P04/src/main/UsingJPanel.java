package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author Tony Liang
 *
 */
public class UsingJPanel extends JFrame
{
	public UsingJPanel()
	{
		setLayout(new BorderLayout());
		
		ThreeButtonsJPanel p1 = new ThreeButtonsJPanel();
		ThreeButtonsJPanel p2 = new ThreeButtonsJPanel("Button 4", "Button 5", "Button 6");
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		UsingJPanel frame = new UsingJPanel();
		frame.setTitle("Exercise12_4");
		frame.setSize(272, 90);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}