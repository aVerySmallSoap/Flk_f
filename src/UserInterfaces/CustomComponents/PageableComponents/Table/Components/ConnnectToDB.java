package UserInterfaces.CustomComponents.PageableComponents.Table.Components;

import Controllers.ConnectionController;
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
        String schema = InsertPanel.databaseField.getText();
        String user = InsertPanel.userField.getText();
        String pass = String.valueOf(InsertPanel.passField.getPassword());

        if (!IValidator.isNullOnBoth(user, pass)) {
            Table.table = new dataTable(new ConnectionController(schema, user, pass));
        } else {
            Table.table = new dataTable(new ConnectionController(schema, "root", "root"));
        }
    }
}
