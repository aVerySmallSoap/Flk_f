package UserInterfaces.CustomComponents.Components;

import UserInterfaces.CustomComponents.Colors.Colors;
import UserInterfaces.CustomComponents.Icons.Icons;
import UserInterfaces.CustomComponents.Themes.navigationPanelTheme;

import javax.swing.*;
import java.awt.*;

public class navigationPanel extends JPanel {
    public navigationPanel(){
        navigationPanelTheme.setUp();
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
