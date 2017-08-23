package sk.mapa.hello;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent {

	private static final long serialVersionUID = -8961369611388080169L;

	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	@Override
	public void paintComponent(Graphics g) {
		String text = "Hello, world!";
		Rectangle frameDimensions = g.getClipBounds();
		int x = frameDimensions.width;
		int y = frameDimensions.height;
		FontMetrics a = g.getFontMetrics(getFont());
		int width = a.stringWidth(text);
		int height = a.getHeight();
		int messageWidth = (x - width) / 2;
		int messageHeight = (y + height / 2) / 2;
		g.drawString(text, messageWidth, messageHeight);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
