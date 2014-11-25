package Pacman;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Loading extends JFrame {

	public static JFrame Load;
 
    public Loading() {
    	Load = new JFrame ();
    	Load.pack();
    	Load.setSize(1000,599);
    	Load.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    	Load.setLocationRelativeTo(null);
    	Load.setResizable(false);
    	Load.setLayout(null);
    	Load.setVisible(true);
 
        JLabel label = new JLabel(new ImageIcon("giphy.gif"));
        JPanel panel = new JPanel();
        panel.add(label);
        Load.add(panel);
 
        pack();
        setVisible(true);
    }

	public static void Load() {
		new Loading();
		
	}
 


}

 