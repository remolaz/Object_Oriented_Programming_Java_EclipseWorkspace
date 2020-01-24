package HelloWorldPackage;

import acm.program.*;

public class _11_GymnasticsJudge extends ConsoleProgram{
	
	public void run() {
		int nJudges = readInt("Enter number of judges: ");
		double[] scores = new double[nJudges];
		for (int i = 0; i < nJudges; i++) {
		scores[i] = readDouble("Score for judge "+ i+ ": ");
		}
		double total = 0;
		for (int i = 0; i < nJudges; i++) {
		total += scores[i];
		}
		double averageScore = total / nJudges;
		println("The average score is " + averageScore);
		}

}
