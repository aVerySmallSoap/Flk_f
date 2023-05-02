package UserInterfaces.PageableComponents;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public static final String NAME = "Home";

    public Home(){
        this.setName(NAME);
        this.setLayout(new GridBagLayout());
        JLabel Header = new JLabel("Welcome Home!");

        Header.setFont(new Font("Segoe UI", Font.PLAIN,64));
        this.add(Header, new GridBagConstraints(0,0,0,0,1,1,GridBagConstraints.PAGE_START,0,new Insets(0,0,0,0),0,0));
    }
}
