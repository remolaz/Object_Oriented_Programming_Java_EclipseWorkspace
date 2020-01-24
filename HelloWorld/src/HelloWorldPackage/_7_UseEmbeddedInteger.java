package HelloWorldPackage;

import acm.program.ConsoleProgram;

public class _7_UseEmbeddedInteger extends ConsoleProgram {
	
	public void run() {
		
		int y = 17;
		increment_y(y);
		println("y = " + y);
		
		_7_EmbeddedInteger x = new _7_EmbeddedInteger (17);
		increment(x);
		println("x = " + x);
	}
	
	private void increment_y(int n_y) {
		n_y++;
		println("n_y = " + n_y);
	}
	
	private void increment (_7_EmbeddedInteger n_x) {
		n_x.setValue(n_x.getValue() + 1);
		println("n_x = " + n_x);
	}
		
}

// The intuitive effect of this difference in representation is that objects—in
// contrast to primitive values are shared between the calling method and the method
// being called. The underlying mechanism, however, is exactly the same. Whenever a
// new local variable is initialized, the old value is copied into the stack location for
// the new variable. If that value is an object, what gets copied is the reference and not
// the underlying value.