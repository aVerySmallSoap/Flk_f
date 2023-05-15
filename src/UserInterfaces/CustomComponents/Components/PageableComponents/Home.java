package UserInterfaces.CustomComponents.Components.PageableComponents;

import Interfaces.Initializable;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel implements Initializable {
    public static final String NAME = "Home";

    public Home(){
        init();
    }

    @Override
    public void init() {
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
