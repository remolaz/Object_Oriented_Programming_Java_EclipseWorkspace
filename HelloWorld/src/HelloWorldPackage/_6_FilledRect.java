package HelloWorldPackage;

import acm.graphics.*;
import java.awt.*;

public class _6_FilledRect extends GRect {

	public _6_FilledRect (double x, double y, double width, double height) {
		super(x, y, width, height);
		this.setFilled(true); // OR: setFilled(true);
	}
	
	public _6_FilledRect (double x, double y, double width, double height, Color color) {
		this(x, y, width, height); // "this" here DELEGATES the other CONSTRUCTOR
		this.setColor(color); // OR: setColor(color);
	}
	
}
