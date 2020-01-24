package HelloWorldPackage;

import acm.graphics.*;
import acm. program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _10_BorderLayout extends Program {

	public void init() {
		JPanel panel = new JPanel();
		panel .setLayout (new BorderLayout ());
		panel .add(new JButton("NORTH"), BorderLayout .NORTH) ;
		panel.add(new JButton("SOUTH"), BorderLayout .SOUTH);
		panel .add(new JButton("WEST"), BorderLayout .WEST) ;
		panel.add(new JButton("EAST"), BorderLayout .EAST) ;
		panel .add(new JButton("CENTER"), BorderLayout .CENTER) ;
		add(panel);
		
	}
	
}
