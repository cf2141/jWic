package de.jwic.demo.chart;

import de.jwic.controls.tableviewer.CellLabel;
import de.jwic.controls.tableviewer.ITableLabelProvider;
import de.jwic.controls.tableviewer.RowContext;
import de.jwic.controls.tableviewer.TableColumn;

/**
 * 
 * @author Karolina Marek (karolina-marek.eu)
 *
 * @date 13.11.2015
 */
class LabelProvider implements ITableLabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.jwic.ecolib.tableviewer.ITableLabelProvider#writeCellLabel(de.jwic
	 * .ecolib.tableviewer.CellLabel, java.lang.Object,
	 * de.jwic.ecolib.tableviewer.TableColumn)
	 */
	public CellLabel getCellLabel(Object row, TableColumn column,
			RowContext context) {
		CellLabel cellLabel = new CellLabel();

		TableElement task = (TableElement) row;
		switch (column.getIndex()) {
		case 0:
			cellLabel.text = task.getTitle();
			break;
		case 1: // task
			cellLabel.text = task.getValue();
			break;

		}
		return cellLabel;
	}
}
