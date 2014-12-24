package pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pacman implements KeyListener {
	
	Pacman.addKeyListener(new KeyListener() {
		public void keyPressed(java.awt.event.ActionEvent e) {
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			
		}
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			
		}
		
		if (e.getKeyCode() == KeyEvent.VK_UP){
			
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
});
}