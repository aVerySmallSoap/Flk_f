package UserInterfaces.CustomComponents.Components.Function;

import UserInterfaces.CustomComponents.Components.CustomPanels.CenterPanel;
import Controllers.TabController;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.PageableComponents.Users;

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
        CenterPanel.Refresh();
    }
}
