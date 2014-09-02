import java.awt.Dimension;

import javax.swing.*;

//Fenster, das absolut nichts kann
public class JFrameTest extends JFrame {
	
	JLabel text;
	JButton button;
	JFrame frame;
	public JFrameTest(){
		//Window's Properties
		frame = new JFrame ();
		frame.setVisible(true);
		frame.setSize(200,150);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setLayout(null);
		
		//Text's Properties
		text = new JLabel ("Hello Warpgate");
		text.setBounds(16, 10, 200, 25);
		frame.add(text);
		
		//Button's Properties
		button = new JButton ("Try It!");
		button.setLocation(10, 40);
		button.setSize(new Dimension(100, 25));
		frame.add(button);
		
	}
	
	public static void main(String[] args){
		new JFrameTest();
	}
}
