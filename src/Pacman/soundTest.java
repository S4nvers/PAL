package Pacman;

import java.io.BufferedInputStream;
import java.io.File;
import java.net.URL;

import javax.media.j3d.Clip;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;

public class soundTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		URL soundURL; //ist zu initialisieren
		 
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundURL);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(audioInputStream);
		        AudioFormat af = audioInputStream.getFormat();
		        int size = (int) (af.getFrameSize() * audioInputStream.getFrameLength());
		        byte[] audio = new byte[size];
		        DataLine.Info info = new DataLine.Info(Clip.class, af, size);
		            bufferedInputStream.read(audio, 0, size);
		            Clip clip = (Clip) AudioSystem.getLine(info);
		            Clip.open(af, audio, 0, size);
		            ((DataLine) clip).start();
		 
}}
