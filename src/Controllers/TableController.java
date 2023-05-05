package Controllers;

import Interfaces.IConnector;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class TableController{
    private static TableController controller;

    IConnector database = ConnectionController.getInstance();

    public static TableController getInstance(){
        if(controller == null){
            controller = new TableController();
        }
        return controller;
    }

    public DefaultTableModel getData(){
        try{
            PreparedStatement pt = getInstance().database.getConnection().prepareStatement("select * from test");
            ResultSet rs = pt.executeQuery();
            return parseResultToTable(rs);
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

    public static nonEditableTable parseResultToTable(ResultSet rs){
        try {
            ResultSetMetaData metaData = rs.getMetaData();

            Vector<String> Names = new Vector<>();
            int colCount = metaData.getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                Names.add(metaData.getColumnName(i));
            }

            Vector<Vector<Object>> Column = new Vector<>();
            while(rs.next()){
                Vector<Object> rows = new Vector<>();
                for (int i = 1; i < colCount; i++) {
                    rows.add(rs.getInt("ID"));
                    rows.add(rs.getString("Name"));
                    rows.add(rs.getString("Desc"));
                }
                Column.add(rows);
            }
            return new nonEditableTable(Column, Names);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

class nonEditableTable extends DefaultTableModel{

    public nonEditableTable(Vector<? extends Vector> data, Vector<?> columnNames){
        super(data, columnNames);
    }

    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }
}