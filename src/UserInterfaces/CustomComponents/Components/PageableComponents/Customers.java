package UserInterfaces.CustomComponents.Components.PageableComponents;

import Controllers.ConnectionController;
import Interfaces.Initializable;
import UserInterfaces.CustomComponents.Colors;
import UserInterfaces.CustomComponents.Components.CustomPanels.CustomerDataPanel;
import UserInterfaces.CustomComponents.Components.CustomPanels.SearchPanel;
import UserInterfaces.CustomComponents.Components.dataTable;
import UserInterfaces.CustomComponents.Themes.SplitTheme;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Customers extends JPanel implements Initializable {
    public static final String NAME = "Customers";
    // Customer ID generation pattern: COUNTRY-GENDER-FIRST_LETTER_OF_FIRSTNAME-FIRST_LETTER_OF_LASTNAME-9~11_DIGIT_OF_PHONE

    public Customers(){
        init();
    }

    @Override
    public void init() {
        SplitTheme.setUp();
        this.setName(NAME);
        this.setLayout(new BorderLayout());
        dataTable table = new dataTable(
                new ConnectionController(
                        "customer_orders",
                        "root",
                        "root"),
                "customers");
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel tablePanel = new JPanel(new BorderLayout());
        JPanel tableBottomPadding = new JPanel();
        JSplitPane split = new JSplitPane();
        CustomerDataPanel customer = new CustomerDataPanel();

        split.setResizeWeight(1);
        this.add(split, BorderLayout.CENTER);

        tablePanel.add(new SearchPanel(table), BorderLayout.NORTH);
        scrollPane.setBorder(new EmptyBorder(1,1,1,1));
        tablePanel.add(scrollPane, BorderLayout.CENTER);
        tablePanel.add(tableBottomPadding, BorderLayout.SOUTH);
        tableBottomPadding.add(new JLabel("Test pad"));
        tableBottomPadding.setBorder(new EmptyBorder(100,0,0,0));
        tablePanel.setMinimumSize(new Dimension(650,0));
        tablePanel.setBorder(new MatteBorder(0,0,0,1, Colors.PRIMARY));
        split.setLeftComponent(tablePanel);

        split.setRightComponent(customer);
    }
}
