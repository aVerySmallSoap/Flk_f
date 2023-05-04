package UserInterfaces.CustomComponents.Components.CustomPanels;

import UserInterfaces.CustomComponents.Components.Function.HomeButton;
import UserInterfaces.CustomComponents.Components.Function.SettingsButton;
import UserInterfaces.CustomComponents.Components.Function.TableButton;
import UserInterfaces.CustomComponents.Components.Function.UsersButton;
import UserInterfaces.CustomComponents.Themes.navigationPanelTheme;

import javax.swing.*;
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
        JToolBar toolBar = new JToolBar();
        HomeButton Home = new HomeButton();
        UsersButton Users = new UsersButton();
        SettingsButton Settings = new SettingsButton();
        TableButton Tables = new TableButton();

        this.add(toolBar);
        toolBar.add(Home);
        toolBar.addSeparator();
        toolBar.add(Users);
        toolBar.add(Settings);
        toolBar.add(Tables);
    }
}
