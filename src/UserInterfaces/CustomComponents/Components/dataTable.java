package UserInterfaces.CustomComponents.Components;


import Controllers.TableController;

import javax.swing.*;

public class dataTable extends JTable {

    public dataTable(){
        super(TableController.getInstance().getData());
    }
}

