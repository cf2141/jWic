package de.jwic.mobile05;

import java.util.ArrayList;
import java.util.List;

import de.jwic.base.Application;
import de.jwic.base.Control;
import de.jwic.base.IControlContainer;
import de.jwic.mobile05.demos.CheckBoxDemo;
import de.jwic.mobile05.demos.EchoTable;
import de.jwic.mobile05.demos.FlipSwitchDemo;
import de.jwic.mobile05.demos.InputDemo;
import de.jwic.mobile05.demos.SelectMenuDemo05;

/**
 * Created by boogie on 10/27/14.
 */
public class MobileDemoApplication extends Application {

	@Override
	public Control createRootControl(IControlContainer container) {
		
		final List<MobileDemoModule> mobileDemoModules = new ArrayList<MobileDemoModule>();

		mobileDemoModules.add(new CheckBoxDemo());
		mobileDemoModules.add(new EchoTable());
		mobileDemoModules.add(new FlipSwitchDemo());
		mobileDemoModules.add(new InputDemo());
		mobileDemoModules.add(new SelectMenuDemo05());
		
		return new MobileDemoPage(container, "demoPage", mobileDemoModules);
	}
}
