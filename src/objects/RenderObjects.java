package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Set;

import ch.ksimlee.it.spaceinvaders.log.Log;
import objects.RenderObjects;
import Pacman.Canvas;

public abstract class RenderObjects implements Comparable<RenderObjects>{
	
	protected boolean Collision = true;
	
	protected int x;
	
	protected int y;
	
	public static boolean BoundingBoxes = true;
	
	
	
	public RenderObjects(int x, int y, boolean Collision) {
		this.x = x;
		this.y = y;
		this.Collision = Collision;
	}
	
	public static void update(Game game) {
		
	}
	
	public RenderObjects move(int dx, int dy, Set<RenderObjects> allObjects){
		RenderObjects collision = null;
		
		Set<RenderObjects> collisionTargets = new HashSet<RenderObjects>();
		
		if(Collision) {
			for(RenderObjects object : allObjects) {
				if(object != this && object.Collision) {
					collisionTargets.add(object);
				}
			}
			// Simple algorithm:
			
				// 1. Calculate the number of movement steps.
				int steps = Math.max(Math.abs(dx), Math.abs(dy));
						
				// Calculate the speed in the two dimensions.
				// This can be fractions, thus we need to use floats.
				float speedX = ((float) dx) / steps;
				float speedY = ((float) dy) / steps;
						
				// As we are working with floats for the speed, we need
				// to use floats for the position too.
				float positionX = this.x;
				float positionY = this.y;
						
				// 2. Move "step by step" into the desired direction.
				for (int step = 0; step < steps; step++) {
							
					// Perform the next step.
					positionX += speedX;
					positionY += speedY;
							
					// Update the position of this object.
					this.x = Math.round(positionX);
					this.y = Math.round(positionY);
							
					// Check if there is a collision now.
					for (RenderObjects object : collisionTargets) {
								
						if (overlapsWithObject(object)) {
							// There is a collision!
							collision = object;
									
							// Exit the loop of checking for collisions directly.
							break;
					}
				}	
			}
		} else {
			this.x += dx;
			this.y += dy;
		}
		
		if (collision != null){
			Log.info("There Was a collision");
		}
		return collision;
	}
	/**
	 * Check if the bounding box of this rectangle overlaps with the bounding
	 * box of another object.
	 * 
	 * @param other
	 *            The other object.
	 * @return True, iff the objects overlap.
	 */
	private boolean overlapsWithObject(RenderObjects other) {
		return (x < other.x + other.getWidth() &&
		        x + getWidth() > other.x &&
		        y < other.y + other.getHeight() &&
		        y + getHeight()  > other.y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		return false;
	}
	
	public int getCenterX() {
		return x + getWidth() / 2;
	}
	
	public int getCenterY() {
		return y + getHeight() / 2;
	}
	
	public abstract int getWidth();
	
	public abstract int getHeight();
	
	/**
	 * Internal function to render objects.
	 * 
	 * @param g
	 *            The graphics context to render on.
	 */
	public final void renderInternal(Graphics g) {

		// Perform the actual rendering.
		render(g);

		// Perform the debug rendering.
		
		if (BoundingBoxes) {

			// Store the current color.
			Color color = g.getColor();

			g.setColor(Color.magenta);
			g.drawRect(x, y, getWidth(), getHeight());

			// Restore the color.
			g.setColor(color);
		}
	}
	
	/**
	 * Render this object on the Canvas' graphic area.
	 * 
	 * @param g
	 *            The graphics object to render itself on.
	 */
	public abstract void render(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
