package de.jwic.mobile10;

import java.util.ArrayList;
import java.util.List;

import de.jwic.base.Application;
import de.jwic.base.Control;
import de.jwic.base.IControlContainer;
import de.jwic.mobile10.demos.AudioPage;
import de.jwic.mobile10.demos.InputDemo;
import de.jwic.mobile10.demos.SelectMenuDemo10;
import de.jwic.mobile10.demos.VideoDevPage;

public class MobileDemoApplication extends Application {

	@Override
	public Control createRootControl(IControlContainer container) {
		
		final List<MobileDemoModule> mobileDemoModules = new ArrayList<MobileDemoModule>();

		mobileDemoModules.add(new AudioPage());
		mobileDemoModules.add(new VideoDevPage());
		mobileDemoModules.add(new SelectMenuDemo10());
		mobileDemoModules.add(new InputDemo());
		
		return new MobileDemoPage(container, "demoPage", mobileDemoModules);
	}
}
