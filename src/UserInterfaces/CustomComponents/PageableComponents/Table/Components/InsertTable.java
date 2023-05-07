package UserInterfaces.CustomComponents.PageableComponents.Table.Components;

import UserInterfaces.CustomComponents.Icons;
import UserInterfaces.CustomComponents.Themes.TabTheme;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertTable extends JButton implements ActionListener {
    public InsertTable(){
        TabTheme.setUp();
        this.setIcon(Icons.INSERTABLE);
        this.putClientProperty("JButton.buttonType","borderless");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        InsertPanel panel = new InsertPanel();
        panel.run();
    }
}

class InsertPanel extends JFrame {

    private void init(){
        FlatLightLaf.setup();
        this.setSize(new Dimension(500, 200));
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        JLabel schemaTag = new JLabel("Schema:");
        JTextField databaseField = new JTextField(25);
        ConnnectToDB connect = new ConnnectToDB();

        this.add(schemaTag);
        this.add(databaseField);
        this.add(connect);
        databaseField.addActionListener(null);
    }

    public void run(){
        init();
    }
}

class ConnnectToDB extends JButton implements ActionListener{
    ConnnectToDB(){
        this.setText("Connect");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}