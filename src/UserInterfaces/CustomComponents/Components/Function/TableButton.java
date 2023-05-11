package UserInterfaces.CustomComponents.Components.Function;

import UserInterfaces.CustomComponents.Components.CustomPanels.CenterPanel;
import Controllers.TabController;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.PageableComponents.Table.Components.DBEntryPanel;
import UserInterfaces.CustomComponents.PageableComponents.Table.Table;

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
        new DBEntryPanel().run();
        CenterPanel.Refresh();
    }
}
