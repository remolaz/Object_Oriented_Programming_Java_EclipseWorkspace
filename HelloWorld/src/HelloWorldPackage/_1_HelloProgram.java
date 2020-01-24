package HelloWorldPackage;

import acm.graphics.*;
import acm.program.*;
import java.awt.*; // for Color.RED

public class _1_HelloProgram extends GraphicsProgram {

	public void run() {
		GLabel msg = new GLabel ("hello world", 75, 75);
		
		// Here we send a message to the object msg telling to change font
		msg.setFont("Helvetica-24");
		msg.setColor(Color.RED);
		
		add(msg);
	}

}
