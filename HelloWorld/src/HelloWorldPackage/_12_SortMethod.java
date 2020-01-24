package HelloWorldPackage;

import acm.program.*;
import acm.graphics.*;

public class _12_SortMethod extends ConsoleProgram{
	
	/*
		These methods are declared as public because they are likely to serve the needs of
		external clients. After all.
		The methods are declared as static because they don’t depend on any instance
		variables in their class. Any client can call these methods without having to create
		an object of the class in which the methods are defined.
		
		Ex : new int researchIndx = _12_SearchMethods.linearSearch(value, array);
		
	 */
	
	public void run() {
		
		int [] array = {1,2,3,7,8,9,4,5,6,};
		println("The Input Array is:");
		printArray(array);
		println("The Sorted Input Array is:");
		sort(array);
		printArray(array);
		
	}

	private void printArray(int[] array) {
		print("[");
		for (int i=0;i<array.length;i++) {
			print(array[i]+", ");
		};
		print("]");
		println();
	}
	
	private void sort(int[] array) {
		for (int lh = 0; lh < array.length; lh++) {
			int rh = findSmallest(array, lh, array.length);
			_12_SearchMethods.swapElements (array, lh, rh);
		}
	}

	private int findSmallest(int[] array, int p1, int p2) {
		int smallestIndex = p1;
		for (int i = p1 + 1; i < p2; i++) {
			if (array[i] < array[smallestIndex]) smallestIndex = i;
		}
		return smallestIndex;
	}

//	private void swapElements(int[] array, int p1, int p2) {
//		int temp = array[p1];
//		array[p1] = array[p2];
//		array[p2] = temp;
//	}
	
}

	