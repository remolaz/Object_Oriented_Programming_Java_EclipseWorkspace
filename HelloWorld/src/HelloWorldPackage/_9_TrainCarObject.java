package HelloWorldPackage;

import acm.graphics.*;
import java.awt.*;

public class _9_TrainCarObject extends _9_TrainCar {
	
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;

	public _9_TrainCarObject(Color color) {

		super (color) ;
		double xRightDoor = CONNECTOR + CAR_WIDTH / 2;
		double xLeftDoor = xRightDoor - DOOR_WIDTH;
		double yDoor = -CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect (xLeftDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT) );
		add(new GRect (xRightDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		
	}
	
}
