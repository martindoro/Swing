package sk.mapa.hello;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class HelloFrameDemo {
	public static void main(String[] args) {
		JFrame frame = new HelloFrame();
		Dimension d = frame.getComponent(0).getPreferredSize();
		frame.setLocationRelativeTo(null);
		frame.setSize(d);
		frame.setTitle("Hello, world in Swing");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
