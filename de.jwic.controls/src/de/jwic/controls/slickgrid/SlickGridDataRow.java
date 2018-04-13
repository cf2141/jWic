/*
 * Copyright (c) NetApp Inc. - All Rights Reserved
 * 
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 * 
 * de.jwic.controls.slickgrid.SlickGridData 
 */
package de.jwic.controls.slickgrid;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Adrian Ionescu
 */
public class SlickGridDataRow implements Serializable {
	
	private static final long serialVersionUID = 671484606921050314L;
	
	private Map<String, Object> map;
	
	/**
	 * 
	 */
	public SlickGridDataRow() {
		map = new LinkedHashMap<>();
		
	}
	
	/**
	 * @param column
	 * @param value
	 */
	public void setValue(SlickGridColumn column, Object value) {
		map.put(column.getField(), value);
	}
	
	/**
	 * @return the map
	 */
	public Map<String, Object> getMap() {
		return map;
	}
}