package HelloWorldPackage;

import acm.graphics.*;
import java.awt.*;

public abstract class _14_HousePointsView extends GCompound {
	
	private static final Color[] COLORS = {
			Color.RED, Color. YELLOW, Color.BLUE, Color.GREEN,
			Color.PINK, Color.CYAN, Color.MAGENTA, Color.ORANGE
	};
		
	private GRect background;

	public _14_HousePointsView(double width, double height) {
		background = new GRect (width, height) ;
		background. setFilled(true);
		background. setColor (Color .WHITE) ;
	}

	public abstract void createGraph(int[] data);

	public void update(_14_HousePointsModel model) {
		removeAll ();
		add (background) ;
		createGraph (model.getHousePoints());
	}

	public Color getColorForIndex(int k) {
		return COLORS[k % COLORS.length];
	}

}
