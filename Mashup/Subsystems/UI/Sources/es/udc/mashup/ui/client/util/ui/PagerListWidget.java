package es.udc.mashup.ui.client.util.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;

class PagerListWidget extends Composite implements TableListener {

	public interface Listener {
		/**
		 * @param row
		 *            data column number (0 for the first data column)
		 */
		public void onDataRowClicked(int row);
	}

	private String[] columnNames;

	private int numberOfDataRows;

	private Listener listener;

	private int numberOfUsedDataRows;

	private int currentSeletedRow;

	private Grid grid;

	public PagerListWidget(String[] columnNames, int numberOfDataRows,
			Listener listener) {

		this.columnNames = columnNames;
		this.numberOfDataRows = numberOfDataRows;
		this.listener = listener;
		numberOfUsedDataRows = 0;
		currentSeletedRow = 0;

		/* Create grid. */
		grid = new Grid(1 + numberOfDataRows, columnNames.length);

		grid.addTableListener(this);

		/* Set header. */
		for (int i = 0; i < columnNames.length; i++) {
			grid.setText(0, i, columnNames[i]);
			grid.getCellFormatter().setStyleName(0, i, "HeaderCell");
		}

		/* initalize widget. */
		initWidget(grid);

		/* Set CSS style name for this widget. */
		setStyleName("Mashup-PagerListWidget");

	}

	public void setList(String[][] items, int startIndex) {

		/* Unselect current row. */
		unselectCurrentRow();

		/* Insert items in rows. */
		if (startIndex + numberOfDataRows < items.length) {
			numberOfUsedDataRows = numberOfDataRows;
		} else {
			numberOfUsedDataRows = items.length - startIndex;
		}

		int row = 1;

		for (int i = startIndex; i < (startIndex + numberOfUsedDataRows); i++) {
			for (int j = 0; j < columnNames.length; j++) {
				grid.setText(row, j, items[i][j]);
			}
			row++;
		}

		/* Clear rest of rows. */
		for (int i = row; i <= numberOfDataRows; i++) {
			for (int j = 0; j < columnNames.length; j++) {
				grid.clearCell(i, j);
			}
		}

		/* Select first row and generate event. */
		if (numberOfUsedDataRows > 0) {
			selectRow(1);
			onCellClicked(null, 1, 0);
		}

	}

	public void clearList() {

		unselectCurrentRow();

		numberOfUsedDataRows = 0;
		currentSeletedRow = 0;

		for (int i = 1; i <= numberOfDataRows; i++) {
			for (int j = 0; j < columnNames.length; j++) {
				grid.clearCell(i, j);
			}

		}

	}

	public void onCellClicked(SourcesTableEvents sender, int row, int cell) {

		if (row >= 1 && row <= numberOfUsedDataRows) {
			unselectCurrentRow();
			selectRow(row);
			listener.onDataRowClicked(row - 1);
		}

	}

	private void selectRow(int row) {

		for (int i = 0; i < columnNames.length; i++) {
			grid.getCellFormatter().setStyleName(row, i, "SelectedCell");
		}
		currentSeletedRow = row;

	}

	private void unselectCurrentRow() {

		if (currentSeletedRow > 0) {
			for (int i = 0; i < columnNames.length; i++) {
				grid.getCellFormatter().removeStyleName(currentSeletedRow, i,
						"SelectedCell");
			}
		}

	}

}
