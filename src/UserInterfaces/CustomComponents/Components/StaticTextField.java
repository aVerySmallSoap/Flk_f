package UserInterfaces.CustomComponents.Components;

import javax.swing.*;
import java.awt.*;

public class StaticTextField extends JTextField {

    private final Dimension LOCK = new Dimension(220,22);

    public StaticTextField(){
        super(20);
        this.setMinimumSize(LOCK);
    }

    public StaticTextField(int columns){
        super(columns);
        this.setMinimumSize(LOCK);
    }
}
