package UserInterfaces.CustomComponents.Components.PageableComponents;

import javax.swing.*;
import java.awt.*;

public class Settings extends JPanel {
    public static final String NAME = "Settings";
    public Settings(){
        this.add(new JLabel("Insert Settings"));
        this.setName(NAME);
        this.setLayout(new GridBagLayout());
    }
}
