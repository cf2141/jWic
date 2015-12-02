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
package de.jwic.controls.tableviewer;

import java.io.Serializable;

/**
 * Provides label, image and style information for a specified cell by
 * setting the values on a CellLabel object.
 *  
 * @author Florian Lippisch
 */
public interface ITableLabelProvider extends Serializable {

	/**
	 * Returns the CellLabel object that is used to render the content for the
	 * specific object and column. A CellLabel object may contain text, image and
	 * or style informations. 
	 * 
	 * @param row
	 * @param column
	 * @param rowContext
	 */
	public CellLabel getCellLabel(Object row, TableColumn column, RowContext rowContext);
	
}
