package HelloWorldPackage;

import acm.graphics.*;
import acm. program. *;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _10_DrawStarMapComplete extends GraphicsProgram {
	
	private static final int MIN_SIZE = 1;
	private static final int MAX_SIZE = 50;
	private static final int INITIAL_SIZE = 16;
	private JSlider sizeSlider;
	private JComboBox colorChooser;

	public void init() {
		setBackground (Color.GRAY) ;
		
		add(new JButton("Clear"), SOUTH);
		
		sizeSlider = new JSlider(MIN_SIZE, MAX_SIZE, INITIAL_SIZE);
		
		add(new JLabel(" Small"), SOUTH);
		add(sizeSlider, SOUTH);
		add(new JLabel("Large "), SOUTH);
		
		initColorChooser ();
		add(colorChooser, SOUTH) ;
		addMouseListeners ();
		addActionListeners ();
	}

	private void initColorChooser() {
		colorChooser = new JComboBox();
		colorChooser.addItem( "White" ) ;
		colorChooser.addItem( "Red" ) ;
		colorChooser.addItem( "Yellow" ) ;
		colorChooser.addItem( "Orange" );
		colorChooser.addItem( "Green" );
		colorChooser.addItem("Blue");
		colorChooser.addItem( "Black" ) ;
		colorChooser.setEditable( false);
		colorChooser.setSelectedItem( "White" );
	}

	private Color getCurrentColor() {
		String name = (String) colorChooser.getSelectedItem();
		if (name.equals("Red")) return Color.RED;
		if (name.equals("Yellow")) return Color.YELLOW;
		if (name.equals("Orange")) return Color.ORANGE;
		if (name.equals("Green")) return Color.GREEN;
		if (name.equals("Blue")) return Color.BLUE;
		if (name.equals("Black")) return Color.BLACK;
		return Color.WHITE;
	}
	
	private double getCurrentSize() {
		return sizeSlider.getValue();
	}
	
	public void mouseClicked(MouseEvent e) {
		_9_GStar star = new _9_GStar(getCurrentSize());
		star.setFilled(true);
		star. setColor(getCurrentColor());
		add(star, e.getX(), e.getY());
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) {
			removeAll ();
		}
	}

}


