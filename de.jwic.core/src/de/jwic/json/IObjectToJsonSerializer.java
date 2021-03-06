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
package de.jwic.json;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONWriter;

/**
 * Serialize an object to a JsonWriter output stream.
 * @author lippisch
 */
public interface IObjectToJsonSerializer extends Serializable {

	/**
	 * Serialize an object.
	 * @param object
	 * @param writer
	 * @throws JSONException
	 */
	public void serialize(Object object, JSONWriter writer) throws JSONException;
	
}
