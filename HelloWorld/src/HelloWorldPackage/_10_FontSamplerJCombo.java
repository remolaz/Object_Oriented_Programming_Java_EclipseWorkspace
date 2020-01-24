package HelloWorldPackage;

import acm.program. *;
import acm.graphics.*;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class _10_FontSamplerJCombo extends GraphicsProgram {
	
	private static final int MAX_FONT_NAME = 30;
	private static final int LEFT_MARGIN = 3;
	private static final String TEST_STRING = "The quick brown fox jumped over the Jazy dog.";
	
	private JComboBox fontChooser;
	private GLabel lastLabel;
	private double lastY;
	
	public void init() {

		add(new JLabel("Font"), SOUTH);
		
		lastLabel = new GLabel (TEST_STRING) ;
		addGLabel (lastLabel) ;
		
		initFontChooser();
		add(fontChooser, SOUTH);
		
		fontChooser.addActionListener(this); 
		/*
		* "this" represents this object: in other words I'm adding to this class a listener for fontChooser.
		* It is an EXPLICIT call to assign addActionListener for fontChooser, to THIS class
		* Usually addActionListener adds the program as listener only for buttons p.378
		*/ 
	}
	
	private void initFontChooser() {
		fontChooser = new JComboBox();
		fontChooser.addItem( "Serif-20" );
		fontChooser. addItem( "Serif-30" );
		fontChooser.addItem( "Serif-40" );
		fontChooser. addItem( "Serif-50" ) ;
		fontChooser.setEditable( false) ;
		fontChooser.setSelectedItem( "Serif-10" );
	}

	private String getCurrentFont() {
		String got = (String) fontChooser.getSelectedItem();
		return (String) fontChooser.getSelectedItem();

	}
	
	public void actionPerformed(ActionEvent e) {
		GLabel label = new GLabel (TEST_STRING) ;
		label.setFont (lastLabel.getFont());
		label.setFont (getCurrentFont());
		/*
		* It seems as if the first call to setFont is extraneous, given that the second goes on
		*	to change the font again. The reason for this implementation strategy is that the
		*	second call to setFont — the one that uses a string argument — need not specify
		*	every aspect of the new font. If, for example, the point size or style is omitted from
		*	the string, the GLabel uses the value from its current font. Thus, if the user were to
		*	type in a new font family name and leave out the point-size information, the
		*	implementation of the FontSampler program in Figure 10-9 would change the font
		*	family without changing the point size.
		*/
		addGLabel (label) ;
		lastLabel = label;
	}

	private void addGLabel(GLabel label) {
		lastY += label.getHeight();
		lastY += lastLabel.getDescent() - label .getDescent();
		add(label, LEFT_MARGIN, lastY);
	}

}
