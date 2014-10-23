package Pacman;

import javax.swing.*;

public class TimeDisplay {

public static class JFrameTimeDisplay extends JFrame{



	public static void main(String[] args) {
		while (Timer.GameRunning == true){
			PacmanMain.TimeText = Integer.toString(Timer.TimerTime);
			frame.lbtimer.setText();
		}
	}
}
}

