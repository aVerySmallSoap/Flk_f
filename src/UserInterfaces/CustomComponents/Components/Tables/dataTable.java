package UserInterfaces.CustomComponents.Components.Tables;

import Controllers.TableController;
import Interfaces.IConnector;
import Interfaces.Initializable;
import UserInterfaces.CustomComponents.Components.Panels.CustomerDataPanel;

import javax.swing.*;

@SuppressWarnings("unused")
public class dataTable extends JTable implements Initializable{

    private final IConnector connector;
    private String table;
    private CustomerDataPanel dataPanel;
    private customSelectionModel selectionModel;

    public dataTable(IConnector connector){
        this.connector = connector;
        init();
    }

    public dataTable(IConnector connector, String table){
        this.connector = connector;
        this.table = table;
        init();
    }

    public dataTable(IConnector connector, String table, CustomerDataPanel dataPanel){
        this.connector = connector;
        this.table = table;
        this.dataPanel = dataPanel;
        init();
    }
    
    @Override
    public void init() {
        this.setModel(new customTableModel(new TableController(), this));
        selectionModel = new customSelectionModel(this, dataPanel);
        this.setSelectionModel(selectionModel);
    }

    public String getTable() {
        return table;
    }

    public IConnector getConnector() {
        return connector;
    }
}

