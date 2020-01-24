package HelloWorldPackage;

import java.util.*;

public class _14_HousePointsModel {
	
	private int[] housePoints;
	private ArrayList views;
	
	public _14_HousePointsModel() {
		housePoints = new int[0];
		views = new ArrayList();
	}

	public void addview(_14_HousePointsView view) {
		views.add(view) ;
	}

	public void setHousePoints(int[] points) {
		housePoints = new int[points. length];
		for (int i = 0; i < points.length; i++) {
			housePoints[i] = points[i];
		}
		notifyViews ();
	}

	public int[] getHousePoints() {
		int[] points = new int[housePoints.length];
		for (int i = 0; i < points.length; i++) {
			points[i] = housePoints[i];
		}
		return points;
	}

	private void notifyViews() {
		for (int i = 0; i < views.size(); i++) {
			_14_HousePointsView view = (_14_HousePointsView) views.get (i);
			view.update(this);
		}
	}

}