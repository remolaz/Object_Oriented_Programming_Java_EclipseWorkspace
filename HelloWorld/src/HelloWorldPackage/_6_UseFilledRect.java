package HelloWorldPackage;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class _6_UseFilledRect extends GraphicsProgram {
	
	public void run() {
		double width = getWidth();
		double height = getHeight();
		double stripe = width / 3;
		add(new _6_FilledRect(0, 0, stripe, height, Color.BLUE));
		add(new _6_FilledRect(stripe, 0, stripe, height, Color.WHITE));
		add(new _6_FilledRect(2 * stripe, 0, stripe, height, Color.RED));
	}
	
}
