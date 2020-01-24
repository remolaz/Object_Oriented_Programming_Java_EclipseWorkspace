package HelloWorldPackage;

import acm.graphics.*;

public class _9_Train extends GCompound {
	
	public _9_Train() {}
	
	public void append(_9_TrainCar car) {
		double width = getWidth();
		/* _9_TrainCar.CONNECTOR ci metto anche la classe avanti perche' CONNECTOR e' STATICO,
		 * quindi e' stato definito una sola volta per l'intera classe
		 */
		double x = (width == 0) ? 0 : (width - _9_TrainCar.CONNECTOR);
		add(car, x, 0);
		}
	
}

