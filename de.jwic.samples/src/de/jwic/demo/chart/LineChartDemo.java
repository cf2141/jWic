package de.jwic.demo.chart;

import java.util.ArrayList;
import java.util.List;

import de.jwic.base.IControlContainer;
import de.jwic.controls.chart.api.exception.ChartInconsistencyException;
import de.jwic.controls.chart.impl.line.LineChart;
import de.jwic.controls.chart.impl.line.LineChartDataset;
import de.jwic.controls.chart.impl.line.LineChartModel;

public class LineChartDemo extends ChartDemo<LineChart, LineChartModel> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1899059941525891198L;

	public LineChartDemo(IControlContainer container)
			throws ChartInconsistencyException {
		super(container);

	}

	@Override
	protected LineChartModel createModel() {
		List<String> labels = new ArrayList<String>();
		labels.add("1");
		labels.add("2");
		labels.add("3");
		labels.add("4");
		labels.add("5");
		labels.add("6");
		labels.add("7");
		labels.add("8");
		List<LineChartDataset> datasets = new ArrayList<LineChartDataset>();
		List<String> values = new ArrayList<String>();
		values.add("28");
		values.add("48");
		values.add("40");
		values.add("10");
		values.add("25");
		values.add("30");
		values.add("10");
		values.add("2");
		LineChartDataset chartd1 = new LineChartDataset("First", values);

		datasets.add(chartd1);

		List<String> values2 = new ArrayList<String>();
		values2.add("1");
		values2.add("3");
		values2.add("12");
		values2.add("10");
		values2.add("2");
		values2.add("5");
		values2.add("7");
		values2.add("8");

		LineChartDataset chartd2 = new LineChartDataset("Second", values2);
		datasets.add(chartd2);

		LineChartModel model = new LineChartModel(labels, datasets);
		return model;
	}

	@Override
	protected List<TableElement> convertChartModelToTableElements() {
		List<TableElement> elements = new ArrayList<TableElement>();

		for (LineChartDataset set : model.getDatasets()) {
			int i = 0;
			for (String in : set.getData()) {
				TableElement el = new TableElement();
				el.setTitle(model.getLabels().get(i));
				el.setValue(in);
				elements.add(el);
				i++;
			}

		}

		return elements;

	}

	@Override
	protected LineChart createChart(LineChartModel model) {

		return new LineChart(this, "chart", model);
	}

	@Override
	protected void addElementToTheChart(TableElement element)
			throws ChartInconsistencyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateElementInChart(TableElement selectedTableElement)
			throws ChartInconsistencyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deleteElementFromChart(TableElement selectedTableElement)
			throws ChartInconsistencyException {
		// TODO Auto-generated method stub
		
	}

}
