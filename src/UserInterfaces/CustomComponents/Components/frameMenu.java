package UserInterfaces.CustomComponents.Components;

import javax.swing.*;

public class frameMenu extends JMenuBar {
    public frameMenu(){
        JMenu Files = new JMenu("Files");
        JMenu User = new JMenu("User");
        JMenuItem logout = new JMenuItem("Log-out");

        this.add(Files);
        this.add(User);
        User.add(logout);
    }
}
