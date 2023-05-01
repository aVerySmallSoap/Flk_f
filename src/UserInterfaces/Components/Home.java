package UserInterfaces.Components;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {

    public Home(){
        this.add(new JLabel("Welcome HOME!"));
        this.setLayout(new GridBagLayout());
    }
}
