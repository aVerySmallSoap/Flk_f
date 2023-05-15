package UserInterfaces.CustomComponents.Components.CustomButtons;

import Interfaces.Initializable;
import UserInterfaces.CustomComponents.Components.CustomPanels.Singletons.CenterPanel;
import Controllers.TabController;
import UserInterfaces.CustomComponents.Components.PageableComponents.Home;
import UserInterfaces.CustomComponents.Icons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeButton extends JButton implements Initializable,ActionListener {

    public HomeButton(){
        init();
    }

    @Override
    public void init() {
        this.addActionListener(this);
        this.setIcon(Icons.HOME);
        this.setToolTipText("Home");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TabController.getInstance().addTab(Home.NAME, new Home());
        CenterPanel.Refresh();
    }
}

