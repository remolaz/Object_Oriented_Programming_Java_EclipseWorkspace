package HelloWorldPackage;

public class _7_EmbeddedInteger {
	
	private int value;

	public _7_EmbeddedInteger(int n) {
		value = n;
	}
	
	public void setValue(int n) {
		value = n;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		return "" + value;
	}
	
}
