package HelloWorldPackage;

import acm.graphics.*;
import acm. program.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class _10_DrawStarMapFilled extends GraphicsProgram {
	
	private static final double STAR_SIZE = 20;
	
	private JCheckBox fillCheckBox;
	
	public void init() {
		addMouseListeners();
		
		add(new JButton("Clear"), SOUTH); 
		addActionListeners();
		
		fillCheckBox = new JCheckBox("Filled");
		fillCheckBox.setSelected(true);
		add(fillCheckBox, SOUTH);
	}
	
	public void mouseClicked(MouseEvent e){
		_9_GStar star = new _9_GStar(STAR_SIZE);
		
		star.setFilled( fillCheckBox.isSelected() ) ;
		add(star, e.getX(), e.getY());
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) removeAll();
	}

}
