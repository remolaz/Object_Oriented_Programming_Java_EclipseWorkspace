package HelloWorldPackage;

import acm.graphics.*;
import acm. program.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class _10_DrawStarMapFilledSlider extends GraphicsProgram {
	
//	private static final double MIN_SIZE = 1;
//	private static final double MAX_SIZE = 50;
//	private static final double INITIAL_SIZE = 20;
	
	private JCheckBox fillCheckBox;
	private JSlider sizeSlider;
	
	public void init() {
		addMouseListeners();
		
		add(new JButton("Clear"), SOUTH); 
		addActionListeners();
		
		fillCheckBox = new JCheckBox("Filled");
		fillCheckBox.setSelected(true);
		add(fillCheckBox, SOUTH);
		
		sizeSlider = new JSlider(JSlider.HORIZONTAL);
		add(new JLabel(" Small"), SOUTH);
		add(sizeSlider, SOUTH);
		add(new JLabel("Large"), SOUTH);
		
	}
	
	private double getCurrentSize() {
		return sizeSlider.getValue();
	}
	
	public void mouseClicked(MouseEvent e){
		_9_GStar star = new _9_GStar(getCurrentSize());
		
		star.setFilled( fillCheckBox.isSelected() ) ;
		add(star, e.getX(), e.getY());
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) removeAll();
	}

}
