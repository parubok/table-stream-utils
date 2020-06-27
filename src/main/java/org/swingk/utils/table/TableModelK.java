package org.swingk.utils.table;

import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;

/**
 * Subclass of {@link DefaultTableModel} with support of column classes.
 */
public class TableModelK extends DefaultTableModel {

    private final Map<Integer, Class<?>> columnClasses = new HashMap<>();

    public TableModelK(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses.getOrDefault(columnIndex, Object.class);
    }

    public void setColumnClass(int columnIndex, Class<?> columnClass) {
        columnClasses.put(columnIndex, columnClass);
    }
}
