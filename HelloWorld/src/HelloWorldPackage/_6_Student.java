package HelloWorldPackage;

/** Here I'm declaring the Student class
 * 
 * @author Remo
 *
 */

// Here I'm just defining a class, there is no public void run{} -method in the class

public class _6_Student {
	
	// PUBLIC (PRIVATE): (not)accessible for all programs 
	
	/* STATIC: A static variable is common to all the instances (or objects) of the class because it is a class level variable.
	* In other words you can say that only a single copy of static variable is created and shared among all the instances of the class.
	* Memory allocation for such variables only happens once when the class is loaded in the memory.
	*/
	
	// FINAL: can be initialized only once
	public static final double CREDITS_TO_GRADUATE = 32.0; 
	
	// PRIVATE: only accessible for this class
	private String studentName; 
	private int studentID;
	private double creditsEarned = 0;
	private boolean paidUp = false;

//	// CONSTRUCTOR: no results and same name of the class
//	public Student (String name, int id) {
//		studentName = name;
//		studentID = id;
//	}
	
	// ALTERNATIVE CONSTRUCTOR: no results and same name of the class
	public _6_Student (String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
	}

	public String getName() {
		return studentName;
	}

	public int getID() {
		return studentID;
	}
	
	public void setCredits(double credits) {
		creditsEarned = credits;
	}
	
	public double getCredits() {
		return creditsEarned;
	}
	
	public void setPaidUp(boolean flag) {
		paidUp = flag;
	}
	
	public boolean isPaidUp() {
		return paidUp;
	}
	
	public String toString() {
	return studentName + " (#" + studentID + ")";
	}
	
}

