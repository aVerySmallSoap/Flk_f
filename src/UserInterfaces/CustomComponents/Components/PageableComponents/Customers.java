package UserInterfaces.CustomComponents.Components.PageableComponents;

import UserInterfaces.CustomComponents.Colors;
import UserInterfaces.CustomComponents.Components.CustomPanels.CustomerDataPanel;
import UserInterfaces.CustomComponents.Components.CustomPanels.SearchPanel;
import UserInterfaces.CustomComponents.Themes.SplitTheme;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Customers extends JPanel {
    public static final String NAME = "Customers";
    public Customers(){
        SplitTheme.setUp();
        this.setName(NAME);
        this.setLayout(new BorderLayout());
        JTable table = new JTable(5,5);
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel tablePanel = new JPanel(new BorderLayout());
        JPanel tableBottomPadding = new JPanel();
        JSplitPane split = new JSplitPane();
        CustomerDataPanel customer = new CustomerDataPanel();

        split.setResizeWeight(1);
        this.add(split, BorderLayout.CENTER);

        tablePanel.add(new SearchPanel(), BorderLayout.NORTH);
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
