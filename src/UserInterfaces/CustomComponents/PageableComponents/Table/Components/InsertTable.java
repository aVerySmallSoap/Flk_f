package UserInterfaces.CustomComponents.PageableComponents.Table.Components;

import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Themes.TabTheme;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertTable extends JButton implements ActionListener {
    public InsertTable(){
        TabTheme.setUp();
        this.setIcon(Icons.INSERTABLE);
        this.putClientProperty("JButton.buttonType","borderless");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DBEntryPanel panel = new DBEntryPanel();
        panel.run();
    }
}

