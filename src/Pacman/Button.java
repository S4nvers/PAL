package Pacman;

import java.awt.Dimension;

import javax.swing.*;

public class Button {

	public Button(String string, String string2, int i, int j, int k, int l) {		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void button(JButton name, String text, int sizex, int sizey, int x, int y) {
		name = new JButton(text);
		name.setLocation(sizex,sizey);
		name.setSize(new Dimension(x, y));
		PacmanMain.frame.add(name);
		

	}

}
