package HelloWorldPackage;

import acm.graphics.*;
import acm. program. *;
import java.awt.*;

public class _9_UseDoor extends GraphicsProgram {
	
	private static final double width = 100;
	private static final double height = 100;
	
	public void run() {
		
		// METHOD 1: Explicit Form
//		_9_Door door = new _9_Door(width, height);
//		add(door, getWidth() / 2, getHeight() / 2);
		
		// METHOD 2: Shorter Form
		add(new _9_Door(100,100), getWidth() / 2, getHeight() / 2);
		
	}
}