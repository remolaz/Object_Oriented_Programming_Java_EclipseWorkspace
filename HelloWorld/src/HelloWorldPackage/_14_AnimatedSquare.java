package HelloWorldPackage;

import acm.graphics.*;
import acm.util.*;
import java.awt.*;

public class _14_AnimatedSquare extends GRect implements Runnable {
	
	private static final double DELTA = 2; 
	private static final int PAUSE_TIME = 20; 
	private static final int CHANGE_TIME = 50;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double direction;

	public _14_AnimatedSquare(double size) {
		super(size, size);
	}

	public void run() {
		for (int t = 0; true; t++) {
			if (t % CHANGE_TIME == 0) {
				direction = rgen.nextDouble(0, 360);
			}
			movePolar (DELTA, direction);
			pause(PAUSE_TIME) ;
		}
	}

}
