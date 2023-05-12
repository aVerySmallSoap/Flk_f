package UserInterfaces.CustomComponents.Components.CustomPanels.Singletons;

import UserInterfaces.CustomComponents.Colors;
import UserInterfaces.CustomComponents.Components.CustomButtons.HomeButton;
import UserInterfaces.CustomComponents.Components.CustomButtons.SettingsButton;
import UserInterfaces.CustomComponents.Components.CustomButtons.TableButton;
import UserInterfaces.CustomComponents.Components.CustomButtons.UsersButton;
import UserInterfaces.CustomComponents.Themes.navigationPanelTheme;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class navigationPanel extends JPanel {

    private static navigationPanel navigationPanel;

    public static navigationPanel getInstance(){
        if(navigationPanel == null){
            navigationPanel = new navigationPanel();
        }
        return navigationPanel;
    }

    private navigationPanel(){
        navigationPanelTheme.setUp();
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setBorder(new MatteBorder(0,0,0,3, Colors.PRIMARY));
        this.setBackground(Colors.SECONDARY);

        JToolBar toolBar = new JToolBar();
        HomeButton Home = new HomeButton();
        UsersButton Users = new UsersButton();
        SettingsButton Settings = new SettingsButton();
        TableButton Tables = new TableButton();

        this.add(toolBar);
        toolBar.setOrientation(JToolBar.VERTICAL);
        toolBar.setBackground(Colors.SECONDARY);
        toolBar.add(Home);
        toolBar.addSeparator();
        toolBar.add(Users);
        toolBar.add(Settings);
        toolBar.add(Tables);
    }
}
