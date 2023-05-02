package UserInterfaces.CustomComponents.Components;

import UserInterfaces.CustomComponents.Colors.Colors;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Themes.leftTheme;

import javax.swing.*;
import javax.swing.border.MatteBorder;

public class leftStructurePanel extends JPanel {

    public leftStructurePanel(){
        leftTheme.setUp();
        this.setBackground(Colors.SECONDARY);
        this.setBorder(new MatteBorder(3,0,0,1, Colors.PRIMARY));
        JToolBar toolBar = new JToolBar(JToolBar.VERTICAL);
        JButton test = new JButton(Icons.FILE);
        JButton test2 = new JButton(Icons.FILE);
        JButton test3 = new JButton(Icons.FILE);
        JButton test4 = new JButton(Icons.FILE);

        this.add(toolBar);
        toolBar.setBackground(Colors.SECONDARY);
        toolBar.add(test);
        toolBar.add(test2);
        toolBar.add(test3);
        toolBar.add(test4);
    }
}
