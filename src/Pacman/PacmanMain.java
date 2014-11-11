package Pacman;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

//import ch.ksimlee.it.PAL.ActionEvent;
import ch.ksimlee.it.spaceinvaders.log.Log;

public class PacmanMain {
	public static String TimeText = "0";
	public static String levelText = "1";
	public static String ModiText = "0";
	
	public static JFrame frame;
	public ImagePanel panelBackground;
	Container background;
	public static JLabel lbtimer;
	public static JLabel lblevel;
	public static JLabel lbmodi;
	JButton playbt;
	
	
	
	//Generating window Menu
	public PacmanMain(){
		panelBackground = new ImagePanel(new ImageIcon("Background_Menu.jpg").getImage());
		
		frame = new JFrame ();
		frame.getContentPane().add(panelBackground);
		frame.pack();
		frame.setSize(1000,599);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setTitle("Menu");
		frame.setVisible(true);
		
		Log.info("Window generated");
		
		//Generating TimerLabel
		lbtimer = new JLabel ();
		lbtimer.setBounds(16, 10, 200, 25);
		lbtimer.setText(TimeText);
		lbtimer.setForeground(Color.red);
		lbtimer.setVisible(true);
		frame.add(lbtimer);
		
		Log.info("Label Timer added");
		
		//Generating LevelLabel
		lblevel = new JLabel ();
		lblevel.setBounds(160,10,200,25);
		lblevel.setText(levelText);
		lblevel.setForeground(Color.red);
		lblevel.setVisible(true);
		frame.add(lblevel);
		
		//Generating ModiLabel
		lbmodi = new JLabel ();
		lbmodi.setBounds(304, 10, 200, 25);
		lbmodi.setText(ModiText);
		lbmodi.setForeground(Color.red);
		lbmodi.setVisible(true);
		frame.add(lbmodi);
		
		
		//Generating Play-Button
		playbt = new JButton ("Play");
		playbt.setLocation(10,300);
		playbt.setSize(new Dimension(100, 25));
		playbt.addActionListener(new ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
					buttonTryClicked();
			}
			
		});
		frame.add(playbt);

	}
	public static void main(String[] args) {
		new PacmanMain();
		frame.setSize(1000,600);
		new Timer();
		//new Button(test, "Play", 10, 300, 100, 25);

	}
	public void buttonTryClicked() {
		PacmanGame.gameframe();
		frame.setVisible(false);
		//JOptionPane.showMessageDialog(null, "Congrats!! You tried!!", "Weeeeh!!", JOptionPane.OK_CANCEL_OPTION);
		//Timer.TimerTime = 0;
	}
}

//Java Anleitung http://www.java-forum.org/awt-swing-javafx-and-swt/104286-hintergrundbild-jframe.html
