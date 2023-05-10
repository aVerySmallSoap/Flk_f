package UserInterfaces.CustomComponents.Components.CustomPanels;

import Controllers.TabController;
import UserInterfaces.CustomComponents.Colors;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class CenterPanel extends JPanel {

    private static CenterPanel centerPanel;

    public static CenterPanel getInstance(){
        if (centerPanel == null){
            centerPanel = new CenterPanel();
        }
        return centerPanel;
    }

    public static void Refresh(){
        centerPanel.repaint();
        centerPanel.revalidate();
    }

    private CenterPanel(){
        this.setBackground(Colors.PRIMARY);
        this.setLayout(new GridLayout());
        this.setBorder(new MatteBorder(4,0,0,0, Colors.PRIMARY));
        this.add(TabController.getInstance());
    }
}
