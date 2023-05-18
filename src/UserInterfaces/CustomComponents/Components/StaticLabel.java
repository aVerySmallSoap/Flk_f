package UserInterfaces.CustomComponents.Components;

import javax.swing.*;
import java.awt.*;

public class StaticLabel extends JLabel {

    private final Dimension LOCK = new Dimension(100,9);

    public StaticLabel(){
        this.setMinimumSize(LOCK);
    }

    public StaticLabel(String text){
        super(text);
        this.setMinimumSize(LOCK);
    }
}
