package Pacman;

import java.awt.*;

public class MapSquare {
	int x;
	int y;
	int w;
	int h;
	
	public MapSquare (int x, int y, int w, int h, Graphics g){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		g.setColor(Color.red);
		g.fillRect( x, y, w, h );
	}
}
