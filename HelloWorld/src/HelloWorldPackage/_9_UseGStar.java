package HelloWorldPackage;

import acm.graphics.*;
import acm. program. *;
import java.awt.*;

public class _9_UseGStar extends GraphicsProgram {
	
	private static final double starWidth = 100;
	
	public void run() {
		
		// METHOD 1: Explicit Form
//		_9_GStar star = new _9_GStar(starWidth);
//		add(star, getWidth() / 2, getHeight() / 2);
		
		// METHOD 2: Shorter Form
		add(new _9_GStar(100), getWidth() / 2, getHeight() / 2);
		
	}
}
