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
package de.jwic.samples.sample1;

import java.util.List;

import de.jwic.base.Control;
import de.jwic.base.IControlContainer;
import de.jwic.util.SerObservable;
import de.jwic.util.SerObserver;

/**
 * This control displays a list of attachments and a link to open them.
 * @author lippisch
 */
public class AttachmentListControl extends Control {

	private AttachmentListModel model;
	
	/**
	 * @param container
	 * @param name
	 */
	public AttachmentListControl(IControlContainer container, String name, AttachmentListModel model) {
		super(container, name);
		this.model = model;	
		
		model.addObserver(new SerObserver() {
			public void update(SerObservable o, Object arg) {
				onModelUpdated();
			}
		});
		
	}
	
	/**
	 * 
	 */
	protected void onModelUpdated() {
		requireRedraw();		
	}

	public List<String> getNames() {
		return model.getAttachmentNames();
	}

}
