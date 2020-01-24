package HelloWorldPackage;

import acm.program.*;

public class _5_Combinations extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number of objects in the set (n): ");
		int k = readInt("Enter number to be chosen (k)}: ");
		println("c(" + n +", " + k + ") = " + combinations(n, k));
	}
	
	private int combinations(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
