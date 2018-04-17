/*
 * Copyright (c) NetApp Inc. - All Rights Reserved
 * 
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 * 
 * de.jwic.controls.slickgrid.ISlickGridDataProvider 
 */
package de.jwic.controls.slickgrid;

import java.util.Collection;
import java.util.Iterator;

/**
 * A basic data provider for the SlickGrid, having a collection of objects as the underlying data.
 * 
 * @author Adrian Ionescu
 */
public abstract class SlickGridListDataProvider<P> implements ISlickGridDataProvider<P> {
	
	private static final long serialVersionUID = 1745242796877394936L;
	
	private Collection<P> data;
	
	/**
	 * 
	 */
	public SlickGridListDataProvider(Collection<P> data) {
		this.data = data;
	}
	
	/* (non-Javadoc)
	 * @see de.jwic.controls.slickgrid.ISlickGridDataProvider#getDataIterator()
	 */
	@Override
	public Iterator<P> getDataIterator() {
		return data.iterator();
	}
}