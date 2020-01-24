package HelloWorldPackage;

import acm.program.*;
import java.util.Random;

public class _8_RandomLetter extends ConsoleProgram {

	private static Random rgen = new Random();
	
	public void run() {
		char letter = randomLetter();
		println("The letter is " + letter + ".");
		
		char letterLow = myLowerCase(letter);
		println("The Lowercase letter is " + letterLow + ".");
		
		println("The letter is " + (isEnglishVowel(letter) ? "" : "not") + "vowel");
	}
	
	private char randomLetter() {
		return (char) ( rgen.nextInt(5) + (int) 'A' );
	}
	
	private char myLowerCase(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return (char) (ch + 'a' - 'A');
		}else {
			return ch;
		}
	}
	
	private boolean isEnglishVowel(char ch) {
		switch (Character .toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
			default:
			return false;
		}
	}
	
}
