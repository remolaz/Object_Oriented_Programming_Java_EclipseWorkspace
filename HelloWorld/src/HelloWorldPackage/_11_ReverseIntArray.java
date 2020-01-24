package HelloWorldPackage;

import acm.program.*;

public class _11_ReverseIntArray extends ConsoleProgram {
	
	private static final int N_VALUES = 5;
	
	public void run() {
		int[] array = new int[N_VALUES];
		println("This program reverses an integer array.");
		readArray (array) ;
		reverseArray (array) ;
		printArray (array);
	}

	private void readArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = readInt(" ? ");
		}
	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			println(array[i]);
		}
	}
	
	private void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			swapElements(array, i, array.length - i - 1);
		}
	}

	private void swapElements(int[] array, int p1, int p2) {
		int temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}

}
