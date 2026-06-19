package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class SuperscriptFigure extends ImageFigure {
	public SuperscriptFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/superscript64.png").createImage(), 0);
	}

}
