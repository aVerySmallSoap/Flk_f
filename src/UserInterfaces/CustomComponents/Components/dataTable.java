package UserInterfaces.CustomComponents.Components;

import Interfaces.IConnector;
import Interfaces.Initializable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("unused")
public class dataTable extends JTable implements Initializable {

    private IConnector connector;

    public dataTable(IConnector connector){
        init();
    }

    @Override
    public void init() {
        this.setModel(new DefaultTableModel(5,5));
    }
}

