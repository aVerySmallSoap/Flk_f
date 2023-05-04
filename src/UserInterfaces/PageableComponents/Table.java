package UserInterfaces.PageableComponents;

import UserInterfaces.CustomComponents.Components.dataTable;

import javax.swing.*;
import java.awt.*;

public class Table extends JPanel {
    public static final String NAME = "Tables";
    public Table(){
        this.setName(NAME);
        this.setLayout(new BorderLayout());
        JPanel TreeLeft = new JPanel();
        JPanel BottomInfo = new JPanel();
        JPanel RightLead = new JPanel();
        dataTable table = new dataTable();
        JScrollPane scrollPane = new JScrollPane(table);

        this.add(TreeLeft, BorderLayout.WEST);
        TreeLeft.add(new JLabel("Insert Table"));
        this.add(BottomInfo, BorderLayout.SOUTH);
        BottomInfo.add(new JLabel("Testing"));
        this.add(RightLead, BorderLayout.EAST);
        RightLead.add(new JLabel("Testing"));
        this.add(scrollPane, BorderLayout.CENTER);
    }
}
