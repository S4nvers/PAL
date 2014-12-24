package pacman;
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
	static JButton playbt;
	static JButton optbt;
	static JButton extbt;
	Font font = new Font("Arial Black", Font.BOLD, 21);
	
	
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
		panelBackground.add(lbtimer);
		
		Log.info("Label Timer added");
		
		//Generating LevelLabel
		lblevel = new JLabel ();
		lblevel.setBounds(160,10,200,25);
		lblevel.setText(levelText);
		lblevel.setForeground(Color.red);
		lblevel.setVisible(true);
		panelBackground.add(lblevel);
		
		//Generating ModiLabel
		lbmodi = new JLabel ();
		lbmodi.setBounds(304, 10, 200, 25);
		lbmodi.setText(ModiText);
		lbmodi.setForeground(Color.red);
		lbmodi.setVisible(true);
		panelBackground.add(lbmodi);
		
		
		//Generating Play-Button
		playbt = new JButton ("Play");
		playbt.setLocation(400,50);
		playbt.setSize(new Dimension(200, 60));
		playbt.setOpaque(false);
		playbt.setContentAreaFilled(false);
		playbt.setBorderPainted(false);
		playbt.setFont(font);
		playbt.setForeground(Color.YELLOW);
		
		playbt.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        playbt.setForeground(Color.RED);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        playbt.setForeground(Color.YELLOW);
		    }
		});
		
		playbt.addActionListener(new ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
					buttonPlayClicked();
			}
			
		});
		panelBackground.add(playbt);
		
		//Generating Options-Button
		optbt = new JButton ("Options");
		optbt.setLocation(400,125);
		optbt.setSize(new Dimension(200, 60));
		optbt.setOpaque(false);
		optbt.setContentAreaFilled(false);
		optbt.setBorderPainted(false);
		optbt.setFont(font);
		optbt.setForeground(Color.YELLOW);
		
		optbt.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	optbt.setForeground(Color.RED);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	optbt.setForeground(Color.YELLOW);
		    }
		});
		
		optbt.addActionListener(new ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
					buttonOptClicked();
			}
			
		});
		panelBackground.add(optbt);
		
		//Generating Exit-Button
		extbt = new JButton ("Exit");
		extbt.setLocation(400,450);
		extbt.setSize(new Dimension(200, 60));
		extbt.setOpaque(false);
		extbt.setContentAreaFilled(false);
		extbt.setBorderPainted(false);
		extbt.setFont(font);
		extbt.setForeground(Color.YELLOW);
		
		extbt.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	extbt.setForeground(Color.RED);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	extbt.setForeground(Color.YELLOW);
		    }
		});
		
		extbt.addActionListener(new ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
			}
			
		});
		panelBackground.add(extbt);
	}
	public static void main(String[] args) {
		new PacmanMain();
		new Sound(Sound.Music).play();
		frame.setSize(1000,600);
		new Timer();


	}
	public void buttonPlayClicked() {
		PacmanGame.gameframe();
		Timer.GameRunning = true;
		frame.setVisible(false);
	}
	
	public void buttonOptClicked() {
		//options-button
	}
}

//Java Anleitung http://www.java-forum.org/awt-swing-javafx-and-swt/104286-hintergrundbild-jframe.html
