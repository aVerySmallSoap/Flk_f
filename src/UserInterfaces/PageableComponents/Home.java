package UserInterfaces.PageableComponents;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public static final String NAME = "Home";

    public Home(){
        this.add(new JLabel("Welcome HOME!"));
        this.setName(NAME);
        this.setLayout(new GridBagLayout());
    }
}
