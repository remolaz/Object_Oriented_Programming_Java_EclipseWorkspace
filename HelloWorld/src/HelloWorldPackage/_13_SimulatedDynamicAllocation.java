package HelloWorldPackage;

/*
 * ITERATOR EXAMPLE
 * Iterator<String> iterator = nameList.iterator();
 * while(iterator.hasNext()){
 * 	println(iterator.next());
 * }
 */

import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class _13_SimulatedDynamicAllocation extends ConsoleProgram {
	
	private static final int INITIAL_CAPACITY = 10;
		
	public void run() {
			
		BufferedReader rd = openFileReaderUsingChooser();
		
		String[] lineList = readLineArray(rd);
		
		for (int i = 0; i <lineList.length; i++) {
			println(lineList[i]);
		}

	}
	
	private String[] readLineArray (BufferedReader rd) {
		
		String[] lineArray = new String[INITIAL_CAPACITY] ;
		int nLines = 0;
		try {
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				if (nLines + 1>= lineArray.length) {
					lineArray = doubleArrayCapacity (lineArray) ;
				}
				lineArray[nLines++] = line;
			}
			rd. close();
		} catch (IOException ex) {
			throw new ErrorException (ex);
		}
		String[] result = new String[nLines];
		for (int i = 0; i < nLines; i++) {
			result[i] = lineArray[i];
		}
		return result;
		
	}
		
	private String[] doubleArrayCapacity(String[] oldArray) {
		String[] newArray = new String[2 * oldArray.length];
		for (int i = 0; i < oldArray.length; i++) {
				newArray[i] = oldArray[i];
		}
		return newArray;
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


