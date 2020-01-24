package HelloWorldPackage;

public class _6_Rational {
	
	/* Private instance variables */
	private int num; /* The numerator of this Rational */
	private int den; /* The denominator of this Rational */
	
	/** Creates a new Rational initialized to zero. */	
	// Multiple CONSTRUCTORS

		public _6_Rational() {
			this(0);
		}
		
		public _6_Rational(int n) {
			this(n, 1);
		}
		// THIS IS USED TO DELEGATE THE CREATION OF THIS OBJECT TO ANOTHER CONSTRUCTOR
		
		public _6_Rational(int x, int y) {
			int g = gcd(Math.abs(x), Math.abs(y));
			num = x / g;
			den = Math.abs(y) / g;
			if (y < 0) num = -num;
		}
	
	// PUBLIC METHODS: clients can call these methods
		public _6_Rational add(_6_Rational r) {
			return new _6_Rational(this.num * r.den + r.num * this.den, this.den * r.den);
		}
		// This IS USED HERE TO REFER num AND den TO THE OBJECT
			
		public _6_Rational subtract (_6_Rational r) {
			return new _6_Rational(this.num * r.den - r.num * this.den, this.den * r.den);
		}
			
		public _6_Rational multiply(_6_Rational r) {
			return new _6_Rational(this.num * r.num, this.den * r.den);
		}
		
		public _6_Rational divide(_6_Rational r) {
			return new _6_Rational(this.num * r.den, this.den * r.num);
		}
		
		public String toString() {
			if (den == 1) {
				return "" + num; // THIS converts an int to String
			} else {
				return num + "/" + den;
			}
		}
		
	// PRIVATE METHODS: this method won't be called from the client of the class
		private int gcd(int x, int y) {
			int r= x % y;
			while (r != 0) {
				x = y;
				y = r;
				r = x % y;
			}
			return y;
		}

}

