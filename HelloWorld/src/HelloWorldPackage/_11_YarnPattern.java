package HelloWorldPackage;

import acm.graphics.*;
import acm. program. *;
import java.awt.*;

public class _11_YarnPattern extends GraphicsProgram {
	
	private static final int DELTA = 67; 
	private static final int PEG_SEP = 10; 
	private static final int N_ACROSS = 50; 
	private static final int N_DOWN = 30; 
	private static final int N_PEGS = 2 * N_ACROSS + 2 * N_DOWN;
	
	private GPoint[] pegs = new GPoint[N_PEGS];
	
	public void run() {
		initPegArray();
		int thisPeg = 0;
		int nextPeg = -1;
		while (thisPeg != 0 || nextPeg == -1) {
			nextPeg = (thisPeg + DELTA) % N_PEGS;
			GPoint pO = pegs[thisPeg];
			GPoint pl = pegs[nextPeg];
			GLine line = new GLine(pO.getX(), pO.getY(), pl.getX(), pl.getY());
			line.setColor(Color.MAGENTA) ;
			add (line);
			thisPeg = nextPeg;
		}
	}

	private void initPegArray() {
		int pegIndex = 0;
		for (int i = 0; i < N_ACROSS; i++) {
			pegs[pegIndex++] = new GPoint(i * PEG_SEP, 0);
			/*
 				The effect, therefore, of the statement
				pegs[pegIndex++] = new GPoint( .. . );
				is to assign the GPoint value to the element of the pegs array at the index specified
				by the current value of pegIndex, but then to increment pegIndex so that it
				indicates the next element position for the next cycle of the loop.
			 */	
		}
		for (int i = 0; i < N_DOWN; i++) {
			pegs[pegIndex++] = new GPoint(N_ACROSS * PEG_SEP, i * PEG_SEP);
		}
		for (int i = N_ACROSS; i > 0; i--) {
			pegs[pegIndex++] = new GPoint(i * PEG_SEP, N_DOWN * PEG_SEP);
		}
		for (int i = N_DOWN; i > 0; i--) {
			pegs[pegIndex++] = new GPoint(0, i * PEG_SEP);
		}
	}
	
}