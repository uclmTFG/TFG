package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TriangleDownFigure extends ImageFigure {
	public TriangleDownFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/triangle_down64.png").createImage(), 0);
	}

}
