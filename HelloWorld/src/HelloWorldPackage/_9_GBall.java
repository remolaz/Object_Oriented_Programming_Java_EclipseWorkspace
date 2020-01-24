package HelloWorldPackage;

import acm.graphics.*;

public class _9_GBall extends GCompound {
	
	public _9_GBall(double r) {
		GOval ball = new GOval(2 * r, 2 * r);
		ball.setFilled(true);
		add(ball, -r, -r);
		markAsComplete();
	}
	
	public _9_GBall(double r, double x, double y) {
		this(r);
		setLocation(x, y);
	}
	
}