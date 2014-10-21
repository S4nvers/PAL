package Pacman;
import java.awt.*;
import javax.swing.*;

public class PacmanMain {
	JFrame frame;
	JPanel panel;
	Container background;
	
	public PacmanMain(){
		frame = new JFrame ();
		frame.setSize(1000,600);
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setTitle("Menu");
		frame.setVisible(true);
	
		//background = frame.getBackground();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PacmanMain();
	}

}

//Java Anleitung http://www.java-forum.org/awt-swing-javafx-and-swt/104286-hintergrundbild-jframe.html
