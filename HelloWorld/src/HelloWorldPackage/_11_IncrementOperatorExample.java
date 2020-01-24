package HelloWorldPackage;

import acm.program. *;

public class _11_IncrementOperatorExample extends ConsoleProgram {
	
	private static final int INITIAL_VALUE = 5;
	
	public void run() {
		
		int x = INITIAL_VALUE;
		println("If x initially has the value " + x + ", after doing  int result = ++x;");
		int result = ++x;
		println(" x is " + x + " and result is " + result + ".");
		x = INITIAL_VALUE;
		println("Conversely, if x has the value " + x + ", after doing  int result = x++;");
		result = x++;
		println(" x is "+ x + " and result is " + result + ".");
		
	}
	
}

/*
	If x initially has the value 5, after doing  int result = ++x;
	 x is 6 and result is 6.
	Conversely, if x has the value 5, after doing  int result = x++;
	 x is 6 and result is 5.
*/