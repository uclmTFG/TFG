package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class RectangleFigure extends ImageFigure {
	public RectangleFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/rectangle64.png").createImage(), 0);
	}

}