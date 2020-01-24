package HelloWorldPackage;

import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class _13_DynamicAllocation extends ConsoleProgram {
		
	public void run() {
			
		BufferedReader rd = openFileReaderUsingChooser();
		
		ArrayList<String> lineList = new ArrayList<String>();
		try {
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				lineList.add(line);
			}
			rd.close();
		} catch (IOException ex) {
			throw new ErrorException (ex);
		}
		
		for (int i = 0; i <lineList.size(); i++) {
			println(lineList.get(i));
		}

	}
	
	private BufferedReader openFileReaderUsingChooser() {
		BufferedReader rd = null;
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			try {
				File file = chooser.getSelectedFile();
				rd = new BufferedReader(new FileReader (file) );
			} catch (IOException ex) {
				println("Can't open that file.");
			}
		}
		return rd;
	}

}
