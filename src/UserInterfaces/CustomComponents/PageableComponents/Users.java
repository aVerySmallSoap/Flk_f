package UserInterfaces.CustomComponents.PageableComponents;

import javax.swing.*;
import java.awt.*;

public class Users extends JPanel {
    public static final String NAME = "Users";
    public Users(){
        this.add(new JLabel("Insert Users tab here"));
        this.setName(NAME);
        this.setLayout(new GridBagLayout());
    }
}
