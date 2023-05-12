package UserInterfaces;

import UserInterfaces.CustomComponents.Components.CustomPanels.Singletons.CenterPanel;
import UserInterfaces.CustomComponents.Components.CustomPanels.Singletons.frameMenu;
import UserInterfaces.CustomComponents.Components.CustomPanels.Singletons.navigationPanel;
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

        this.setTitle("Dashboard");
        this.setVisible(true);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setJMenuBar(topMenu);

        this.add(navigationPanel.getInstance(), BorderLayout.WEST);
        this.add(CenterPanel.getInstance(), BorderLayout.CENTER);
    }

    public void Refresh(){
        this.repaint();
        this.revalidate();
    }


    public static void run() {
        Fonts.registerFonts();
        Dashboard.getInstance().init();
    }
}