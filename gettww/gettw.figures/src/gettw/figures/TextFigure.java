package gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TextFigure extends ImageFigure {
	public TextFigure() {
		super(Activator.imageDescriptorFromPlugin(gettw.figures.Activator.PLUGIN_ID,
			"images/text64.png").createImage(), 0);
	}

}
