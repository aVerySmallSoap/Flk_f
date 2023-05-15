package UserInterfaces.CustomComponents.Components.CustomPanels;

import Interfaces.Initializable;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class CustomerDataPanel extends JPanel implements Initializable {

    public CustomerDataPanel(){
        init();
    }

    @Override
    public void init() {
        GridBagConstraints constraints = new GridBagConstraints();
        TitledBorder titledBorder = new TitledBorder("Customer Data");
        JLabel firstNameLabel = new JLabel("First Name");
        JTextField firstNameField = new JTextField(20);
        JLabel lastNameLabel = new JLabel("Last Name");
        JTextField lastNameField = new JTextField(20);
        JLabel addressLabel = new JLabel("Address");
        JTextField addressField = new JTextField(20);
        JLabel phoneNumber = new JLabel("Phone Number");
        JTextField phoneNumberField = new JTextField(20);

        this.setLayout(new GridBagLayout());
        this.setBorder(titledBorder);
        this.setMinimumSize(new Dimension(550,0));

        titledBorder.setTitlePosition(TitledBorder.TOP);

        constraints.anchor = GridBagConstraints.PAGE_START;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(10,0,0,150);
        this.add(firstNameLabel, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.insets = new Insets(10,10,0,0);
        this.add(firstNameField, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.insets = new Insets(10,0,0,150);
        this.add(lastNameLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.insets = new Insets(10,20,0,0);
        this.add(lastNameField, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.insets = new Insets(10,0,0,170);
        this.add(addressLabel, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.insets = new Insets(10,10,0,0);
        this.add(addressField, constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.insets = new Insets(10,0,0,120);
        this.add(phoneNumber, constraints);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.insets = new Insets(10,20,0,0);
        this.add(phoneNumberField, constraints);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.weightx = 1;
        constraints.weighty = 1;
        this.add(Box.createRigidArea(new Dimension(0,0)), constraints);
    }
}
