package pacman;

public class Timer {
	public static int TimerTime;
	public static int Mochatim = 1;
	public static boolean GameRunning = false;
	public static int Modi = 0;
	public static int level = 1;


	public Timer() {
		TimerTime = 0;
		while (GameRunning == true){
			TimerTime = TimerTime + 1;
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			PacmanMain.TimeText = Integer.toString(TimerTime);
			PacmanMain.lbtimer.setText(PacmanMain.TimeText);
			
			PacmanMain.ModiText = Integer.toString(Modi);
			PacmanMain.lbmodi.setText(PacmanMain.ModiText);
			
			PacmanMain.levelText = Integer.toString(level);
			PacmanMain.lblevel.setText(PacmanMain.levelText);
			
			System.out.println(Mochatim);
			if(level == 1){
					if(Mochatim == 1){
						if(TimerTime == 7){
							Modi = 1;
							TimerTime = -1;
							Mochatim = Mochatim + 1;
						}
					}
					else if(Mochatim == 2){
						if(TimerTime == 20){
							Modi = 0;
							TimerTime = -1;
							Mochatim = Mochatim + 1;
						}
					}
					else if(Mochatim == 3){
						if(TimerTime == 7){
							Modi = 1;
							TimerTime = -1;
							Mochatim = Mochatim + 1;
						}
					}
					else if(Mochatim == 4){
						if(TimerTime == 20){
							Modi = 0;
							TimerTime = -1;
							Mochatim = Mochatim + 1;
						}
					}
					else if(Mochatim == 5){
						if(TimerTime == 5){
							Modi = 1;
							TimerTime = -1;
							Mochatim = Mochatim + 1;
						}
					}
					else if(Mochatim == 6){
						if(TimerTime == 20){
							Modi = 0;
							TimerTime = -1;
							Mochatim = Mochatim + 1;
						}
					}
					else if(Mochatim == 7){
						if(TimerTime == 5){
							Modi = 1;
							TimerTime = -1;
							Mochatim = Mochatim + 1;
						}
					}
					else if(Mochatim == 8){
						if(TimerTime == -2){
							Modi = 1;
							TimerTime = -1;
							Mochatim = Mochatim + 1;
						}
					}
				}
			
		}
		

	}

}
