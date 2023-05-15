package UserInterfaces.CustomComponents.Components;

import Controllers.CustomerTableController;
import Interfaces.TableController;
import Interfaces.IConnector;
import Interfaces.Initializable;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

@SuppressWarnings("unused")
public class dataTable extends JTable implements Initializable {

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
        this.setModel(new customTableModel(new CustomerTableController(), this));
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public String getTable() {
        return table;
    }

    public IConnector getConnector() {
        return connector;
    }
}
class customTableModel extends AbstractTableModel{

    TableController controller;
    dataTable dataTable;
    ResultSet resultSet;
    ResultSetMetaData metaData;
    Vector<String> columns;
    @SuppressWarnings("rawtypes")
    Vector<Vector> rows;

    customTableModel(TableController controller, dataTable dataTable){
        this.controller = controller;
        this.dataTable = dataTable;
        init_table();
    }

    private void init_table(){
        try{
            try(PreparedStatement pt = dataTable.getConnector().getConnection().prepareStatement("select * from "+dataTable.getTable())){
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
}
