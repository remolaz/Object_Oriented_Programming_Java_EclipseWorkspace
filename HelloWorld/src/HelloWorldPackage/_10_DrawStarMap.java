package HelloWorldPackage;

import acm.graphics.*;
import acm. program.*;
import java.awt.*;
import java.awt.event.*;

public class _10_DrawStarMap extends GraphicsProgram {
	
	private static final double STAR_SIZE = 20;
	
	public void init() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		_9_GStar star = new _9_GStar(STAR_SIZE);
		
		star.setFilled(true) ;
		add(star, e.getX(), e.getY());
	}

}
