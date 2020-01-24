package HelloWorldPackage;

import acm.graphics.*;
import acm. program. *;
import java.awt.*;

public class _9_UseGBall extends GraphicsProgram {
	
	private static final double posX = 100;
	private static final double posY = 100;
	private static final double radius = 100;
	
	public void run() {
		
		// METHOD 1: Explicit Form
//		_9_GBall door = new _9_GBall(width, height, radius);
//		add(door, getWidth() / 2, getHeight() / 2);
		
		// METHOD 2: Shorter Form
		add(new _9_GBall(100,100,100), getWidth() / 2, getHeight() / 2);
		
	}
}