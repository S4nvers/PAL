package pacman;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ch.ksimlee.it.spaceinvaders.log.Log;

public class pauMenu {
	
	public static JFrame pauFrame;
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
	public pauMenu(){
		panelBackground = new ImagePanel(new ImageIcon("Background_Menu.jpg").getImage());
		
		pauFrame = new JFrame ();
		pauFrame.getContentPane().add(panelBackground);
		pauFrame.pack();
		pauFrame.setSize(1000,599);
		pauFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		pauFrame.setLocationRelativeTo(null);
		pauFrame.setResizable(false);
		pauFrame.setLayout(null);
		pauFrame.setTitle("Menu");
		pauFrame.setVisible(false);
		
		Log.info("Window generated");
		
		//Generating Resume-Button
		playbt = new JButton ("Resume");
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
					buttonTryClicked();
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
					buttonTryClicked();
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
	
	protected void buttonTryClicked() {
		pauFrame.setVisible(false);
		PacmanGame.gameframe.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
