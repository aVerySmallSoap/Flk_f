package UserInterfaces;

import UserInterfaces.CustomComponents.Components.CustomPanels.CenterPanel;
import UserInterfaces.CustomComponents.Components.CustomPanels.leftStructurePanel;
import UserInterfaces.CustomComponents.Components.CustomPanels.frameMenu;
import UserInterfaces.CustomComponents.Components.CustomPanels.navigationPanel;
import UserInterfaces.CustomComponents.Fonts;

import javax.swing.*;
import java.awt.*;

public class Dashboard{
    private static void init(){
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
        frame.add(CenterPanel.getInstance(), BorderLayout.CENTER);
    }


    public static void run() {
        Fonts.registerFonts();
        init();
    }
}