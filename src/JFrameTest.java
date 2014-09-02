import java.awt.Dimension;
import java.awt.event.*;
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
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setTitle("Rechner");
		
		//Text's Properties
		text = new JLabel ("Hello Warpgate");
		text.setBounds(100, 100, 200, 25);
		frame.add(text);
		
		//Button's Properties
		button = new JButton ("Try It!");
		button.setLocation(10, 10);
		button.setSize(new Dimension(100, 25));
		frame.add(button);
		
		//Button's Listener
		button.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					buttonTryClicked();
				}
			
			});
		}
		
		//Button's Action
		public void buttonTryClicked() {
			JOptionPane.showMessageDialog(null, "Congrats!! You tried!!", "Weeeeh!!", JOptionPane.OK_CANCEL_OPTION);
		}
	
	public static void main(String[] args){
		new JFrameTest();
	}
}
