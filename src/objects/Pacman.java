package objects;

import java.awt.event.KeyEvent;

import game.Game;
import objects.RenderObjects;

public class Pacman extends ImageObjects{

	private static final String filename = "pacman.png";
	
	private int speed = 10;
	
	public Pacman(int x, int y){
		super(x,y,true,filename);
	}
	
	
	public void update(Game game) {

		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_A) ||
						game.getInputHandler().isKeyPressed(KeyEvent.VK_LEFT)) {
					
					move(-speed, 0, game.getObjectsToRender());
				}
				

		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_D) ||
						game.getInputHandler().isKeyPressed(KeyEvent.VK_RIGHT)) {
					
					move(speed, 0, game.getObjectsToRender());
				}
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_W) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_UP)) {
			move(0, speed, game.getObjectsToRender());
				}
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_S) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_DOWN)) {
			move(0, -speed, game.getObjectsToRender());
		}
	}
}
