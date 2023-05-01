package UserInterfaces.CustomComponents.Components.Function;

import UserInterfaces.Components.Home;
import UserInterfaces.CustomComponents.Icons.Icons;
import UserInterfaces.Dashboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeButton extends JButton implements ActionListener {

    public HomeButton(){
        this.addActionListener(this);
        this.setIcon(Icons.Home);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Dashboard.centerPanel.add(new Home());
        Dashboard.centerPanel.revalidate();
    }
}
