package HelloWorldPackage;

import acm.graphics.*;
import acm. program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _10_FlowLayout extends Program {

	public void init() {
		
		setLayout (new FlowLayout());
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5") );
		add(new JButton("Button 6"));
		
	}
	
}
