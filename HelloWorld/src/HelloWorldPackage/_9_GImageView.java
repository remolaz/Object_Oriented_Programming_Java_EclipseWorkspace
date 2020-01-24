package HelloWorldPackage;

import acm.graphics.*;
import acm.program.*;
import java.awt.*; // for Color.RED

public class _9_GImageView extends GraphicsProgram {
	
	private static final String CITATION_FONT = "SansSerif-10";
	private static final int CITATION_MARGIN = 13;

	// THIS CONSTANTS SET THE WINDOW DIMENSIONS
	public static final int APPLICATION_WIDTH = 640;
	public static final int APPLICATION_HEIGHT = 640 + CITATION_MARGIN;

	public void run() {
		add(new GImage("MyImage.gif") );
		addCitation( "Courtesy NASA/JPL-Caltech");
		
		GImage image = new GImage("MyNewImage.jpg");
		image.setSize(getWidth(), getHeight() - CITATION_MARGIN);
		add(image);
		
	}
	
	private void addCitation(String text) {
		GLabel label = new GLabel (text);
		label. setFont (CITATION_FONT) ;
		double x = getWidth() - label.getWidth();
		double y = getHeight() - CITATION_MARGIN + label .getAscent();
		add(label, x, y);
	}
	
}