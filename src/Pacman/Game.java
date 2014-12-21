package Pacman;

import java.util.HashSet;
import java.util.Set;

import InputHandler;
import ch.ksimlee.it.spaceinvaders.log.Log;
import objects.RenderObject;
import objects.Pacman;

import objects.RenderObjects;

public class Game implements Runnable {

	private static final int ACTIONS_PER_SECOND = 30;
	
	private final Set<RenderObject> objectsToRender = new HashSet<RenderObject>();

	private final Set<RenderObject> objectsToAdd = new HashSet<RenderObject>();

	public Set<RenderObject> getObjectsToAdd() {
		return objectsToAdd;
	}

	public Set<RenderObject> getObjectsToRemove() {
		return objectsToRemove;
	}

	private final Set<RenderObject> objectsToRemove = new HashSet<RenderObject>();

	
	/** The handler that should receive the user input. */
	private final InputHandler inputHandler = new InputHandler();
	
	private final Pacman Pacman;
	
	public Game() {
		
		Log.info("Starting a game with " + ACTIONS_PER_SECOND + " actions/second.");
		pacman = new Pacman(200,200);
		
		objectsToRender.add(spaceship);
	}
}
