package UserInterfaces;

import UserInterfaces.CustomComponents.Components.CustomPanels.CenterPanel;
import UserInterfaces.CustomComponents.Components.CustomPanels.leftStructurePanel;
import UserInterfaces.CustomComponents.Components.CustomPanels.frameMenu;
import UserInterfaces.CustomComponents.Components.CustomPanels.navigationPanel;
import UserInterfaces.CustomComponents.Fonts;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame{

    private static Dashboard dashboard;

    public static Dashboard getInstance(){
        if(dashboard == null){
            dashboard = new Dashboard();
        }
        return dashboard;
    }

    private void init(){
        frameMenu topMenu = new frameMenu();
        var topPanel = navigationPanel.getInstance();
        var leftPanel = leftStructurePanel.getInstance();

        this.setTitle("Dashboard");
        this.setVisible(true);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setJMenuBar(topMenu);

        this.add(topPanel, BorderLayout.NORTH);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(CenterPanel.getInstance(), BorderLayout.CENTER);
    }


    public static void run() {
        Fonts.registerFonts();
        Dashboard.getInstance().init();
    }
}