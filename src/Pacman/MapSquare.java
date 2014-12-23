package Pacman;

import java.awt.*;

public class MapSquare {
	int X;
	int Y;
	int W;
	int H;
	
	public static void MapSquare (int x, int y, int w, int h, Graphics g){
		g.setColor(Color.red);
		g.fillRect( x, y, w, h);
	}

}
