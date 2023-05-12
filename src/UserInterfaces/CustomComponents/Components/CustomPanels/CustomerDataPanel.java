package UserInterfaces.CustomComponents.Components.CustomPanels;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class CustomerDataPanel extends JPanel {

    public CustomerDataPanel(){
        GridBagConstraints constraints = new GridBagConstraints();
        TitledBorder titledBorder = new TitledBorder("Customer Data");
        JLabel firstNameLabel = new JLabel("First Name");
        JTextField firstNameField = new JTextField(15);
        JLabel lastNameLabel = new JLabel("Last Name");
        JTextField lastNameField = new JTextField(15);

        this.setLayout(new GridBagLayout());
        this.setBorder(titledBorder);
        this.setMinimumSize(new Dimension(500,0));

        titledBorder.setTitlePosition(TitledBorder.TOP);

        constraints.anchor = GridBagConstraints.PAGE_START;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(10,0,0,80);
        this.add(firstNameLabel, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.insets = new Insets(10,10,0,0);
        this.add(firstNameField, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.insets = new Insets(10,0,0,80);
        this.add(lastNameLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.insets = new Insets(10,20,0,0);
        this.add(lastNameField, constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.weightx = 1;
        constraints.weighty = 1;
        this.add(Box.createRigidArea(new Dimension(10,10)), constraints);


    }
}
