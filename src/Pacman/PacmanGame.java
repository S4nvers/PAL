package Pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import javax.swing.*;

public class PacmanGame implements KeyListener {

	int keycode;
	public static JFrame gameframe;
	public JPanel map;
	public ImagePanel panelBackground;

	public PacmanGame(){
		new pauMenu();
		gameframe = new JFrame();
		gameframe.setSize(1200,999);
		gameframe.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		gameframe.setLocationRelativeTo(null);
		gameframe.setResizable(true);
		gameframe.setLayout(null);
		gameframe.setTitle("Pacman");
		gameframe.setVisible(true);
		panelBackground = new ImagePanel(new ImageIcon("PacmanMapMitHintergrund.png").getImage());
		gameframe.getContentPane().add(panelBackground);
		gameframe.pack();
		gameframe.addKeyListener(new KeyListener() {
			public void keyPressed(java.awt.event.ActionEvent e) {
		}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
					gameframe.setVisible(false);
					PauseMenu();
				}
			}

			private void PauseMenu() {
				Timer.GameRunning = false;
				pauMenu.pauFrame.setVisible(true);
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}});
	}
	
	public static void main(String[] args) {
		
	}

	public static void gameframe() {
		// TODO Auto-generated method stub
		new PacmanGame();
		gameframe.setSize(1000,1000);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
