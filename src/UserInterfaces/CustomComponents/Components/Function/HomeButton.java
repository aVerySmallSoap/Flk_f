package UserInterfaces.CustomComponents.Components.Function;

import UserInterfaces.CustomComponents.Components.CustomPanels.TabController;
import UserInterfaces.PageableComponents.Home;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.Dashboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeButton extends JButton implements ActionListener {

    public HomeButton(){
        this.addActionListener(this);
        this.setIcon(Icons.HOME);
        this.setToolTipText("Home");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TabController.getInstance().addTab(Home.NAME, new Home());
        Dashboard.centerPanel.revalidate();
    }
}

