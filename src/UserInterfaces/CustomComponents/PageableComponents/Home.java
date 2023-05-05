package UserInterfaces.CustomComponents.PageableComponents;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public static final String NAME = "Home";
    final Insets zeroInsets = new Insets(0,0,0,0);

    public Home(){
        this.setName(NAME);
        this.setLayout(new GridBagLayout());
        JLabel Header = new JLabel("Welcome Home!");
        JLabel Shortcuts = new JLabel();

        Header.setFont(new Font("Segoe UI", Font.PLAIN,64));
        this.add(Header, new GridBagConstraints(0,0,0,0,1,1,GridBagConstraints.PAGE_START,0,zeroInsets,0,0));
        this.add(Shortcuts, new GridBagConstraints(0,0,0,0,1,1,GridBagConstraints.LINE_START,0, zeroInsets, 0,0));
        Shortcuts.setText("""
                Close tab - CTRL+W
                """);
    }
}
