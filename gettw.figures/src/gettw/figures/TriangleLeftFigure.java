package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TriangleLeftFigure extends ImageFigure {
	public TriangleLeftFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/triangle_left64.png").createImage(), 0);
	}

}