package HelloWorldPackage;

import acm.graphics.*;
import acm.gui.*;
import acm. program. *;
import java.awt.event.*;
import javax.swing.*;


public class _10_TemperatureConverter extends Program {
	
	private IntField fahrenheitField;
	private IntField celsiusField;
	
	public void init() {
		
		setLayout (new TableLayout(2, 3));
		
		fahrenheitField = new IntField(32);
		fahrenheitField.setActionCommand("F -> C"); // For BUTTONS the setActionCommand is their label
		fahrenheitField.addActionListener(this); // If the user presses ENTER
		
		celsiusField = new IntField(0);
		celsiusField.setActionCommand("C ~> F"); // For BUTTONS the setActionCommand is their label
		celsiusField.addActionListener(this); // If the user presses ENTER
		
		add(new JLabel("Degrees Fahrenheit"));
		add (fahrenheitField) ;
		add(new JButton("F -> C"));
		
		add(new JLabel("Degrees Celsius"));
		add (celsiusField);
		add(new JButton("C -> F"));
		
		addActionListeners (); // If the user clicks the buttons
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		if (cmd.equals("F -> C")) {
			
			int f = fahrenheitField.getValue();
			int c = GMath.round((5.0 / 9.0) * (f - 32));
			celsiusField.setValue(c);
			
		} else if (cmd.equals("C -> F")) {
			
			int c = celsiusField.getValue();
			int f = GMath.round((9.0 / 5.0) * c + 32);
			fahrenheitField.setValue(f);
		
		}
	}

}