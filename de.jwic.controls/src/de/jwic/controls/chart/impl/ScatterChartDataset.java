package de.jwic.controls.chart.impl;

import java.util.HashMap;
import java.util.Map;

import de.jwic.controls.chart.api.ChartDataset;
import de.jwic.controls.chart.impl.util.DataConverter;

/**
 * 
 * @author Karolina Marek (karolina-marek.eu)
 *
 * @date 08.12.2015
 */
public class ScatterChartDataset extends ChartDataset {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5542485131372000461L;

	private Map<String, Double> values = new HashMap<String, Double>();

	private String pointColor = "#F16220";

	private String pointStrokeColor = "#66ff33";

	private String strokeColor = "#F16220";

	public ScatterChartDataset(String label, Map<String, Double> dataModel) {
		super(label);
		this.values = dataModel;

	}

	/**
	 * 
	 * @return
	 */
	public Map<String, Double> getValues() {
		return values;
	}

	/**
	 * 
	 * @param values
	 */
	public void setValues(Map<String, Double> values) {
		this.values = values;
	}

	public void add(String label, Double value) {
		values.put(label, value);
	}

	/**
	 * 
	 * @return
	 */
	public String getPointColor() {
		return pointColor;
	}

	/**
	 * 
	 * @param pointColor
	 */
	public void setPointColor(String pointColor) {
		String color = DataConverter.convertToJSColor(pointColor);
		if (color != null) {
			this.pointColor = color;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getPointStrokeColor() {
		return pointStrokeColor;
	}

	/**
	 * 
	 * @param pointStrokeColor
	 */
	public void setPointStrokeColor(String pointStrokeColor) {
		String color = DataConverter.convertToJSColor(pointStrokeColor);
		if (color != null) {
			this.pointStrokeColor = color;
		}

	}

	/**
	 * 
	 * @return
	 */
	public String getStrokeColor() {
		return strokeColor;
	}

	/**
	 * 
	 * @param strokeColor
	 */
	public void setStrokeColor(String strokeColor) {
		String color = DataConverter.convertToJSColor(strokeColor);
		if (color != null) {
			this.strokeColor = color;
		}
	}

}
