package HelloWorldPackage;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class _3_GRectExample extends GraphicsProgram {
	
	public void run() {
		
		GRect rect = new GRect(100, 50, 125, 60);
		rect.setFilled(true);
		rect.setColor(Color.RED) ;
		add(rect) ;
		
		GOval oval = new GOval(100, 50, 125, 60);
		oval. setFilled(true);
		oval.setFillColor(Color.GREEN) ;
		add(oval);
		
	}
	
	private static final double CENTIMETERS_PER_INCH = 2.54;
	
}
