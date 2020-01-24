package HelloWorldPackage;

import acm.graphics.*;
import acm. program. *;
import java.awt .event .*;

public class _10_DrawLines extends GraphicsProgram {
	
	private GLine line;
	
	public void init() {
		addMouseListeners ();
	}
	
	public void mousePressed (MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add (line);
	}
	
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}
	
}
