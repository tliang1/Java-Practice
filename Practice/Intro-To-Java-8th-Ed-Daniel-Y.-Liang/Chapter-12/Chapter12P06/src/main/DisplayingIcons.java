package main;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Tony Liang
 *
 */
public class DisplayingIcons extends JFrame
{
	private ImageIcon ukIcon = new ImageIcon("images/flags/uk.png");
	private ImageIcon frIcon = new ImageIcon("images/flags/fr.png");
	private ImageIcon norwayIcon = new ImageIcon("images/flags/norway.png");
	private ImageIcon myIcon = new ImageIcon("images/flags/my.png");
	
	public DisplayingIcons()
	{
		setLayout(new GridLayout(2, 2));
		
		JLabel department = new JLabel(ukIcon);
		JLabel school = new JLabel(frIcon);
		JLabel university = new JLabel(norwayIcon);
		JLabel phoneNumber = new JLabel(myIcon);
		
		Border lineBorder = new LineBorder(Color.BLACK, 1);
		
		department.setBorder(lineBorder);
		school.setBorder(lineBorder);
		university.setBorder(lineBorder);
		phoneNumber.setBorder(lineBorder);
		
		add(department);
		add(school);
		add(university);
		add(phoneNumber);
	}
	
	public static void main(String[] args)
	{
		DisplayingIcons frame = new DisplayingIcons();
		frame.setTitle("Exercise12_6");
		frame.setSize(266, 208);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}