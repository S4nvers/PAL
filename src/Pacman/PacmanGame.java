package Pacman;

import javax.swing.*;

public class PacmanGame {

	public static JFrame gameframe;
	public JPanel map;

	public PacmanGame(){
		gameframe = new JFrame();
		gameframe.setSize(1000,599);
		gameframe.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		gameframe.setLocationRelativeTo(null);
		gameframe.setResizable(false);
		gameframe.setLayout(null);
		gameframe.setTitle("Pacman");
		gameframe.setVisible(true);
	}
	
	public static void main(String[] args) {
		

	}

	public static void gameframe() {
		// TODO Auto-generated method stub
		new PacmanGame();
		gameframe.setSize(1000,600);
	}

}
