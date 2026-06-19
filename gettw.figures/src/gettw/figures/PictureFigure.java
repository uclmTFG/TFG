package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class PictureFigure extends ImageFigure {
	public PictureFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/picture64.png").createImage(), 0);
	}

}
