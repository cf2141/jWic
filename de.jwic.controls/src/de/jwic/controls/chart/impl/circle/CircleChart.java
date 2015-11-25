package de.jwic.controls.chart.impl.circle;

import de.jwic.base.IControlContainer;
import de.jwic.controls.chart.api.Chart;
import de.jwic.controls.chart.api.ChartType;
import de.jwic.controls.chart.api.SimpleValueDatasetModel;

/**
 * 
 * @author Karolina Marek (karolina-marek.eu)
 *
 * @date 29.11.2015
 */
public class CircleChart extends
		Chart<SimpleValueDatasetModel, CircleChartConfiguration> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5777810923589673770L;

	public CircleChart(IControlContainer container, String name,
			SimpleValueDatasetModel model) {
		super(container, name, ChartType.CIRCLE, model);
		setConfiguration(new CircleChartConfiguration());

	}

}