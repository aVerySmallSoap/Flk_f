package UserInterfaces.CustomComponents.Components.Function;

import UserInterfaces.CustomComponents.Components.CustomPanels.TabController;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.Dashboard;
import UserInterfaces.PageableComponents.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsersButton extends JButton implements ActionListener {
    public UsersButton(){
        this.addActionListener(this);
        this.setIcon(Icons.USERS);
        this.setToolTipText("Users");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TabController.getInstance().addTab(Users.NAME, new Users());
        Dashboard.centerPanel.revalidate();
    }
}
