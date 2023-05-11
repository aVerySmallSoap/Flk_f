package UserInterfaces.CustomComponents.PageableComponents.Table.Components;

import Controllers.ConnectionController;
import Controllers.TabController;
import Interfaces.IValidator;
import UserInterfaces.CustomComponents.Components.dataTable;
import UserInterfaces.CustomComponents.PageableComponents.Table.Table;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConnnectToDB extends JButton implements ActionListener {
    public ConnnectToDB() {
        this.setText("Connect");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String schema = DBEntryPanel.databaseField.getText();
        String user = DBEntryPanel.userField.getText();
        String pass = String.valueOf(DBEntryPanel.passField.getPassword());

        if (!IValidator.isNullOnBoth(user, pass)) {
            TabController.getInstance().addTab(Table.NAME, new Table(new dataTable(new ConnectionController(schema, user, pass))));
        } else {
            TabController.getInstance().addTab(Table.NAME, new Table(new dataTable(new ConnectionController(schema, "root", "root"))));
        }
    }

}
