package UserInterfaces;

import UserInterfaces.CustomComponents.tooledPanel;

import javax.swing.*;
import java.awt.*;

public class Dashboard implements Runnable{

    private void init(){
        JFrame frame = new JFrame("Dashboard");
        tooledPanel toolPanel = new tooledPanel();

        frame.setVisible(true);
        frame.setSize(new Dimension(750,750));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        frame.add(toolPanel, BorderLayout.NORTH);
    }

    @Override
    public void run() {
        init();
    }
}
