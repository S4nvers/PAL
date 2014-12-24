package pacman;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JDialog;

public class MenuMusic {

	  File soundFile = new File("Test.wav");
	  String test;

	  JDialog playingDialog;

	  Clip clip;
	
	public static void main(String[] args) throws Exception {
		 Music s = new Music();
	  }

	  public void Music() throws Exception {
	    
	    System.out.println(soundFile);

	    Line.Info linfo = new Line.Info(Clip.class);
	    Line line = AudioSystem.getLine(linfo);
	    clip = (Clip) line;
	    //clip.addLineListener((LineListener) this);
	    AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
	    clip.open(ais);
	    clip.start();
	  }

	  public void update(LineEvent le) {
	    LineEvent.Type type = le.getType();
	    if (type == LineEvent.Type.OPEN) {
	      System.out.println("OPEN");
	    } else if (type == LineEvent.Type.CLOSE) {
	      System.out.println("CLOSE");
	      System.exit(0);
	    } else if (type == LineEvent.Type.START) {
	      System.out.println("START");
	      playingDialog.setVisible(true);
	    } else if (type == LineEvent.Type.STOP) {
	      System.out.println("STOP");
	      playingDialog.setVisible(false);
	      clip.close();
	    }
	  }
	

	}


