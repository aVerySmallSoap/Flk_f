package UserInterfaces.CustomComponents.Components;

import UserInterfaces.CustomComponents.Colors.Colors;
import UserInterfaces.CustomComponents.Components.Function.HomeButton;
import UserInterfaces.CustomComponents.Components.Function.SettingsButton;
import UserInterfaces.CustomComponents.Components.Function.TableButton;
import UserInterfaces.CustomComponents.Components.Function.UsersButton;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Themes.navigationPanelTheme;

import javax.swing.*;
import java.awt.*;

public class navigationPanel extends JPanel {
    public navigationPanel(){
        navigationPanelTheme.setUp();
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        JToolBar toolBar = new JToolBar();
        HomeButton Home = new HomeButton();
        UsersButton Users = new UsersButton();
        SettingsButton Settings = new SettingsButton();
        TableButton Tables = new TableButton();

        this.add(toolBar);
//        this.setBackground(Colors.SECONDARY);
//        toolBar.setBackground(Colors.SECONDARY);
        toolBar.add(Home);
        toolBar.addSeparator();
        toolBar.add(Users);
        toolBar.add(Settings);
        toolBar.add(Tables);
    }
}
