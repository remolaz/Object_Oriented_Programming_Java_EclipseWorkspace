package HelloWorldPackage;

import acm.program. *;

public class _11_CountLetterFrequencies extends ConsoleProgram {
	
	private int[] frequencyTable;
	
	public void run() {
		println("This program counts letter frequencies. ");
		println("Enter a blank line to indicate the end of the text.");
		initFrequencyTable();
		while (true) {
			String line = readLine();
			if (line.length() == 0) break;
			countLetterFrequencies (line) ;
		}
		printFrequencyTable();
	}
	
	private void initFrequencyTable() {
		frequencyTable = new int [26];
		for (int i = 0; i < 26; i++) {
			frequencyTable[i] = 0;
		}
	}

	private void countLetterFrequencies(String line) {
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt (i);
			if (Character.isLetter(ch)) {
				int index = Character.toUpperCase(ch) - 'A';
				frequencyTable[index] ++;
			}
		}
	}

	private void printFrequencyTable() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int index = ch - 'A';
			println(ch + ": " + frequencyTable[index]);
		}
	}

}