package HelloWorldPackage;

import acm.program. *;
import acm.graphics.*;
import java.awt.event.*;
import javax.swing.*;

public class _10_FontSampler extends GraphicsProgram {
	
	private static final int MAX_FONT_NAME = 30;
	private static final int LEFT_MARGIN = 3;
	private static final String TEST_STRING = "The quick brown fox jumped over the Jazy dog.";

	private JTextField fontField;
	private GLabel lastLabel;
	private double lastY;
	
	public void init() {
		fontField = new JTextField(MAX_FONT_NAME) ;
		
		fontField.addActionListener(this); 
		/*
		* "this" represents this object: in other words I'm adding to this class a listener for fontField.
		* It is an EXPLICIT call to assign addActionListener for fontField, to THIS class
		* Usually addActionListener adds the program as listener only for buttons p.378
		*/
		
		add(new JLabel("Font"), SOUTH);
		add(fontField, SOUTH);
		lastY = 0;
		lastLabel = new GLabel (TEST_STRING) ;
		addGLabel(lastLabel) ;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == fontField) {
			GLabel label = new GLabel (TEST_STRING) ;
			label.setFont (lastLabel.getFont());
			label.setFont (fontField.getText());
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
	}

	private void addGLabel(GLabel label) {
		lastY += label .getHeight();
		lastY += lastLabel.getDescent() - label .getDescent();
		add(label, LEFT_MARGIN, lastY);
	}

}
