package ch.ksimlee.it.PAL;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

//Fenster mit Knopf
public class JFrameTest extends JFrame {
	
	JLabel text;
	JLabel text2;
	JButton button;
	JFrame frame;
	
	public JFrameTest(){
		//Window's Properties
		frame = new JFrame ();
		frame.setVisible(true);
		frame.setSize(1000,600);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setTitle("Rechner");
		
		//Text's Properties
		text = new JLabel ("Hello Warpgate");
		text.setBounds(16, 10, 200, 25);
		frame.add(text);
		text2 = new JLabel("You did it!");
		text2.setBounds(16, 65, 200, 25);
		text2.setVisible(false);
		frame.add(text2);
		
		//Drop Down Box
		String[] calcStrings = {"x+y", "x-y", "x*y", "x/y" };
		JComboBox calcList = new JComboBox(calcStrings);
		calcList.setSelectedIndex(1);
		//calcList.addActionListener(this);
		calcList.setSize(100, 100);
		calcList.setLocation(100, 100);
		frame.add(calcList);
		
		//Button's Properties
		button = new JButton ("Try It!");
		button.setLocation(10, 40);
		button.setSize(new Dimension(100, 25));
		frame.add(button);
		
		//Button's Listener
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
					buttonTryClicked();
			}
			
		});
		
		//Drop's Listener
		calcList.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					JComboBox cb = (JComboBox)e.getSource();
					String calcName = (String)cb.getSelectedItem();
					updateLabel(calcName);
			}
			
		});
		
	}
		
	
	protected void updateLabel(String calcName) {
		text.setText(calcName);
		
	}


	//Button's Action
	public void buttonTryClicked() {
		//JOptionPane.showMessageDialog(null, "Congrats!! You tried!!", "Weeeeh!!", JOptionPane.OK_CANCEL_OPTION);
		text2.setVisible(true);
	}
	
	public static void main(String[] args){
		new JFrameTest();
	}
}
