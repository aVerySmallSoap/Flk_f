package UserInterfaces.CustomComponents.PageableComponents.Table.Components;

import Controllers.ConnectionController;
import Controllers.TabController;
import Interfaces.IValidator;
import UserInterfaces.CustomComponents.Components.dataTable;
import UserInterfaces.CustomComponents.PageableComponents.Table.Table;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConnectToDB extends JButton implements ActionListener {

    DBEntryPanel parent;

    public ConnectToDB(DBEntryPanel parent) {
        this.parent = parent;
        this.setText("Connect");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String schema = parent.getSchema();
        String user = parent.getUser();
        String pass = parent.getPass();

        if (!IValidator.isNullOnBoth(user, pass)) {
            TabController.getInstance().addTab(Table.NAME, new Table(new dataTable(new ConnectionController(schema, user, pass))));
            parent.dispose();
        } else {
            TabController.getInstance().addTab(Table.NAME, new Table(new dataTable(new ConnectionController(schema, "root", "root"))));
            parent.dispose();
        }
    }

}
