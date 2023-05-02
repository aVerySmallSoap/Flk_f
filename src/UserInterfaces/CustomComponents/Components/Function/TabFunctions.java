package UserInterfaces.CustomComponents.Components.Function;

import UserInterfaces.CustomComponents.Components.TabController;
import UserInterfaces.CustomComponents.Icons.Icons;
import UserInterfaces.CustomComponents.Themes.TabTheme;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TabFunctions extends JPanel {

    public TabFunctions() {
        TabTheme.setUp();
        TabController tabController = TabController.getInstance();
        JLabel title= new JLabel(tabController
                    .getTitleAt(tabController.indexAtLocation(tabController.getMousePosition().x, tabController.getMousePosition().y)));
        this.setLayout(new FlowLayout(FlowLayout.TRAILING));
        this.add(title);
        this.setBackground(new Color(0,0,0,0));
        title.setBorder(new EmptyBorder(0,0,0,5));
        this.add(new CloseButton());
    }
}

class CloseButton extends JButton implements MouseListener {
    public CloseButton() {
        super(Icons.CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.TRAILING));
        this.addMouseListener(this);
        this.putClientProperty("JButton.buttonType","roundRect");
        this.setBorderPainted(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        TabController.getInstance().remove(TabController.getInstance().getSelectedIndex());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setIcon(Icons.HOVER_CLOSE);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setIcon(Icons.CLOSE);
    }
}
