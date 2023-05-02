package UserInterfaces.CustomComponents.Components.Function;

import UserInterfaces.CustomComponents.Components.TabController;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.Dashboard;
import UserInterfaces.PageableComponents.Table;
import UserInterfaces.PageableComponents.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableButton extends JButton implements ActionListener {
    public TableButton(){
        this.addActionListener(this);
        this.setIcon(Icons.TABLE);
        this.setToolTipText("Table");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TabController.getInstance().addTab(Users.NAME, new Table());
        Dashboard.centerPanel.revalidate();
    }
}
