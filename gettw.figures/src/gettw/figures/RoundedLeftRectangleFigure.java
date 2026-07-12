package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class RoundedLeftRectangleFigure extends ImageFigure {
	public RoundedLeftRectangleFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/rounded_left_rectangle64.png").createImage(), 0);
	}

}
