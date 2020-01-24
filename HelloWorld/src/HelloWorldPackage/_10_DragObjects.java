package HelloWorldPackage;

import acm.graphics. *;
import acm. program. *;
import java.awt.*;
import java.awt.event.*;

public class _10_DragObjects extends GraphicsProgram {
	
	private GObject gobj; /* The object being dragged */
	private GPoint last; /* The last mouse position +*/

	public void init() {
		GRect rect = new GRect(100, 100, 150, 100);
		rect.setFilled(true) ;
		rect.setColor(Color.RED) ;
		add (rect);
		GOval oval = new GOval(300, 115, 100, 70);
		oval.setFilled(true);
		oval. setColor (Color .GREEN) ;
		add (oval);
		addMouseListeners();
		addKeyListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt (last) ;
	}
	
	public void mouseDragged (MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if (gobj != null) gobj.sendToFront();
	}

	public void keyPressed(KeyEvent e) {
		if (gobj != null) {
			switch (e.getKeyCode()) {
				case KeyEvent .VK_UP: gobj.move(0, -1); break;
				case KeyEvent.VK_DOWN: gobj.move(0, +1); break;
				case KeyEvent.VK_LEFT: gobj.move(-1, 0); break;
				case KeyEvent.VK_RIGHT: gobj.move(+1, 0); break;
			}
		}
	}
	
}
