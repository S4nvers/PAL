import javax.swing.JFrame;

//Fenster, das absolut nichts kann
public class JFrameTest extends JFrame {

	public JFrameTest(){
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//alternativ setLocation(X,Y);
		setResizable(false);
	}
	
	public static void main(String[] args){
		new JFrameTest();
	}
}
