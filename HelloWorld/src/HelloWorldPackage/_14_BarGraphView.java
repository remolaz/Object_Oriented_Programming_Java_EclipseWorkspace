package HelloWorldPackage;

import acm.graphics.*;

public class _14_BarGraphView extends _14_HousePointsView {

	private static final double BAR_WIDTH = 20;
	
	public _14_BarGraphView(double width, double height) {
		super(width, height);
	}

	public void createGraph(int[] data) {
		int n = data.length;
		double max = maxIntArray (data) ;
		if (max == 0) return;
		double sep = (getWidth() - n * BAR_WIDTH) / (n + 1);
		for (int i = 0; i <n; i++) {
			double height = data[i] / max * getHeight();
			double x = i * (BAR_WIDTH + sep);
			double y = getHeight() - height;
			GRect bar = new GRect(x, y, BAR_WIDTH, height);
			bar.setFilled(true) ;
			bar. setFillColor (getColorForIndex(i));
			add(bar);
		}
	}

	private int maxIntArray(int[] array) {
		if (array.length == 0) return 0;
		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			largest = Math.max(largest, array[i]);
		}
		return largest;
	}

}