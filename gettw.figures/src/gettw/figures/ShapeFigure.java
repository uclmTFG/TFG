package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class ShapeFigure extends ImageFigure {
	public ShapeFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/shape64.png").createImage(), 0);
	}

}
