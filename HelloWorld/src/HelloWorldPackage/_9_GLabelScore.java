package HelloWorldPackage;

import acm.graphics.*;
import acm.program.*;
import java.awt.*; // for Color.RED

public class _9_GLabelScore  extends GraphicsProgram {

	public void run() {
		
		GLabel msg = new GLabel ("Hi", 75, 75);
		
		msg.setFont("Helvetica-bold-24");
		msg.setColor(Color.RED);
		
		int scoreVal = 10;
		
		msg.setLabel("Score: " + scoreVal);
		
		double x = (getWidth() - msg.getWidth()) / 2;
		double y = (getHeight() + msg.getAscent()) / 2;
		add(msg, x, y);
		
		int width=40, height=40;
		
		GRect rect = new GRect(x, y, width, height);
		add (rect) ;
		
//		// Same as to write:
//		GRect rect = new GRect(width, height);
//		add(rect, x, y);
	}

}
