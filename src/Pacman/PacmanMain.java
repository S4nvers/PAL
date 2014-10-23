package Pacman;
import java.awt.*;
import javax.swing.*;

public class PacmanMain {
	public static String TimeText;
	
	public static JFrame frame;
	public JPanel panel;
	Container background;
	public JLabel lbtimer;
	
	
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
	
		//background = frame.getBackground();
		
		frame.add(frame);
	}
	public static void main(String[] args) {
		new PacmanMain();
		new Timer();
	}

}

//Java Anleitung http://www.java-forum.org/awt-swing-javafx-and-swt/104286-hintergrundbild-jframe.html
