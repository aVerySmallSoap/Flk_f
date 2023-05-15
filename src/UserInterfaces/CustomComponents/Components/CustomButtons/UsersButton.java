package UserInterfaces.CustomComponents.Components.CustomButtons;

import Interfaces.Initializable;
import UserInterfaces.CustomComponents.Components.CustomPanels.Singletons.CenterPanel;
import Controllers.TabController;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Components.PageableComponents.Customers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsersButton extends JButton implements Initializable,ActionListener {
    public UsersButton(){
        init();
    }

    @Override
    public void init() {
        this.addActionListener(this);
        this.setIcon(Icons.USERS);
        this.setToolTipText("Users");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TabController.getInstance().addTab(Customers.NAME, new Customers());
        CenterPanel.Refresh();
    }
}
