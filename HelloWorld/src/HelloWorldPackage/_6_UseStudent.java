package HelloWorldPackage;

import acm.program.*;

public class _6_UseStudent extends ConsoleProgram {

	private _6_Student topStudent = new _6_Student ("Hermione Granger", 123456789);
	
	public void run() {
		
		println("The top student name is: " + topStudent.getName() );
		println("The top student ID is: " + topStudent.getID() );
		println("The top student has: " + topStudent.getCredits() + " credits" );
		println(topStudent.toString() );
				
		println( topStudent.isPaidUp() ? "PAID" : "Not PAID");
		// The above is equivalent to:
		if (topStudent.isPaidUp()) {
			println("PAID");
		} else {
			println("Not PAID");
		}
		
		println( isEligibleToGraduate(topStudent) ? "CAN Graduate" : "CAN Not Graduate");
		
	}
	
	private boolean isEligibleToGraduate(_6_Student _6_Student) {
		return _6_Student.getCredits() >= _6_Student.CREDITS_TO_GRADUATE && _6_Student.isPaidUp();
	}

}