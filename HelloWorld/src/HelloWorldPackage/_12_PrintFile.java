package HelloWorldPackage;

import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class _12_PrintFile extends ConsoleProgram {
	
//	public void run() { //ALTERNATIVE Manual function
//		try {
//			
//			PrintWriter wr = new PrintWriter(new FileWriter("Hello.txt"));			
//			wr.println("hello, world");
//			wr.close();
//		} catch (IOException ex) {
//			throw new ErrorException(ex) ;
//		}
//	}
	
	public void run() {
			
			PrintWriter wr = openFileWriterUsingChooser();
			wr.println("hello, world");
			wr.close();

	}
	
	private PrintWriter openFileWriterUsingChooser() {
		PrintWriter rd = null;
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this); // INSTEAD of chooser.showOpenDialog I use chooser.showSaveDialog
		if (result == JFileChooser.APPROVE_OPTION) {
			try {
				File file = chooser.getSelectedFile();
				rd = new PrintWriter(new FileWriter (file) );
			} catch (IOException ex) {
				println("Can't open that file.");
			}
		}
		return rd;
	}

}
