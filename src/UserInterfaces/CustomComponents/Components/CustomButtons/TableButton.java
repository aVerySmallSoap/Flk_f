package UserInterfaces.CustomComponents.Components.CustomButtons;

import Interfaces.Initializable;
import UserInterfaces.CustomComponents.Components.CustomPanels.Singletons.CenterPanel;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Components.PageableComponents.Table.Components.DBEntryPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableButton extends JButton implements Initializable,ActionListener {
    public TableButton(){
        init();
    }

    @Override
    public void init() {
        this.addActionListener(this);
        this.setIcon(Icons.TABLE);
        this.setToolTipText("Table");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new DBEntryPanel().init();
        CenterPanel.Refresh();
    }
}
