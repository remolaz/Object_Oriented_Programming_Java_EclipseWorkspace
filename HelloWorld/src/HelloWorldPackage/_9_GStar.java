package HelloWorldPackage;

import acm.graphics.*;

public class _9_GStar extends GPolygon {
	
	// CLASS CONSTRUCTOR
	public _9_GStar(double width) {
		double dx = width / 2;
		double dy = dx * GMath.tanDegrees (18);
		double edge = width / 2 - dy * GMath.tanDegrees (36);
		addVertex(-dx, -dy);
		int angle = 0;
		for (int i = 0; i < 5; i++) {
			addPolarEdge(edge, angle);
			addPolarEdge(edge, angle + 72);
			angle -= 72;
		}
	}
}
