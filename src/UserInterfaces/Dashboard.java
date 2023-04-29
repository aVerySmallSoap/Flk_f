package UserInterfaces;

import javax.swing.*;
import java.awt.*;

public class Dashboard implements Runnable{

    private void init(){
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
        init();
    }
}
