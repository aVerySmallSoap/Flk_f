package UserInterfaces.CustomComponents.Components.PageableComponents;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public static final String NAME = "Home";

    public Home(){
        this.setName(NAME);
        this.setLayout(new BorderLayout());
        JPanel topWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel Header = new JLabel("Welcome Home!");
        JLabel Shortcuts = new JLabel();

        topWrapper.add(Header);
        Header.setFont(new Font("Segoe UI", Font.PLAIN,64));
        this.add(topWrapper, BorderLayout.NORTH);
        this.add(Shortcuts, BorderLayout.WEST);
        Shortcuts.setText("""
                Close tab - CTRL+W
                """);
    }
}
