/*******************************************************************************
 * Copyright 2015 xWic group (http://www.xwic.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *  
 *******************************************************************************/
package de.jwic.samples.controls;

import de.jwic.base.ControlContainer;
import de.jwic.base.IControlContainer;
import de.jwic.controls.TabControl;
import de.jwic.controls.TabStripControl;

/**
 *
 * @author lippisch
 */
public class RadioDemo extends ControlContainer {

	/**
	 * @param container
	 */
	public RadioDemo(IControlContainer container, String name) {
		super(container, name);

		TabStripControl tabStrip = new TabStripControl(this, "tab");
		
		TabControl tab = tabStrip.addTab("Radio Group");
		new RadioGroupDemo(tab);

		tab = tabStrip.addTab("Radio Button");
		new RadioButtonDemo(tab, "lsDemo");


	}


	
	
}
