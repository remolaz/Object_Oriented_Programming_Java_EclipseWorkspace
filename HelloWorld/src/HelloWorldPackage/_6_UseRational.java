package HelloWorldPackage;

import acm.program.*;

public class _6_UseRational extends ConsoleProgram {

	public void run() {
		_6_Rational a = new _6_Rational (1, 2);
		_6_Rational b = new _6_Rational (1, 3);
		_6_Rational c = new _6_Rational (1, 6);
		
		_6_Rational sum = a.add(b).add(c);
		
		println(a + " + " + b + " + " + c + " = " + sum);
	}
	
}
