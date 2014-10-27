package Pacman;

public class GhostModiTimer {
	public static int level = 1;
	
	public static void main(String[] args) {
		System.out.println("asdf");
		while(Timer.GameRunning == true){
			if(level == 1){
				if(Timer.Modi == 0){
					if(Timer.TimerTime == 7){
						Timer.Modi = 1;
						Timer.TimerTime = 0;
					}
				}
			}
			PacmanMain.levelText = Integer.toString(level);
			PacmanMain.lblevel.setText(PacmanMain.levelText);
		}

	}

}
