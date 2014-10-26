package Pacman;
import java.awt.*;
import javax.swing.*;

import ch.ksimlee.it.spaceinvaders.log.Log;

public class PacmanMain {
	public static String TimeText = "0";
	
	public static JFrame frame;
	public JPanel panel;
	Container background;
	public static JLabel lbtimer;
	
	
	//Generating window Menu
	public PacmanMain(){
		frame = new JFrame ();
		frame.setSize(1000,600);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setTitle("Menu");
		frame.setVisible(true);
		
		Log.info("Window generated");
	
		//background = frame.getBackground();
		
		//Generating TimerLabel
		lbtimer = new JLabel ();
		lbtimer.setBounds(16, 10, 200, 25);
		lbtimer.setText(TimeText);
		lbtimer.setVisible(true);
		frame.add(lbtimer);
		
		Log.info("Label Timer added");
	}
	public static void main(String[] args) {
		new PacmanMain();
		new Timer();
	}

}

//Java Anleitung http://www.java-forum.org/awt-swing-javafx-and-swt/104286-hintergrundbild-jframe.html
