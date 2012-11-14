/*
 * Copyright 2005-2007 jWic group (http://www.jwic.de)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * de.jwic.samples.controls.ComboDropDownDemo
 * Created on Jan 9, 2010
 * $Id: ComboMultiSelectDemo.java,v 1.1 2010/04/22 16:00:11 lordsam Exp $
 */
package de.jwic.samples.controls;

import de.jwic.base.ControlContainer;
import de.jwic.base.IControlContainer;
import de.jwic.base.ImageRef;
import de.jwic.controls.LabelControl;
import de.jwic.controls.combo.DropDown;
import de.jwic.events.ElementSelectedEvent;
import de.jwic.events.ElementSelectedListener;
import de.jwic.samples.controls.propeditor.PropertyEditorView;

/**
 *
 * @author lippisch
 */
public class ComboMultiSelectDemo extends ControlContainer {

	private LabelControl lbResult;
	private DropDown cmColor;
	
	/**
	 * @param container
	 * @param name
	 */
	public ComboMultiSelectDemo(IControlContainer container, String name) {
		super(container, name);

		cmColor = new DropDown(this, "combo");
		cmColor.setMultiSelect(true);
		cmColor.setWidth(200);
		cmColor.setEmptyInfoText("Choose a color");
		cmColor.addElement("Green", "00A000", new ImageRef("icons/flag_green.png"));
		cmColor.addElement("Dark Green", "006000");
		cmColor.addElement("Light Green", "00FF00");
		cmColor.addElement("Blue", "0000A0", new ImageRef("icons/flag_blue.png"));
		cmColor.addElement("Dark Blue", "000060");
		cmColor.addElement("Light Blue", "0000FF");
		cmColor.addElement("Cyan", "00A0A0");
		cmColor.addElement("Dark Cyan", "006060");
		cmColor.addElement("Light Cyan", "00FFFF");
		cmColor.addElement("Red", "A00000", new ImageRef("icons/flag_red.png"));
		cmColor.addElement("Dark Red", "600000");
		cmColor.addElement("Light Red", "FF0000");
		cmColor.addElement("Orange", "FF6A00", new ImageRef("icons/flag_orange.png"));
		cmColor.addElement("Yellow", "FFD800", new ImageRef("icons/flag_yellow.png"));
		cmColor.addElement("Pink", "FF00DC", new ImageRef("icons/flag_pink.png"));
		cmColor.addElement("Black", "000000");
		cmColor.addElement("Gray", "A0A0A0");
		cmColor.addElement("Dark Gray", "606060");
		cmColor.addElement("White", "FFFFFF");
		cmColor.addElementSelectedListener(new ElementSelectedListener() {
			public void elementSelected(ElementSelectedEvent event) {
				updateLabel();				
			}
		});
		
		cmColor.setDefaultImage(new ImageRef("/jwic/gfx/clear.gif", 16, 16));

		lbResult = new LabelControl(this, "lbResult");
		lbResult.setText("");
		
		// create the property editor
		PropertyEditorView propEditor = new PropertyEditorView(this, "propEditor");
		propEditor.setBean(cmColor);

	}
	
	public void updateLabel() {
		
		lbResult.setText(cmColor.getSelectedKey());	
		
		
	}

}
