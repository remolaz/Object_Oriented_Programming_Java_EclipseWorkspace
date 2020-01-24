package HelloWorldPackage;

import acm.graphics.*;
import acm. program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _10_DrawStarMapFilledSliderColor extends GraphicsProgram {
	
//	private static final double MIN_SIZE = 1;
//	private static final double MAX_SIZE = 50;
//	private static final double INITIAL_SIZE = 20;
	
	private JCheckBox fillCheckBox;
	private JSlider sizeSlider;
	private JComboBox colorChooser;
		
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
		initColorChooser();
		add(colorChooser, SOUTH);
		
		setBackground(Color.GRAY) ;
		
	}
	
	private void initColorChooser() {
		colorChooser = new JComboBox();
		colorChooser.addItem( "White" );
		colorChooser. addItem( "Red" );
		colorChooser.addItem( "Yellow" );
		colorChooser. addItem( "Orange" ) ;
		colorChooser.addItem( "Green" );
		colorChooser.addItem("Blue" );
		colorChooser.addItem("Black" );
		colorChooser.setEditable( false) ;
		colorChooser.setSelectedItem( "white" );
		}
	
	private Color getCurrentColor() {
		String name = (String) colorChooser.getSelectedItem();
		if (name.equals("Red")) return Color.RED;
		if (name.equals("Yellow")) return Color. YELLOW;
		if (name.equals("Orange")) return Color.ORANGE;
		if (name.equals("Green")) return Color.GREEN;
		if (name.equals("Blue")) return Color.BLUE;
		if (name.equals("Black")) return Color.BLACK;
		return Color.WHITE;
	}
	
	private double getCurrentSize() {
		return sizeSlider.getValue();
	}
	
	public void mouseClicked(MouseEvent e){
		_9_GStar star = new _9_GStar(getCurrentSize());
		star.setColor(getCurrentColor());
		star.setFilled( fillCheckBox.isSelected() ) ;
		add(star, e.getX(), e.getY());
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) removeAll();
	}

}
