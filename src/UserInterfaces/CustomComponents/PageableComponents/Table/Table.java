package UserInterfaces.CustomComponents.PageableComponents.Table;

import UserInterfaces.CustomComponents.Colors;
import UserInterfaces.CustomComponents.Components.CustomPanels.SearchPanel;
import UserInterfaces.CustomComponents.Components.dataTable;
import UserInterfaces.CustomComponents.PageableComponents.Table.Components.InsertTable;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Table extends JPanel {
    public static final String NAME = "Tables";
    public static dataTable table;
    public Table(){
        this.setName(NAME);
        this.setLayout(new BorderLayout());
        JPanel TreeLeft = new JPanel();
        JPanel BottomInfo = new JPanel();
        JPanel RightLead = new JPanel();
        JScrollPane scrollPane = new JScrollPane(table);
        SearchPanel searchPanel = new SearchPanel();

        this.add(TreeLeft, BorderLayout.WEST);
        TreeLeft.add(new InsertTable());
        TreeLeft.setBorder(new MatteBorder(0,0,0,1, Colors.PRIMARY));
        this.add(BottomInfo, BorderLayout.SOUTH);
        BottomInfo.add(new JLabel("Testing"));
        BottomInfo.setBorder(new MatteBorder(1,0,0,0, Colors.PRIMARY));
        this.add(RightLead, BorderLayout.EAST);
        RightLead.add(new JLabel("Testing"));
        RightLead.setBorder(new MatteBorder(0,1,0,0, Colors.PRIMARY));
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(searchPanel, BorderLayout.NORTH);
    }
}
