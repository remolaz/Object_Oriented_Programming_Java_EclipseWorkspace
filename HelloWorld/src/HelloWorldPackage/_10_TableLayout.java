package HelloWorldPackage;

import acm.graphics.*;
import acm.gui.*;
import acm. program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _10_TableLayout extends Program {

	public void init() {
		
		setLayout (new TableLayout(2, 3));
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
		add(new JButton ("Button 6"));
		
	}
	
}
