package HelloWorldPackage;

import acm.program.*;
import acm.graphics.*;

public class _11_ImagesMethods extends ConsoleProgram{
	
	/*
		These methods are declared as public because they are likely to serve the needs of
		external clients. After all.
		The methods are declared as static because they don’t depend on any instance
		variables in their class. Any client can call these methods without having to create
		an object of the class in which the methods are defined.
		
		Ex : new GImage FlipImage = _11_ImagesMethods.flipVertical("MyImage.jpg");
		
	 */
	
	public void run() {
		
	}

	public static GImage flipVertical(GImage image) {
		
		int[][] array = image.getPixelArray();
		int height = array.length;
		for (int p1 = 0; p1 < height / 2; p1++) {
		int p2 = height - p1 - 1;
		int[] temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
		}
		return new GImage (array) ;
		
	}

	public static GImage createGrayscaleImage(GImage image) {
		
		int[][] array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		for (int i= 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int pixel = array[i][j];
				int red = (pixel >> 16) & 0xFF;
				int green = (pixel >> 8) & 0xFF;
				int blue = pixel & 0xFF;
				int xx = computeLuminosity(red, green, blue);
				pixel = (0xFF << 24) | (xx << 16) | (xx << 8) | xx;
				array[i][j] = pixel;
			}
		}
		return new GImage (array) ;
		
	}
	
	public static int computeLuminosity(int r, int g, int b) {
		return GMath.round(0.299 * r + 0.587 * g + 0.114 * b);
	}
	
	public static GImage applyAveragingFilter(GImage image) {
		
		int [][] array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int xx = averageNeighborLuminosity(array, i, j);
				array[i][j] = (0xFF << 24) | (xx << 16) | (xx << 8) | xx;
			}
		}
		return new GImage(array);
	}

	public static int averageNeighborLuminosity(int[][] array, int i, int j) {
		
		int sum = getLuminosity(array, i, j);
		int count = 1;
		if (i > 0) {
			sum += getLuminosity(array, i - 1, j);
			count++;
		}
		if (i < array.length - 1) {
			sum += getLuminosity(array, i + 1, 4);
			count++;
		}
		if (j > 0) {
			sum += getLuminosity(array, i, j - 1);
			count++;
		}
		if (j < array[0].length - 1) {
			sum += getLuminosity(array, i, j + 1);
			count++;
		}
		return GMath.round((double) sum / count);
	}

	public static int getLuminosity(int[][] array, int i, int j) {
		
		int pixel = array[i][j];
		int red = (pixel >> 16) & 0xFF;
		int green = (pixel >> 8) & 0xFF;
		int blue = pixel & 0xFF;
		return GMath.round(0.299 * red + 0.587 * green + 0.114 * blue);
	}
	
	public static int getRed(int pixel) {
		return (pixel >> 16) & 0xFF;
	
	}
	
	public static int getGreen(int pixel) {
		return (pixel >> 8) & 0xFF;
	}
	
	public static int getBlue(int pixel) {
		return pixel & 0xFF;
	}
	
	public static int createRGBPixel(int r, int g, int b) {
		return (0xFF << 24) | (r << 16) | (g << 8) | b;
	}
	
}
	