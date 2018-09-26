package main;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Tony Liang
 *
 */
public class SwingCommonFeatures extends JFrame
{
	public SwingCommonFeatures()
	{
		setLayout(new GridLayout(2, 3));
		
		JLabel blackLabel = new JLabel("black");
		JLabel blueLabel = new JLabel("blue");
		JLabel cyanLabel = new JLabel("cyan");
		JLabel greenLabel = new JLabel("green");
		JLabel magentaLabel = new JLabel("magenta");
		JLabel orangeLabel = new JLabel("orange");
		
		blackLabel.setBackground(Color.WHITE);
		blueLabel.setBackground(Color.WHITE);
		cyanLabel.setBackground(Color.WHITE);
		greenLabel.setBackground(Color.WHITE);
		magentaLabel.setBackground(Color.WHITE);
		orangeLabel.setBackground(Color.WHITE);
		
		blackLabel.setForeground(Color.BLACK);
		blueLabel.setForeground(Color.BLUE);
		cyanLabel.setForeground(Color.CYAN);
		greenLabel.setForeground(Color.GREEN);
		magentaLabel.setForeground(Color.MAGENTA);
		orangeLabel.setForeground(Color.ORANGE);
		
		Border lineBorder = new LineBorder(Color.YELLOW, 1);
		
		blackLabel.setBorder(lineBorder);
		blueLabel.setBorder(lineBorder);
		cyanLabel.setBorder(lineBorder);
		greenLabel.setBorder(lineBorder);
		magentaLabel.setBorder(lineBorder);
		orangeLabel.setBorder(lineBorder);
		
		Font timesRomanBold = new Font("TimesRoman", Font.BOLD, 20);
		
		blackLabel.setFont(timesRomanBold);
		blueLabel.setFont(timesRomanBold);
		cyanLabel.setFont(timesRomanBold);
		greenLabel.setFont(timesRomanBold);
		magentaLabel.setFont(timesRomanBold);
		orangeLabel.setFont(timesRomanBold);
		
		blackLabel.setToolTipText("black");
		blueLabel.setToolTipText("blue");
		cyanLabel.setToolTipText("cyan");
		greenLabel.setToolTipText("green");
		magentaLabel.setToolTipText("magenta");
		orangeLabel.setToolTipText("orange");
		
		add(blackLabel);
		add(blueLabel);
		add(cyanLabel);
		add(greenLabel);
		add(magentaLabel);
		add(orangeLabel);
	}
	
	public static void main(String[] args)
	{
		SwingCommonFeatures frame = new SwingCommonFeatures();
		frame.setTitle("Exercise12_8");
		frame.setSize(272, 210);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}