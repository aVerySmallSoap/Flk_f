package UserInterfaces.CustomComponents.Components;

import Controllers.TableController;
import Interfaces.IConnector;
import Interfaces.Initializable;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

@SuppressWarnings("unused")
public class dataTable extends JTable implements Initializable{

    private final IConnector connector;
    private String table;

    public dataTable(IConnector connector){
        this.connector = connector;
        init();
    }

    public dataTable(IConnector connector, String table){
        this.connector = connector;
        this.table = table;
        init();
    }
    
    @Override
    public void init() {
        this.setModel(new customTableModel(new TableController(), this));
        this.setSelectionModel(new customSelectionModel(this));
    }

    public String getTable() {
        return table;
    }

    public IConnector getConnector() {
        return connector;
    }
}
class customTableModel extends AbstractTableModel {

    TableController controller;
    dataTable dataTable;
    ResultSetMetaData metaData;
    ResultSet resultSet;
    Vector<String> columns;
    @SuppressWarnings("rawtypes")
    Vector<Vector> rows;

    customTableModel(TableController controller, dataTable dataTable){
        try{
            try(PreparedStatement pt = dataTable.getConnector().getConnection().prepareStatement("select * from "+dataTable.getTable())){
                this.controller = controller;
                this.dataTable = dataTable;
                resultSet = pt.executeQuery();
                metaData = resultSet.getMetaData();
                columns = controller.getColumnNames(resultSet);
                rows = controller.getRowData(resultSet);
            }
        }catch (SQLException e){
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

class customSelectionModel extends DefaultListSelectionModel implements ListSelectionListener {

    dataTable table;

    customSelectionModel(dataTable table){
        this.table = table;
        this.addListSelectionListener(this);
        this.setSelectionMode(SINGLE_SELECTION);
    }

    @Override
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public void valueChanged(ListSelectionEvent e) {
        if(!e.getValueIsAdjusting()){
            Vector<Object> selectedValues = new Vector<>();
            for (int i = 0; i < table.getColumnCount(); i++) {
                selectedValues.add(table.getValueAt(table.getSelectedRow(), i));
            }
        }
    }
}