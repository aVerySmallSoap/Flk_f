package UserInterfaces.CustomComponents;

import javax.swing.*;
import java.awt.*;

public class tooledPanel extends JPanel {

    public tooledPanel(){
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        JToolBar toolBar = new JToolBar();
        JMenuBar menuBar = new JMenuBar();
        JMenu Files = new JMenu("Files");
        JMenu User = new JMenu("User");
        JMenuItem logout = new JMenuItem("Log-out");

        this.add(menuBar);
        menuBar.add(Files);
        User.add(logout);
        menuBar.add(User);

        this.add(toolBar);
        toolBar.addSeparator();
        toolBar.add(new JButton("test A"));
        toolBar.add(new JButton("test B"));
        toolBar.add(new JButton("test C"));
    }
}
