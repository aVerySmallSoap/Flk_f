package UserInterfaces.CustomComponents.Components;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class dataTable extends JTable {

    public dataTable(){
        super(new customTableModel());
    }
}

class customTableModel extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
