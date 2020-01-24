package HelloWorldPackage;

import acm.program.*;
import acm.graphics.*;

public class _12_SearchMethods extends ConsoleProgram{
	
	/*
		These methods are declared as public because they are likely to serve the needs of
		external clients. After all.
		The methods are declared as static because they don’t depend on any instance
		variables in their class. Any client can call these methods without having to create
		an object of the class in which the methods are defined.
		
		Ex : new int researchIndx = _12_SearchMethods.linearSearch(value, array);
		
	 */
	
	public void run() {
		
	}

	public static int linearSearch(int key, int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) return i;
		}
		return -1;
	}
	
	public static int binarySearch(String key, String[] array) {
		int lh = 0;
		int rh = array.length - 1;
		while (lh <= rh) {
			int mid = (lh + rh) / 2;
			int cmp = key.compareTo(array [mid] );
			if (cmp == 0) return mid;
			if (cmp < 0) {
				rh = mid - 1;
			} else {
				lh = mid + 1;
			}
		}
		return -1;
	}
	
	public static void swapElements(int[] array, int p1, int p2) {
	int temp = array[p1];
	array[p1] = array[p2];
	array[p2] = temp;
}
	
}
	