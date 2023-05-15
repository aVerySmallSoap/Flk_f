package Interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

@SuppressWarnings("unused")
public interface TableController{

    Vector<String> getColumnNames(ResultSet rs) throws SQLException;
    Vector<Vector> getRowData(ResultSet rs) throws SQLException;
}