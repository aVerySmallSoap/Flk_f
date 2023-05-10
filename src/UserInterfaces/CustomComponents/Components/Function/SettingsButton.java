package UserInterfaces.CustomComponents.Components.Function;

import UserInterfaces.CustomComponents.Components.CustomPanels.CenterPanel;
import Controllers.TabController;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.PageableComponents.Settings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsButton extends JButton implements ActionListener {
    public SettingsButton(){
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
