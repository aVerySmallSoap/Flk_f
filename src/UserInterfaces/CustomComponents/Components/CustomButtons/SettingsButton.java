package UserInterfaces.CustomComponents.Components.CustomButtons;

import Interfaces.Initializable;
import UserInterfaces.CustomComponents.Components.CustomPanels.Singletons.CenterPanel;
import Controllers.TabController;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Components.PageableComponents.Settings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsButton extends JButton implements Initializable,ActionListener {
    public SettingsButton(){
        init();
    }

    @Override
    public void init() {
        this.addActionListener(this);
        this.setIcon(Icons.SETTINGS);
        this.setToolTipText("Settings");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TabController.getInstance().addTab(Settings.NAME, new Settings());
        CenterPanel.Refresh();
    }
}
