package pacman;
import javax.swing.*;

import java.awt.*;

public class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	
	public ImagePanel(String img) {
		this(new ImageIcon(img).getImage());
	}
	public ImagePanel(Image img) {
	    this.img = img;
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	}

	public void paintComponent(Graphics g) {
	    g.drawImage(img, 0, 0, null);
	    if (Timer.GameRunning == true){
	    	MapSquare.MapSquare(0,0,1000,25,g);
	    	MapSquare.MapSquare(0, 0, 25, 1000, g);
	    }
	}
}
