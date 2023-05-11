package UserInterfaces.CustomComponents.PageableComponents.Table.Components;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DBEntryPanel extends JFrame {
    @SuppressWarnings("CanBeFinal")
    GridBagConstraints constraints = new GridBagConstraints();
    public static final JTextField databaseField = new JTextField(25);
    public static final JTextField userField = new JTextField(25);
    public static final JPasswordField passField = new JPasswordField(25);

    private void init() {
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
        ConnnectToDB connect = new ConnnectToDB();

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

    public void run() {
        init();
    }
}
