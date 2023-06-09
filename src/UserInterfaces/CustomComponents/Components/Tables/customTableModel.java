package UserInterfaces.CustomComponents.Components.Tables;

import Controllers.TableController;

import javax.swing.table.AbstractTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class customTableModel extends AbstractTableModel {

    TableController controller;
    dataTable dataTable;
    ResultSetMetaData metaData;
    ResultSet resultSet;
    Vector<String> columns;
    @SuppressWarnings("rawtypes")
    Vector<Vector> rows;

    customTableModel(TableController controller, dataTable dataTable) {
        try {
            try (PreparedStatement pt = dataTable.getConnector().getConnection().prepareStatement("select * from " + dataTable.getTable())) {
                this.controller = controller;
                this.dataTable = dataTable;
                resultSet = pt.executeQuery();
                metaData = resultSet.getMetaData();
                columns = controller.getColumnNames(resultSet);
                rows = controller.getRowData(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        try {
            return metaData.getColumnCount();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vector<Object> temp = rows.elementAt(rowIndex);
        return temp.elementAt(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return columns.get(column);
    }
}
