package UserInterfaces.CustomComponents.Components;

import UserInterfaces.CustomComponents.Colors.Colors;
import UserInterfaces.CustomComponents.Themes.leftTheme;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class leftStructurePanel extends JPanel {

    public leftStructurePanel(){
        GridBagConstraints constraints = new GridBagConstraints();
        leftTheme.setUp();
        this.setBackground(Colors.SECONDARY);
        this.setBorder(new MatteBorder(2,0,0,0, Colors.PRIMARY));
        this.setLayout(new GridBagLayout());
        JButton test = new JButton("test");

        constraints.insets = new Insets(5,5,5,5);
        this.add(test,constraints);
    }
}
