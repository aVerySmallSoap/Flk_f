package UserInterfaces;

import UserInterfaces.CustomComponents.Components.CenterPanel;
import UserInterfaces.CustomComponents.Components.leftStructurePanel;
import UserInterfaces.CustomComponents.Components.frameMenu;
import UserInterfaces.CustomComponents.Components.navigationPanel;

import javax.swing.*;
import java.awt.*;

public class Dashboard implements Runnable {

    public static CenterPanel centerPanel = new CenterPanel() ;
    private void init(){
        JFrame frame = new JFrame("Dashboard");
        frameMenu topMenu = new frameMenu();
        navigationPanel topPanel = new navigationPanel();
        leftStructurePanel leftPanel = new leftStructurePanel();

        frame.setVisible(true);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.setJMenuBar(topMenu);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);
    }

    @Override
    public void run() {
        init();
    }
}