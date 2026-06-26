package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TriangleRightFigure extends ImageFigure {
	public TriangleRightFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/triangle_right64.png").createImage(), 0);
	}

}
