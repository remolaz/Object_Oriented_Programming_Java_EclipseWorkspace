package HelloWorldPackage;

import acm.graphics.*;
import acm.program.*;
import java.awt.*; // for Color.RED

public class _9_PolygonCreation extends GraphicsProgram {
	
	private static final int DIAMOND_WIDTH = 13;
	private static final int DIAMOND_HEIGHT = 13;
	
	public void run() {
		
		GPolygon diamond = new GPolygon();
		
		// I build the ROMBO Polygon using VERTICES respect to a REFERENCE POINT
		diamond. addVertex(-DIAMOND_WIDTH / 2, 0);
		diamond. addVertex(0, DIAMOND_HEIGHT / 2);
		diamond. addVertex(DIAMOND_WIDTH / 2, 0);
		diamond. addVertex(0, -DIAMOND_HEIGHT / 2);

		// I build the ROMBO Polygon using EDGES respect to a REFERENCE POINT
		diamond. addVertex(-DIAMOND_WIDTH / 2, 0);
		diamond. addEdge(DIAMOND_WIDTH / 2, DIAMOND_HEIGHT / 2);
		diamond. addEdge(DIAMOND_WIDTH / 2, -DIAMOND_HEIGHT / 2);
		diamond. addEdge(-DIAMOND_WIDTH / 2, -DIAMOND_HEIGHT / 2);
		diamond. addEdge(-DIAMOND_WIDTH / 2, DIAMOND_HEIGHT / 2);
		
		// The reference point is (getWidth() / 2, getHeight() / 2)
		add(diamond, getWidth() / 2, getHeight() / 2);
		
		// I build the HEXAGON Polygon using POLAR EDGES respect to a REFERENCE POINT
		add(createHexagon(50), getWidth() / 2, getHeight() / 2);
		
	}
	
	private GPolygon createHexagon(double side) {
		
		GPolygon hex = new GPolygon();
		hex.addVertex(-side, 0);
		int angle = 60;
		for (int i = 0; i < 6; i++) {
			hex .addPolarEdge(side, angle);
			angle -= 60;
		}
		return hex;
		
	}

}




