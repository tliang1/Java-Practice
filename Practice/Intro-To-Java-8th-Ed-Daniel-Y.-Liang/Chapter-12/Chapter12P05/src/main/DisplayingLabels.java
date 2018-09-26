package main;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Tony Liang
 *
 */
public class DisplayingLabels extends JFrame
{
	public DisplayingLabels()
	{
		setLayout(new GridLayout(4, 1));
		
		JLabel department = new JLabel("Department of Computer Science");
		JLabel school = new JLabel("School of Computing");
		JLabel university = new JLabel("Armstrong Atlantic State University");
		JLabel phoneNumber = new JLabel("Tel: (912) 921-6440");
		
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
		DisplayingLabels frame = new DisplayingLabels();
		frame.setTitle("Exercise12_5");
		frame.setSize(248, 120);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}