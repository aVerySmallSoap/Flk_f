package UserInterfaces.PageableComponents;

import javax.swing.*;
import java.awt.*;

public class Table extends JPanel {
    public static final String NAME = "Tables";
    public Table(){
        this.add(new JLabel("Insert Table"));
        this.setName(NAME);
        this.setLayout(new GridBagLayout());
    }
}
