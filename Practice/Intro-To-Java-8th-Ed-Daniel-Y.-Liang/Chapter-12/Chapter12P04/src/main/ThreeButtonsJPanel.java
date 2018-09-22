package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Tony Liang
 *
 */
public class ThreeButtonsJPanel extends JPanel
{
	/**
	 * Creates a new default ThreeButtonsJPanel with three buttons.
	 */
	public ThreeButtonsJPanel()
	{
		this("Button 1", "Button 2", "Button 3");
	}
	
	/**
	 * Creates a new ThreeButtonsJPanel with three buttons given the name for each button.
	 * 
	 * @param firstButton	first button's name
	 * @param secondButton	second button's name
	 * @param thirdButton	third button's name
	 */
	public ThreeButtonsJPanel(String firstButton, String secondButton, String thirdButton)
	{
		setLayout(new GridLayout(1, 3, 5, 0));
		
		add(new JButton(firstButton));
		add(new JButton(secondButton));
		add(new JButton(thirdButton));
	}
}