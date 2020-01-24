package HelloWorldPackage;

import acm.program.*;
import java.awt.*;

public class _14_TestAnimatedSquare extends GraphicsProgram {
	
	private static final double SQUARE_SIZE = 75;
	
	public void run() {
		
		double x1 = getWidth() / 3 - SQUARE_SIZE / 2;
		double x2 = 2 * getWidth() / 3 - SQUARE_SIZE / 2;
		double y = (getHeight() - SQUARE_SIZE) / 2;
		_14_AnimatedSquare redSquare = new _14_AnimatedSquare (SQUARE_SIZE);
		redSquare.setFilled (true) ;
		redSquare.setColor (Color. RED) ;
		add(redSquare, x1, y);
		
		_14_AnimatedSquare greenSquare = new _14_AnimatedSquare (SQUARE_SIZE);
		greenSquare. setFilled(true);
		greenSquare.setColor (Color.GREEN);
		add(greenSquare, x2, y);
		
		Thread redSquareThread = new Thread (redSquare);
		Thread greenSquareThread = new Thread (greenSquare);
		
		waitForClick();
		redSquareThread.start();
		greenSquareThread.start ();
	}
	
}
