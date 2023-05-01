package UserInterfaces.CustomComponents.Components;

import UserInterfaces.CustomComponents.Colors.Colors;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    public CenterPanel(){
        this.setBackground(Colors.PRIMARY);
        this.setLayout(new GridLayout());
    }
}
