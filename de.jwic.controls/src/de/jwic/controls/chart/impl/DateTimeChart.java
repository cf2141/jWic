package de.jwic.controls.chart.impl;

import de.jwic.base.IControlContainer;
import de.jwic.controls.chart.api.Chart;
import de.jwic.controls.chart.api.ChartType;

/**
 * 
 * @author Karolina Marek (karolina-marek.eu)
 *
 * @date 08.12.2015
 */
public class DateTimeChart extends
		Chart<DateTimeChartModel, DateTimeChartConfiguration> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8659387226581875727L;

	/**
	 * 
	 * @param container
	 * @param name
	 * @param model
	 */
	public DateTimeChart(IControlContainer container, String name,
			DateTimeChartModel model) {
		super(container, name, ChartType.DATE_TIME, model);
		setConfiguration(new DateTimeChartConfiguration());

	}

}
