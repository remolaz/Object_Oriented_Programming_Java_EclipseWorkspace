package HelloWorldPackage;

import acm.program.*;
import acm.util.*;

public class _6_Craps extends ConsoleProgram {
	
	public void run() {
		int total = rollTwoDice();
		if (total == 7 || total == 11) {
			println("That's a natural. You win.");
		} else if (total == 2 || total == 3 || total == 12) {
			println("That's craps. You lose.");
		} else {
			int point = total;
			println("Your point is " + point + ".");
			while (true) {
				total = rollTwoDice();
				if (total == point) {
					println("You made your point. You win.");
					break;
				} else if (total == 7) {
					println("That's a7. You lose.");
					break;
				}
			}
		}
	}
	
	// Method
	private int rollTwoDice() {
//		RandomGenerator rgen = new RandomGenerator();
		int dl = rgen.nextInt(1, 6);
		int d2 = rgen.nextInt(1, 6);
		int total = dl + d2;
		println("Rolling dice: "+ dl+ "+" +d2+" =" + total);
		return total;
	}
	
	// It's on INSTANCE or OBJECT of the RandomGenerator CLASS 
	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private RandomGenerator rgen = new RandomGenerator(); // It DOES the exact SAME Thing
}