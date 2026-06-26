package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TriangleFigure extends ImageFigure {
	public TriangleFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/triangle64.png").createImage(), 0);
	}

}
