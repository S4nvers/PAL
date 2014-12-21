package objects;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ch.ksimlee.it.spaceinvaders.log.Log;

public class ImageObjects extends RenderObjects {
	
	private BufferedImage image;
	
	public ImageObjects(int x, int y, boolean collision, String filename) {
		
		super(x,y,collision);
		
		if (filename == null) {
			throw new IllegalArgumentException("The filename may not be null!");
		}
		
		try {
			image = ImageIO.read(new File(filename));
			
		} catch (IOException e) {
			image = null;
			Log.error("Failed to load image: " + filename);
			e.printStackTrace();
		}
	}
	@Override
	public void render(Graphics g) {

		g.drawImage(image, x, y, null);
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}
	@Override
	public int compareTo(RenderObjects o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	

