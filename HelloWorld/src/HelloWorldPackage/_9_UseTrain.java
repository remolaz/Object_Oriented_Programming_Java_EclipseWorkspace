package HelloWorldPackage;

import acm.graphics.*;
import acm. program. *;
import java.awt.*;

public class _9_UseTrain extends GraphicsProgram {
	
	private static final double PAUSE_TIME = 20;
	private static final double DELTA_X = 2;
	
	public void run() {
		
		double xc = getWidth() / 2;
		_9_Train train = new _9_Train();
		
		train.append(new _9_TrainCarObject (Color.GREEN) );
		train.append(new _9_TrainCarObject (Color.WHITE) );
		train.append(new _9_TrainCarObject (Color.RED) );
		
/* NOTA IMPORTANTE:
 *  TrainCar is an ABSTRACT CLASS AND FOR THIS REASON DOESN'T PRODUCE OBJECTS.
 *  What it can do is only to create subclasses of it and from those subclasses create objects.
 *  In fact I can't do: train.append(new _9_TrainCar (Color.GREEN) );
 *  If I delete the property ABSTRACT from _9_TrainCarObject I can use: train.append(new _9_TrainCar (Color.GREEN) );
 */

		add(train, xc - train.getWidth() / 2, getHeight());
		waitForClick();
		while (train.getX() + train.getWidth() >= 0) {
			train.move(-DELTA_X, 0);
			pause (PAUSE_TIME) ;
		}
	}

}



