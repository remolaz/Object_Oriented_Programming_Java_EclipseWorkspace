package HelloWorldPackage;

import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class _12_ReverseFile extends ConsoleProgram {
	
	public void run() {
		println("This program reverses the lines in a file.");
		
//		BufferedReader rd = openFileReader("Enter input file: ");
		BufferedReader rd = openFileReaderUsingChooser(); // Tou can choose one of the two
		
		String[] lines = readLineArray(rd);
		for (int i = lines.length - 1; i >= 0; i--) {
			println(lines[i]);
		}
		
		double[] numbers =  readDoubleArray(rd);
		
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
	
	private BufferedReader openFileReader(String prompt) {
		BufferedReader rd = null;
		while (rd == null) {
			try {
				String name = readLine(prompt) ;
				rd = new BufferedReader (new FileReader (name) );
			} catch (IOException ex) {
				println("Can't open that file.");
			}
		}
		return rd;
	}

	private String[] readLineArray (BufferedReader rd) {
		
		ArrayList<String> lineList = new ArrayList<String>();
		
		try {
			while (true) {
			String line = rd.readLine();
			if (line == null) break;
				lineList.add(line);
			}
			rd.close();
		} catch (IOException ex) {
			throw new ErrorException (ex) ; //defined by acm.program package
		}
		
		String[] result = new String[lineList.size()];
		for (int i= 0; i < result.length; i++) {
			result[i] = lineList.get (i);
		}
		return result;
	}
	
	private double[] readDoubleArray(Reader rd) {
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		Scanner scanner = new Scanner (rd);
		while (scanner.hasNextDouble()) {
			doubleList .add(scanner.nextDouble());
		}
		double[] result = new double[doubleList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = doubleList.get(i);
		}
		scanner.close();
		return result;
		
	}

}