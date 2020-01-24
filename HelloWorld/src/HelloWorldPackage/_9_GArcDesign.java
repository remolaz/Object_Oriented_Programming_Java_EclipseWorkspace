package HelloWorldPackage;

import acm.graphics.*;
import acm.program.*;
import java.awt.*; // for Color.RED

public class _9_GArcDesign extends GraphicsProgram {

	public void run() {
		
		double r = 30;
		int cx = 50, cy = 50;
		
		GArc a1 = new GArc(2 * r, 2 * r, 0, 60); 
		add(a1, cx - r + 0, cy - r); 

		GArc a2 = new GArc(2 * r, 2 * r, 45, 180);
		add(a2, cx - r + 10, cy - r);
		
		GArc a3 = new GArc(2 * r, 2 * r, -45, 90); 
		add(a3, cx - r + 20, cy - r);
		
		GArc a4 = new GArc(2 * r, 2 * r, 0, -135);
		add(a4, cx - r + 30, cy - r);
		
		GArc openArc = new GArc(2 * r, 2 * r, 0, 60);
		add(openArc, 0.3 * getWidth() - r, (getHeight() - r) / 2);
		
		GArc filledArc = new GArc(2 * r, 2 * r, 0, 60);
		filledArc.setFilled(true);
		add(filledArc, 0.7 * getWidth() - r, (getHeight() - r) / 2);
		
		GArc outlinedArc = new GArc(2 * r, 2 * r, 0, 60);
		outlinedArc.setFilled (true) ;
		outlinedArc.setFillColor (Color .WHITE);
		add(outlinedArc, getWidth() / 2 - r, getHeight() /2 - r);
		
		GArc outlinedArcDist = new GArc(2 * r, 2 * r, 0, 60);
		outlinedArcDist.setFilled (true) ;
		outlinedArcDist.setFillColor (Color .WHITE);
		outlinedArcDist.scale (4,1);
		add(outlinedArcDist, getWidth() / 2 - 5*r, getHeight() /2 + r);
		
		
		
	}

}
