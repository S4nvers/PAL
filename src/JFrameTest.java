import javax.swing.*;

//Fenster, das absolut nichts kann
public class JFrameTest extends JFrame {
	JLabel text;
	JButton button;
	public JFrameTest(){
		//Window's Properties
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//alternativ setLocation(X,Y);
		setResizable(false);
		
		//Text's Properties
		text = new JLabel ("Hello Warpgate");
		text.setLocation(10, 10);
		add(text);
		
		//Button's Properties
		button = new JButton ("Try It!");
		button.setBounds(10, 10, 100, 25);
		add(button);
		
	}
	
	public static void main(String[] args){
		new JFrameTest();
	}
}
