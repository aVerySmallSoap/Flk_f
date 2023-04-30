package UserInterfaces.CustomComponents;

import UserInterfaces.CustomComponents.Colors.Colors;
import UserInterfaces.CustomComponents.Icons.Icons;
import UserInterfaces.CustomComponents.Themes.customLafNavigation;

import javax.swing.*;
import java.awt.*;

public class tooledPanel extends JPanel {

    public tooledPanel(){
        customLafNavigation.setUp();
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        JToolBar toolBar = new JToolBar();
        JButton testFile = new JButton(Icons.scaled_File);

        this.add(toolBar);
        this.setBackground(Colors.SECONDARY);
        toolBar.setBackground(Colors.SECONDARY);
        toolBar.addSeparator();
        toolBar.add(testFile);
        toolBar.addSeparator();
        this.add(new JButton("Test on props"));
    }
}
