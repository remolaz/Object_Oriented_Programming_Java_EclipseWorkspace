package HelloWorldPackage;

import acm.program. *;
import java.awt.event.*;
import javax.swing.*;

public class _10_HitchhikerButton extends ConsoleProgram {

	public void init() {
		
		add(new JButton("Red"), SOUTH);
		addActionListeners();
		
//		ImageIcon icon = new ImageIcon("MyImage.gif");
//		JButton button = new JButton(icon) ;
//		button.setActionCommand ("Red") ;
//		add(button, SOUTH) ;
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Red")) {
			println("Please do not press this button again.");
		}
	}
}
