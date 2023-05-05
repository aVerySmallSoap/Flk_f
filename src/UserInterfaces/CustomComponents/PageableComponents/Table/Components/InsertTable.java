package UserInterfaces.CustomComponents.PageableComponents.Table.Components;

import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Themes.TabTheme;

import javax.swing.*;

public class InsertTable extends JButton {
    public InsertTable(){
        TabTheme.setUp();
        this.setIcon(Icons.INSERTABLE);
        this.putClientProperty("JButton.buttonType","borderless");
    }
}
