package UserInterfaces.CustomComponents.Components;

import Interfaces.IConnector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("unused")
public class dataTable extends JTable {

    public dataTable(IConnector connector){
        this.setModel(new DefaultTableModel(5,5));
    }
}

