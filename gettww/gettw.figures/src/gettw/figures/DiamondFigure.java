package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class DiamondFigure extends ImageFigure {
	public DiamondFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/diamond64.png").createImage(), 0);
	}

}
