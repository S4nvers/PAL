package Pacman;

public class Timer {
	public static int TimerTime;
	public static boolean GameRunning = true;
	public static int Modi = 0;
	public Timer() {
		TimerTime = 0;
		while (GameRunning == true){
			TimerTime = TimerTime + 1;
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			System.out.println(TimerTime);
			
		}
		

	}

}
