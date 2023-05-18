package UserInterfaces.CustomComponents.Components.Panels;

import Interfaces.Initializable;
import UserInterfaces.CustomComponents.Components.StaticLabel;
import UserInterfaces.CustomComponents.Components.StaticTextField;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Vector;

public class CustomerDataPanel extends JPanel implements Initializable{

    Vector<Object> data;
    StaticLabel customerID = new StaticLabel();
    StaticTextField firstNameField = new StaticTextField(20);
    StaticTextField lastNameField = new StaticTextField(20);
    StaticTextField addressField = new StaticTextField(20);
    StaticTextField phoneNumberField = new StaticTextField(20);
    public CustomerDataPanel(){
        init();
    }

    @Override
    public void init() {
        GridBagConstraints constraints = new GridBagConstraints();
        TitledBorder titledBorder = new TitledBorder("Customer Data");
        StaticLabel IDLabel = new StaticLabel("Customer ID");
        StaticLabel firstNameLabel = new StaticLabel("First Name");
        StaticLabel lastNameLabel = new StaticLabel("Last Name");
        StaticLabel addressLabel = new StaticLabel("Address");
        StaticLabel phoneNumber = new StaticLabel("Phone Number");

        this.setLayout(new GridBagLayout());
        this.setBorder(titledBorder);
        this.setMinimumSize(new Dimension(550,0));

        titledBorder.setTitlePosition(TitledBorder.TOP);

        constraints.anchor = GridBagConstraints.PAGE_START;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(10,0,0,150);
        this.add(IDLabel, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.insets = new Insets(10,10,0,0);
        this.add(customerID, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.insets = new Insets(10,8,0,150);
        this.add(firstNameLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.insets = new Insets(10,20,0,0);
        this.add(firstNameField, constraints);
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.insets = new Insets(10,0,0,150);
        this.add(lastNameLabel, constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.insets = new Insets(10,25,0,0);
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
        constraints.gridx = 3;
        constraints.gridy = 5;
        constraints.weightx = 1;
        constraints.weighty = 1;
        this.add(Box.createRigidArea(new Dimension(0,0)), constraints);
    }

    public void loadIntoPanel(Vector<Object> data){
        this.data = data;
        showData();
    }

    private void showData(){
        customerID.setText(data.get(0).toString());
        firstNameField.setText(data.get(1).toString());
        lastNameField.setText(data.get(2).toString());
        addressField.setText(data.get(3).toString());
        phoneNumberField.setText(data.get(4).toString());
    }
}
