package HelloWorldPackage;

import acm.graphics.*;
import java.awt.*;

/* ABSTRACT CLASS I can't produce real object from it!! 
 * What I can do is only create subclasses of it and from those subclasses create objects
 * Read _9_UseTrain
*/

public abstract class _9_TrainCar extends GCompound {
	
	protected static final double CAR_WIDTH = 75;
	protected static final double CAR_HEIGHT = 36;
	protected static final double CAR_BASELINE = 10;
	protected static final double CONNECTOR = 6;
	protected static final double WHEEL_RADIUS = 8;
	protected static final double WHEEL_INSET = 16;

	public _9_TrainCar(Color color) {
		double xLeft = CONNECTOR;
		double yBase = -CAR_BASELINE;
		add(new GLine(0, yBase, CAR_WIDTH + 2 * CONNECTOR, yBase));
		addWheel (xLeft + WHEEL_INSET, -WHEEL_RADIUS);
		addWheel (xLeft + CAR_WIDTH - WHEEL_INSET, -WHEEL_RADIUS) ;
		double yTop = yBase - CAR_HEIGHT;
		GRect r = new GRect(xLeft, yTop, CAR_WIDTH, CAR_HEIGHT) ;
		r.setFilled (true);
		r.setFillColor (color) ;
		add(r);
	}

	private void addWheel(double x, double y) {
		GOval wheel = new GOval(x - WHEEL_RADIUS, y - WHEEL_RADIUS,
		2 * WHEEL_RADIUS, 2 * WHEEL_RADIUS);
		wheel .setFilled(true) ;
		wheel .setFillColor(Color.GRAY) ;
		add (wheel) ;
	}
	
}
