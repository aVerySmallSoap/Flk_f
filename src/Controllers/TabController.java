package Controllers;

import UserInterfaces.CustomComponents.Components.Function.TabFunctions;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class TabController extends JTabbedPane implements ChangeListener, MouseListener{

    private int lastIndexHovered = 0;

    private static TabController tabController;

    public static TabController getInstance(){
        if(tabController == null){
            tabController = new TabController();
        }
        return tabController;
    }

    private TabController(){
        this.addChangeListener(this);
        this.addMouseListener(this);

        this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK),"CLOSE_TAB");
        this.getActionMap().put("CLOSE_TAB", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    removeTabAt(getSelectedIndex());
                }catch (IndexOutOfBoundsException ex){
                    System.out.println("User tried to close no tabs!");
                }
            }
        });
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        try{
            if(this.getComponents().length > 0){
                this.setTabComponentAt(this.getSelectedIndex(), new TabFunctions());
                this.repaint();
                this.revalidate();
            }
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
            System.out.println("state error");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        try{
            if(this.getComponents().length > 0){
                lastIndexHovered = this.indexAtLocation(e.getX(), e.getY());
                this.setTabComponentAt(this.indexAtLocation(e.getX(), e.getY()), new TabFunctions());
                this.repaint();
                this.revalidate();
            }
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error on enter");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(!this.getVisibleRect().contains(e.getPoint())){
            try{
                if(this.getComponents().length > 0){
                    if(!this.getComponentAt(this.getSelectedIndex()).hasFocus()){
                        this.setTabComponentAt(lastIndexHovered, new JLabel(this.getComponentAt(lastIndexHovered).getName()));
                        this.repaint();
                        this.revalidate();
                        lastIndexHovered = 0;
                    }
                }
            }catch (IndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
                System.out.println("Error on exit");
            }
        }
    }
}
