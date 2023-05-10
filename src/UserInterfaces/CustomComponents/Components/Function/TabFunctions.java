package UserInterfaces.CustomComponents.Components.Function;

import Controllers.TabController;
import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Themes.TabTheme;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TabFunctions extends JPanel {

    public TabFunctions() {
        TabTheme.setUp();
        TabController tabController = TabController.getInstance();
        JLabel title;
        RefreshButton refresh = new RefreshButton();
        CloseButton close = new CloseButton();
        if(tabController.getTabCount() <= 1){
            title = new JLabel(tabController.getTitleAt(tabController.getSelectedIndex()));
        }else {
            title = new JLabel(tabController
                    .getTitleAt(tabController.indexAtLocation(tabController.getMousePosition().x, tabController.getMousePosition().y)));
        }
        this.setLayout(new FlowLayout(FlowLayout.TRAILING));
        this.add(title);
        this.setBackground(new Color(0,0,0,0));
        title.setBorder(new EmptyBorder(0,0,0,5));
        this.add(refresh);
        this.add(close);
    }
}

class CloseButton extends JButton implements MouseListener {
    public CloseButton() {
        super(Icons.CLOSE);

        this.addMouseListener(this);
        this.setBorderPainted(false);
        this.setToolTipText("Close Tab");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        TabController tabController = TabController.getInstance();
        tabController.remove(tabController.indexAtLocation(tabController.getMousePosition().x, tabController.getMousePosition().y));
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setIcon(Icons.HOVER_CLOSE);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setIcon(Icons.CLOSE);
    }
}

class RefreshButton extends JButton implements ActionListener{

    public RefreshButton() {
        super(Icons.ROTATE);

        this.addActionListener(this);
        this.setBorderPainted(false);
        this.setToolTipText("Close Tab");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TabController tabController = TabController.getInstance();
        tabController.getComponent(tabController.getSelectedIndex()).repaint();
        tabController.getComponent(tabController.getSelectedIndex()).revalidate();
    }
}
