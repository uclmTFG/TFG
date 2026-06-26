package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class RoundedRightRectangleFigure extends ImageFigure {
	public RoundedRightRectangleFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/rounded_right_rectangle64.png").createImage(), 0);
	}

}
