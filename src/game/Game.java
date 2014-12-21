package game;

import java.util.HashSet;
import java.util.Set;

import ch.ksimlee.it.spaceinvaders.log.Log;
import objects.RenderObjects;
import objects.Pacman;

import objects.RenderObjects;

public class Game implements Runnable {

	private static final int ACTIONS_PER_SECOND = 30;
	
	private final Set<RenderObjects> objectsToRender = new HashSet<RenderObjects>();

	private final Set<RenderObjects> objectsToAdd = new HashSet<RenderObjects>();

	public Set<RenderObjects> getObjectsToAdd() {
		return objectsToAdd;
	}

	public Set<RenderObjects> getObjectsToRemove() {
		return objectsToRemove;
	}

	private final Set<RenderObjects> objectsToRemove = new HashSet<RenderObjects>();

	
	/** The handler that should receive the user input. */
	private final InputHandler inputHandler = new InputHandler();
	
	private final Pacman pacman;
	
	public Game() {
		
		Log.info("Starting a game with " + ACTIONS_PER_SECOND + " actions/second.");
		pacman = new Pacman(200,200);
		
		objectsToRender.add(pacman);
	}
	
	@Override
	public void run() {
		
		while (true) {
			// This loop goes forever, since we don't want our game
			// logic to stop.
			
			// TODO: Add game mechanics here.
			
			// Update all game objects.
			for (RenderObjects object : objectsToRender) {
				object.update(this);
			}
			
			objectsToRender.removeAll(objectsToRemove);
			objectsToRender.addAll(objectsToAdd);
			
			objectsToAdd.clear();
			objectsToRemove.clear();
			
			// Update the input state.
			inputHandler.updatedReleasedKeys();
			
			// Delay the next action (iteration of the loop).
			try {
				Thread.sleep((long) (1000.0f/ACTIONS_PER_SECOND));
				
			} catch (InterruptedException e) {
				// We were interrupted, exit the game loop.
				
				Log.error("Caught interruption exception, exiting game loop.");
				e.printStackTrace();
				break;
			}
			
		}
		
	}
	
	public Set<RenderObjects> getObjectsToRender() {
		return objectsToRender;
	}

	public InputHandler getInputHandler() {
		return inputHandler;
	}
}


