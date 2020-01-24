package HelloWorldPackage;

import acm.program.*;

public class _3_Add2IntegersPoP extends DialogProgram {
	
	public void run() {
		println("This program adds two integers.");
		int nl = readInt("Enter int1: ");
		double n2 = readDouble("Enter double2: ");
		double total = nl + n2 + CENTIMETERS_PER_INCH;
		println("The total is " + total + ".");
		print("Cool!");print(":)");
	}
	
	private static final double CENTIMETERS_PER_INCH = 2.54;
	
}