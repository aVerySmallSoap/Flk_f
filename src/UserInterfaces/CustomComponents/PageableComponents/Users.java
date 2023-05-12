package UserInterfaces.CustomComponents.PageableComponents;

import UserInterfaces.CustomComponents.Themes.SplitTheme;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Users extends JPanel {
    public static final String NAME = "Users";
    public Users(){
        SplitTheme.setUp();
        this.setName(NAME);
        this.setLayout(new BorderLayout());
        JTable table = new JTable(5,5);
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel testPane = new JPanel();
        JPanel tablePanel = new JPanel(new GridLayout());
        TitledBorder border = new TitledBorder("Customer");
        JSplitPane split = new JSplitPane();

        this.add(split, BorderLayout.CENTER);

        tablePanel.setPreferredSize(new Dimension(500,0));
        tablePanel.add(scrollPane);
        split.setLeftComponent(tablePanel);

        border.setTitlePosition(TitledBorder.TOP);
        testPane.setBorder(border);
        testPane.add(new JButton("Ass"));
        testPane.add(new JButton("Ass"));
        testPane.add(new JButton("Ass"));
        split.setRightComponent(testPane);
    }
}
