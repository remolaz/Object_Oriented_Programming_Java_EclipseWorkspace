package HelloWorldPackage;

import acm.graphics.*;
import acm. program.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class _10_DrawStarMapFilledSize extends GraphicsProgram {
	
	private static final double SMALL_SIZE = 10;
	private static final double MEDIUM_SIZE = 20;
	private static final double LARGE_SIZE = 30;
	
	private JCheckBox fillCheckBox;
	private JRadioButton smallButton;
	private JRadioButton mediumButton;
	private JRadioButton largeButton;
	
	public void init() {
		addMouseListeners();
		
		add(new JButton("Clear"), SOUTH); 
		addActionListeners();
		
		fillCheckBox = new JCheckBox("Filled");
		fillCheckBox.setSelected(true);
		add(fillCheckBox, SOUTH);
		
		smallButton = new JRadioButton("Small");
		mediumButton = new JRadioButton ("Medium");
		largeButton = new JRadioButton( "Large" );
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(smallButton);
		sizeGroup. add (mediumButton) ;
		sizeGroup.add(largeButton) ;
		mediumButton.setSelected (true) ;
		add(smallButton, SOUTH);
		add(mediumButton, SOUTH) ;
		add(largeButton, SOUTH) ;
		
	}
	
	private double getCurrentSize() {
		if (smallButton.isSelected()) return SMALL_SIZE;
		if (largeButton.isSelected()) return LARGE_SIZE;
		return MEDIUM_SIZE;
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
