package HelloWorldPackage;

import acm.program.*;

public class _8_UseStrings extends ConsoleProgram {
	
	public void run() {
		
		String message = "Hello World!";
		String message1 = message;
		
		println("The length of the string \"" + message + "\" is: " + message.length());
		println("In position 0 there is the caracther: " + message.charAt(0) + ".");
		
		// Concatenation
		message = message.concat(" Added1").concat(" Added2");
		message = message + " Added3";
		message += " Added4";
		println(message);
		
		// Substrings
		println(message.substring(message.length()/2));
		
		// Comparison
		if (message.equals(message1)) {
			println("Thery are equal");
		}else {
			println("Thery are NOT equal");
		}
		
		if(message.compareTo(message1)==0) {
			println("Thery are equal");
		}else if (message.compareTo(message1) < 0) {
			println("message preceed message2");
		}else if (message.compareTo(message1) > 0) {
			println("message follows message2");
		}
		
		// Searching in Strings
		int pos = message.indexOf('H');
		int pos1 = message.indexOf('X'); // -1 if not found
		int pos2 = message.indexOf('H',5); //Starts searching from the 5th position
		println("Positions: " + pos + ", " + pos1 + ", " + pos2);
		
		// Acronyms
		String messageAcr = acronym(message);
		println("The acronym of \"" + message + "\" is: " + messageAcr);
		
		// startsWith - endsWith
		if (messageAcr.startsWith("yes") || messageAcr.endsWith("Yes")) {
			println("Answered");
		} else {
			println("No Answer");
		}
		
		// UPPER lower Case
		String messageUp = message.toUpperCase();
		String messageLow = message.toLowerCase();
		println(messageUp);
		println( messageLow);
		
	}
	
	private String acronym(String str) {
		String result = str.substring(0, 1);
		int pos = str.indexOf(' ');
		while (pos != -1) {
			result += str.substring(pos + 1, pos + 2);
			pos = str.indexOf(' ', pos + 1);
		}
		return result;
	}
	
}
