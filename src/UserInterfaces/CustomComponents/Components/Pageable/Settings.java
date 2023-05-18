package UserInterfaces.CustomComponents.Components.Pageable;

import Interfaces.Initializable;

import javax.swing.*;
import java.awt.*;

public class Settings extends JPanel implements Initializable {
    public static final String NAME = "Settings";
    public Settings(){
        init();
    }

    @Override
    public void init() {
        this.add(new JLabel("Insert Settings"));
        this.setName(NAME);
        this.setLayout(new GridBagLayout());
    }
}
