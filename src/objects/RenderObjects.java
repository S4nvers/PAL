package objects;

import java.util.HashSet;
import java.util.Set;

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
		Set<RenderObjects> collisionTargets = new HashSet<RenderObjects>();
		if(Collision) {
			for(RenderObjects object : allObjects) {
				if(object != this && object.Collision) {
					collisionTargets.add(object);
				}
			}
			
		}
	}

}
