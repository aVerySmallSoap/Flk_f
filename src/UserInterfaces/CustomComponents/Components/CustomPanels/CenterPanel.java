package UserInterfaces.CustomComponents.Components.CustomPanels;

import UserInterfaces.CustomComponents.Colors;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class CenterPanel extends JPanel {
    public CenterPanel(){
        this.setBackground(Colors.PRIMARY);
        this.setLayout(new GridLayout());
        this.setBorder(new MatteBorder(4,0,0,0, Colors.PRIMARY));
        this.add(TabController.getInstance());
    }
}
