package UserInterfaces.CustomComponents.Components.PageableComponents.Table.Components;

import Interfaces.Initializable;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class DBEntryPanel extends JFrame implements Initializable {
    private final JTextField databaseField = new JTextField(25);
    private final JTextField userField = new JTextField(25);
    private final JPasswordField passField = new JPasswordField(25);

    public String getSchema(){
        return databaseField.getText();
    }
    public String getUser(){
        return userField.getText();
    }
    public String getPass(){
        return String.valueOf(passField.getPassword());
    }

    @Override
    public void init() {
        FlatLightLaf.setup();
        this.setSize(new Dimension(400, 250));
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.setResizable(false);
        this.setTitle("Connect to a database");
        JLabel schemaTag = new JLabel("Schema:");
        JLabel userTag = new JLabel("User:");
        JLabel passTag = new JLabel("Pass:");
        ConnectToDB connect = new ConnectToDB(this);
        GridBagConstraints constraints = new GridBagConstraints();


        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 0, 10, 10);
        this.add(schemaTag, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        this.add(databaseField, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(userTag, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        this.add(userField, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        this.add(passTag, constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        this.add(passField, constraints);
        constraints.gridx = 1;
        constraints.gridy = 3;
        this.add(connect, constraints);
    }
}
