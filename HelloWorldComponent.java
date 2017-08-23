package sk.mapa.hello;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent {

	private static final long serialVersionUID = -8961369611388080169L;

	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	@Override
	public void paintComponent(Graphics g) {
		String text = "Hello, world!";
		FontMetrics a = g.getFontMetrics(getFont());
		int width = a.stringWidth(text);
		int height = a.getHeight();
		int messageWidth = (DEFAULT_WIDTH - width) / 2;
		int messageHeight = (DEFAULT_HEIGHT - height) / 2;
		g.drawString(text, messageWidth, messageHeight);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
