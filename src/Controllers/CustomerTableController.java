package Controllers;

import Interfaces.TableController;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class CustomerTableController implements TableController {
    @Override
    public Vector<String> getColumnNames(ResultSet rs){
        try{
            ResultSetMetaData metaData = rs.getMetaData();

            Vector<String> Names = new Vector<>();
            int colCount = metaData.getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                Names.add(metaData.getColumnName(i));
            }
            return Names;
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Vector<Vector> getRowData(ResultSet rs){
        try {
            ResultSetMetaData metaData = rs.getMetaData();

            Vector<Vector> dataVector = new Vector<>();
            while(rs.next()){
                Vector<Object> rowValue = new Vector<>();
                for (int i = 1; i < metaData.getColumnCount(); i++) {
                    rowValue.add(rs.getString("ID"));
                    rowValue.add(rs.getString("first_name"));
                    rowValue.add(rs.getString("last_name"));
                    rowValue.add(rs.getString("email"));
                    rowValue.add(rs.getString("contact_num"));
                }
                dataVector.add(rowValue);
            }
            return dataVector;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
