package HelloWorldPackage;

import acm.program.*;

public class _11_IdentityMatrix extends ConsoleProgram{
	
	static double[][] identityMatrix = {
			{ 1.0, 0.0, 0.0 },
			{ 0.0, 1.0, 0.0 },
			{ 0.0, 0.0, 1.0 },
			{ 0.0, 0.0, 1.0 },
			};
	
	public void run() {
		
		displayBoard(identityMatrix);

	}

	private void displayBoard(double[][] board) {
		
		for (int row = 0; row < board.length; row++) {
			if (row > 0) println("-----+-----+-----");
			print(" ");
			for (int col = 0; col < board[0].length; col++) {
				if (col > 0) print(" | ");
				print (board [row] [col]);
			}
			println();
		}
	
	}
	
}
